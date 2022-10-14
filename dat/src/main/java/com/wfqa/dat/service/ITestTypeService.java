package com.wfqa.dat.service;

import com.wfqa.dat.entity.TestType;

public interface ITestTypeService {
	
	 TestType getTestType(Long id);
	 String getBundleTypeById(Long id);
	 String getTestTypeById(Long id);
	 String getCustomerTestTypeById(Long id);
	 Long getTestIdByTypeAndName(String type,String name);
}
