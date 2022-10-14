package com.wfqa.dat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wfqa.dat.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
