package com.wfqa.dat.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wfqa.dat.entity.CustomerAssociation;

@Repository
public interface CustomerAssociationRepository extends JpaRepository<CustomerAssociation, Long> {
	
	Optional<CustomerAssociation> findByIdAndStatus(Long id,String status);
	
}
