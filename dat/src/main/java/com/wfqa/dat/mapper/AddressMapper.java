package com.wfqa.dat.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wfqa.common.entity.HMapper;
import com.wfqa.dat.dto.AddressDTO;
import com.wfqa.dat.entity.Address;

@Component
public class AddressMapper implements HMapper<AddressDTO, Address> {
    
    @Autowired
    private ContactMapper contactMapper;

    @Override
    public AddressDTO toDTO(Address u) {
        AddressDTO addressDTO = new AddressDTO();
        BeanUtils.copyProperties(u, addressDTO);
        addressDTO.setContact(contactMapper.toDTO(u.getContact()));
        return addressDTO;
    }

    @Override
    public Address toEntity(AddressDTO t) {
        Address address = new Address();
        BeanUtils.copyProperties(t, address);
        address.setContact(contactMapper.toEntity(t.getContact()));
        return address;
    }

}
