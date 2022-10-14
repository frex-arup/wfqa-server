package com.wfqa.dat.service;

import java.util.List;

import com.wfqa.dat.dto.SiteDTO;

public interface ISiteService {

    SiteDTO getSiteByIdAndTypeAndStatus(Long id, String type, String status);

    List<SiteDTO> getAllSitesByTypeAndStatus(String type, String status);

}
