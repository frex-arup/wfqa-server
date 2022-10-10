package com.wfqa.common.mapper;

public interface HMapper<DTO, ENTITY> {
	DTO toDTO(ENTITY u);
	ENTITY toEntity(DTO t);
}
