package com.wfqa.dat.entity;


import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.wfqa.common.converter.BooleanToStringConverter;
import com.wfqa.common.entity.Audit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "test_types", schema = "DAT")
@DynamicUpdate
@DynamicInsert
public class TestType extends Audit {
	
	@Id
	@Column(name = "test_type_id")
	private Long testTypeId;
	
	@Column(name = "test_name", length = 100)
	@NotNull
	private String testName;
	
	@Column(name = "test_type", length = 30)
	private String testType;
	
	@Column(name = "entity_type", length = 30)
	private String entityType;
	
	@Column(name = "customer_test_name", length = 100)
	private String customerTestName;
	
	@Column(name = "bundle_type", length = 10)
	private String bundleType;
	
	@Column(name = "sims_test", length = 1)
	@Convert(converter=BooleanToStringConverter.class)
	private Boolean simsTest;
	
	@Column(name = "vendor_service_code", length = 10)
	private String vendorServiceCode;
	
	@Column(name = "specimen_type", length = 20)
	private String specimenType;
	

}
