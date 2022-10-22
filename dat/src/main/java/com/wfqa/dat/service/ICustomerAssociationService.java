package com.wfqa.dat.service;

import java.util.List;

import com.wfqa.dat.dto.CustomerAssociationDTO;

public interface ICustomerAssociationService {
	
	CustomerAssociationDTO getSubAccountList(Long customerId,String status);
	List<CustomerAssociationDTO> getSubAccountList(long customerId,String testType,Long labId,Long mroId,String cityName,String csName,String sortBy);
}
