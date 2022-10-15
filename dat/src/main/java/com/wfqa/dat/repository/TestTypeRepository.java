package com.wfqa.dat.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wfqa.dat.entity.TestType;


@Repository
public interface TestTypeRepository extends JpaRepository<TestType, Long> {
	Optional<TestType> findByTestTypeId(Long testTypeId);
	
	Optional<TestType> findByTestTypeAndTestName(String type, String name);
	@Query("SELECT distinct testType FROM TestType")
	List<String> getTestTypes();
}
