package com.wfqa.common.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class Audit {
	
//	  implements Persistable<String>
	
	@Column(name = "created_userid", length = 15)
	@CreatedBy
	private String createdUserid;
	
	@Column(name = "last_updated_userid", length = 15)
	@LastModifiedBy
	private String lastUpdatedUserid;
	
	@Column(name = "created_date")
	@CreatedDate
	private LocalDateTime createdDate;
	
	@Column(name = "last_updated_date")
	@LastModifiedDate
	private LocalDateTime lastUpdatedDate;

//	@Override
//	public String getId() {
//		return null;
//	}
//
//	@Override
//	@JsonIgnore
//	public boolean isNew() {
//		if (getId() != null)
//			return false;
//
//		return true;
//	}
//	

}
