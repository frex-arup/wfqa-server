package com.wfqa.dat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wfqa.common.entity.ApiResponse;
import com.wfqa.common.enums.ResponseCode;
import com.wfqa.dat.dto.SiteDTO;
import com.wfqa.dat.service.ISiteService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("api/sites")
public class SiteController {

    @Autowired
    private ISiteService siteService;

    @GetMapping("/get-site-by-id-type")
    @ApiOperation(value = "Gets all active site present inside dat.sites table based on id and type (getSiteByIdAndTypeAndStatus)")
    public ApiResponse<SiteDTO> getSiteByIdAndTypeAndStatus(
            @ApiParam(value = "site id") @RequestParam(value = "id", required = true) Long id,
            @ApiParam(value = "type of site") @RequestParam(value = "type", required = true) String type,
            @ApiParam(value = "status of site", allowableValues = "A, C, I") @RequestParam(value = "status", required = true) String status) {

        SiteDTO siteDTO = new SiteDTO();
        ApiResponse<SiteDTO> response = new ApiResponse<>();
        siteDTO = siteService.getSiteByIdAndTypeAndStatus(id, type, status);
        response.setData(siteDTO);
        response.setSucessCode(ResponseCode.FETCHED_SUCCESSFULLY.value());
        return response;
    }
    
    @GetMapping("/{type}/{status}")
    @ApiOperation(value = "Gets all customers present inside dat.sites table based on type (getSiteByIdAndTypeAndStatus)")
    public ApiResponse<SiteDTO> getAllSitesByTypeAndStatus(
            @ApiParam(value = "type of site") @PathVariable(value = "type", required = true) String type,
            @ApiParam(value = "status of site", allowableValues = "A, C, I") @PathVariable(value = "status", required = true) String status) {

        ApiResponse<SiteDTO> response = new ApiResponse<>();
        response.setDatas(siteService.getAllSitesByTypeAndStatus(type, status));
        response.setSucessCode(ResponseCode.FETCHED_SUCCESSFULLY.value());
        return response;
    }
}
