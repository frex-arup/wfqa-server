package com.wfqa.dat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfqa.dat.dto.SiteDTO;
import com.wfqa.dat.entity.Site;
import com.wfqa.dat.mapper.SiteMapper;
import com.wfqa.dat.repository.SiteRepository;

@Service
public class SiteServiceImpl implements ISiteService {
    
    @Autowired
    private SiteRepository siteRepository;
    
    @Autowired
    private SiteMapper siteMapper;

    @Override
    public SiteDTO getSiteByIdAndTypeAndStatus(Long id, String type, String status) {
        Optional<Site> site = siteRepository.findByIdAndTypeAndStatus(id, type, status);
        if (site.isPresent()) {
            SiteDTO siteDTO = new SiteDTO();
            siteDTO = siteMapper.toDTO(site.get());
            return siteDTO;
        }
        return null;
    }

    @Override
    public List<SiteDTO> getAllSitesByTypeAndStatus(String type, String status) {
        List<Site> siteList = siteRepository.findByTypeAndStatus(type, status);
        List<SiteDTO> siteDtoList = new ArrayList<>();
        siteList.forEach(site -> {
            siteDtoList.add(siteMapper.toDTO(site));
        });
        return siteDtoList;
    }

}
