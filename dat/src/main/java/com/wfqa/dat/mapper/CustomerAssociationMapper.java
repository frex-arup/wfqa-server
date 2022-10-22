package com.wfqa.dat.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.wfqa.common.entity.HMapper;
import com.wfqa.dat.dto.CustomerAssociationDTO;
import com.wfqa.dat.entity.CustomerAssociation;

@Component
public class CustomerAssociationMapper implements HMapper<CustomerAssociationDTO, CustomerAssociation> {
	
	@Override
	 public CustomerAssociationDTO toDTO(CustomerAssociation u) {
		 CustomerAssociationDTO customerAssociationDTO = new CustomerAssociationDTO();
	        BeanUtils.copyProperties(u, customerAssociationDTO);
	        return customerAssociationDTO;
	    }

	    @Override
	    public CustomerAssociation toEntity(CustomerAssociationDTO t) {
	    	CustomerAssociation customerAssociation = new CustomerAssociation();
	        BeanUtils.copyProperties(t, customerAssociation);
	        return customerAssociation;
	    }
}
