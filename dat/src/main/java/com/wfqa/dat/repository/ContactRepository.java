package com.wfqa.dat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wfqa.dat.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>  {

}
