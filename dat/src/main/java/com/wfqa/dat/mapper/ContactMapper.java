package com.wfqa.dat.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.wfqa.common.entity.HMapper;
import com.wfqa.dat.dto.ContactDTO;
import com.wfqa.dat.entity.Contact;

@Component
public class ContactMapper implements HMapper<ContactDTO, Contact> {

    @Override
    public ContactDTO toDTO(Contact u) {
        ContactDTO contactDTO = new ContactDTO();
        BeanUtils.copyProperties(u, contactDTO);
        return contactDTO;
    }

    @Override
    public Contact toEntity(ContactDTO t) {
        Contact contact = new Contact();
        BeanUtils.copyProperties(t, contact);
        return contact;
    }

}
