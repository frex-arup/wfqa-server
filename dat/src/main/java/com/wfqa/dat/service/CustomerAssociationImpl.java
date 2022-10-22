package com.wfqa.dat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfqa.dat.dao.CustomerAssociationDAO;
import com.wfqa.dat.dto.CustomerAssociationDTO;
import com.wfqa.dat.entity.CustomerAssociation;
import com.wfqa.dat.mapper.CustomerAssociationMapper;
import com.wfqa.dat.repository.CustomerAssociationRepository;

@Service
public class CustomerAssociationImpl implements ICustomerAssociationService {
	
	@Autowired
	private CustomerAssociationRepository customerAssociationRepository;
	@Autowired
	private CustomerAssociationMapper customerAssociationMapper;
	@Autowired
	private CustomerAssociationDAO    customerAssociationDAO;

	@Override
	public CustomerAssociationDTO getSubAccountList(Long customerId, String status) {
		Optional<CustomerAssociation> customerAssociation = customerAssociationRepository.findByIdAndStatus(customerId, status);
		
	        if (customerAssociation.isPresent()) {
	        	CustomerAssociationDTO customerAssociationDTO = new CustomerAssociationDTO();
	        	customerAssociationDTO = customerAssociationMapper.toDTO(customerAssociation.get());
	        	customerAssociationDTO.setSiteDTO(null);
	        	//siteRepo.getSite();
	            return customerAssociationDTO;
	        }
	        return null;
		
	}

	@Override
	public List<CustomerAssociationDTO> getSubAccountList(long customerId, String testType, Long labId, Long mroId,
			String cityName, String csName, String sortBy) {
		List<CustomerAssociation> customerAssociationList =  customerAssociationDAO.getSubAccountList(customerId, testType, labId, mroId, cityName, csName, sortBy);
		List<CustomerAssociation> customerUnionAssociationList =  customerAssociationDAO.getUnionSubAccountList(customerId, testType, labId, mroId, cityName, csName, sortBy); 
		List<CustomerAssociationDTO> customerAssociationDtoList = new ArrayList<>();
		 customerAssociationList.forEach(customerAssociation -> {
			 customerAssociationDtoList.add(customerAssociationMapper.toDTO(customerAssociation));
	        });
			
			customerUnionAssociationList.forEach(customerUnionAssociation -> {
				customerAssociationDtoList.add(customerAssociationMapper.toDTO(customerUnionAssociation));
			});

	        return customerAssociationDtoList;
	}

}
