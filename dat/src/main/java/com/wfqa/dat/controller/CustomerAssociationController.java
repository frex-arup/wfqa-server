package com.wfqa.dat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wfqa.common.entity.ApiResponse;
import com.wfqa.common.enums.ResponseCode;
import com.wfqa.dat.dto.CustomerAssociationDTO;
import com.wfqa.dat.service.ICustomerAssociationService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/customerAssociation")
public class CustomerAssociationController {
	
	@Autowired
	private ICustomerAssociationService customerAssociation;
	
	@GetMapping("/getCustomerAssociations")
	@ApiOperation(value = "Gets All the subaccpount",
            notes = "Get all subaccount list by id,test type,status")
	public CustomerAssociationDTO getAllSubAccountList(Long id,String status) {
		
		return customerAssociation.getSubAccountList(id,status);
		}
	
	 @GetMapping("/getSubAccountList")
	    @ApiOperation(value = "Gets all sub account list by joining dat.sites and dat.address on mro.dat_customer_association ",notes = "Get all subaccount list by id,test type,status")
	    public ApiResponse<CustomerAssociationDTO> getSiteByIdAndTypeAndStatus(
	            @ApiParam(value = "customerId") @RequestParam(value = "customerId", required = true) Long customerId,
	            @ApiParam(value = "testType") @RequestParam(value = "testType", required = true) String testType,
	            @ApiParam(value = "labId") @RequestParam(value = "labId", required=false) Long labId,
	            @ApiParam(value = "mroId") @RequestParam(value = "mroId", required=false) Long mroId,
	            @ApiParam(value = "cityName") @RequestParam(value = "cityName", required=false) String cityName,
	            @ApiParam(value = "csName") @RequestParam(value = "csName", required=false) String csName,
	            @ApiParam(value = "sortBy") @RequestParam(value = "sortBy") String sortBy) {

	        List<CustomerAssociationDTO> customerAssociationDTO = new ArrayList<>();
	        ApiResponse<CustomerAssociationDTO> response = new ApiResponse<>();
	        customerAssociationDTO = customerAssociation.getSubAccountList(customerId, testType, labId, mroId, cityName, csName, sortBy);
	        response.setDatas(customerAssociationDTO);
	        response.setSucessCode(ResponseCode.FETCHED_SUCCESSFULLY.value());
	        return response;
	    }

}
