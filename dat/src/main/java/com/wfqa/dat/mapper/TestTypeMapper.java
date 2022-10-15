package com.wfqa.dat.mapper;

import org.springframework.stereotype.Component;

import com.wfqa.common.entity.HMapper;
import com.wfqa.dat.dto.TestTypeDTO;
import com.wfqa.dat.dto.UserDTO;
import com.wfqa.dat.entity.TestType;
import com.wfqa.dat.entity.User;

@Component
public class TestTypeMapper implements HMapper<TestTypeDTO, TestType>{
	
	@Override
	public TestTypeDTO toDTO(TestType u) {
		TestTypeDTO testTypeDTO = new TestTypeDTO();
		
		testTypeDTO.setTestTypeId(u.getTestTypeId());
		testTypeDTO.setTestName(u.getTestName());
		testTypeDTO.setTestType(u.getTestType());
		testTypeDTO.setEntityType(u.getEntityType());
		testTypeDTO.setBundleType(u.getBundleType());
		testTypeDTO.setCustomerTestName(u.getCustomerTestName());
		testTypeDTO.setVendorServiceCode(u.getVendorServiceCode());
		testTypeDTO.setSimsTest(u.getSimsTest());
		testTypeDTO.setSpecimenType(u.getSpecimenType());
		
		return testTypeDTO;
	}

	@Override
	public TestType toEntity(TestTypeDTO t) {
		TestType testType = new TestType();
		
		testType.setTestTypeId(t.getTestTypeId());
		testType.setTestName(t.getTestName());
		testType.setTestType(t.getTestType());
		testType.setEntityType(t.getEntityType());
		testType.setBundleType(t.getBundleType());
		testType.setCustomerTestName(t.getCustomerTestName());
		testType.setVendorServiceCode(t.getVendorServiceCode());
		testType.setSimsTest(t.isSimsTest());
		testType.setSpecimenType(t.getSpecimenType());
		
		return  testType;
	}

}
