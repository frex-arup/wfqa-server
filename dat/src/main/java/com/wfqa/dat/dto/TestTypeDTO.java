package com.wfqa.dat.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class TestTypeDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
	private Long               testTypeId;
    private String             testType;
    private String             testName;
    private String             entityType;
    private String             customerTestName;
    private String             bundleType;
    private String             simsTest;
    private String             vendorServiceCode;
    private String             specimenType;
    
}
