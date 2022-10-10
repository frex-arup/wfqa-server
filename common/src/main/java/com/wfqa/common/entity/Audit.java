package com.wfqa.common.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Audit {

	@Column(name = "created_userid", length = 15, updatable = false)
	@CreatedBy
	private String createdUserid;

	@Column(name = "last_updated_userid", length = 15)
	@LastModifiedBy
	private String lastUpdatedUserid;

	@Column(name = "created_date", updatable = false)
	@CreatedDate
	private LocalDateTime createdDate;

	@Column(name = "last_updated_date")
	@LastModifiedDate
	private LocalDateTime lastUpdatedDate;

}
