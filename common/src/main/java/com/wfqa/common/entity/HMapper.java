package com.wfqa.common.entity;

public interface HMapper<DTO, ENTITY> {
	DTO toDTO(ENTITY u);
	ENTITY toEntity(DTO t);
}
