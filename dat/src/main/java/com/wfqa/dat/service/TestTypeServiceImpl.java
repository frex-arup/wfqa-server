package com.wfqa.dat.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfqa.dat.entity.TestType;
import com.wfqa.dat.repository.TestTypeRepository;

@Service
public class TestTypeServiceImpl implements ITestTypeService{
	
	@Autowired
	private TestTypeRepository testTypeRepository;

	@Override
	public String getBundleTypeById(Long id) {
		Optional<TestType> testType = testTypeRepository.findById( id);
		if (testType.isPresent()) {
			return testType.get().getBundleType();
		} else {
			return null;
		}
	}

	@Override
	public String getTestTypeById(Long id) {
		Optional<TestType> testType = testTypeRepository.findById(id);
		if (testType.isPresent()) {
			return testType.get().getTestType();
		} else {
			return null;
		}
	}

	@Override
	public String getCustomerTestTypeById(Long id) {
		Optional<TestType> testType = testTypeRepository.findById(id);
		if (testType.isPresent()) {
			return testType.get().getCustomerTestName();
		} else {
			return null;
		}
	}

	@Override
	public Long getTestIdByTypeAndName(String type, String name) {
		Optional<TestType> testType = testTypeRepository.findByTestTypeAndTestName(type, name);
		if (testType.isPresent()) {
			return testType.get().getTestTypeId();
		} else {
			return null;
		}
	}

	@Override
	public TestType getTestType(Long id) {
		Optional<TestType> testType = testTypeRepository.findById(id);
		if (testType.isPresent()) {
			return testType.get();
		} else {
			return null;
		}
	}

	@Override
	public List<String> getAllTestType() {
		List<String> testTypes = testTypeRepository.getTestTypes();
		return testTypes;
	}

}
