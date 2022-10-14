package com.wfqa.dat.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wfqa.common.entity.HMapper;
import com.wfqa.dat.dto.SiteDTO;
import com.wfqa.dat.entity.Site;

@Component
public class SiteMapper implements HMapper<SiteDTO, Site> {
    
    @Autowired
    private AddressMapper addressMapper;
    

    @Override
    public SiteDTO toDTO(Site u) {
        SiteDTO siteDTO = new SiteDTO();
        BeanUtils.copyProperties(u, siteDTO);
        siteDTO.setAddress(addressMapper.toDTO(u.getAddress()));
        return siteDTO;
    }

    @Override
    public Site toEntity(SiteDTO t) {
        Site site = new Site();
        BeanUtils.copyProperties(t, site);
        site.setAddress(addressMapper.toEntity(t.getAddress()));
        return site;
    }

}
