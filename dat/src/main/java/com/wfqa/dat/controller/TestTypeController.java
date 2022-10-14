package com.wfqa.dat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wfqa.dat.entity.TestType;
import com.wfqa.dat.entity.User;
import com.wfqa.dat.service.ITestTypeService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @author Aruna Ku Dash
 *
 */

@RestController
@RequestMapping("/testTypes")
public class TestTypeController {
	
	@Autowired
	private ITestTypeService testTypeService;
	
	@GetMapping("/getTestType")
	@ApiOperation(value = "Gets test types by id ",
            notes = "Gets complete data of a single record")
	public TestType getTestType(
			@ApiParam(value = "id")
			@RequestParam(value = "id", required = true) Long id) {
		
		return testTypeService.getTestType(id);
	}
	
	@GetMapping("/getTestTypeName")
	@ApiOperation(value = "Gets test type name by id ",
            notes = "Get only test type name of a single record")
	public String getTestTypeById(
			@ApiParam(value = "id")
			@RequestParam(value = "id", required = true) Long id) {
		
		return testTypeService.getTestTypeById(id);
	}
	
	@GetMapping("/getBundleType")
	@ApiOperation(value = "Gets bundle type by id ",
            notes = "Get only bundle type of a single record")
	public String getBundleTypeById(
			@ApiParam(value = "id")
			@RequestParam(value = "id", required = true) Long id) {
		
		return testTypeService.getBundleTypeById(id);
	}
	
	@GetMapping("/getCustomerTestName")
	@ApiOperation(value = "Gets customer test name by id ",
            notes = "Get Customer Test Name through id")
	public String getCustomerTestNameById(
			@ApiParam(value = "id")
			@RequestParam(value = "id", required = true) Long id) {
		
		return testTypeService.getCustomerTestTypeById(id);
	}
	
	
	@GetMapping("/getTestTypeId")
	@ApiOperation(value = "Gets id by name and type",
            notes = "Get the id by Test Name and test type")
	public Long getTestTypeIdByNameAndType(
			@ApiParam(value = "Test Type")
			@RequestParam(value = "testType", required = true) String testType,
			@ApiParam(value = "Test Name", required = true)
			@RequestParam(value = "testName", required = true) String testName) {
		
		return testTypeService.getTestIdByTypeAndName(testType, testName);
	}
	

}
