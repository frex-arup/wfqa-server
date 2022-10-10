package com.wfqa.common.mapper;

import org.springframework.stereotype.Component;

import com.wfqa.common.dto.DATUserDTO;
import com.wfqa.common.entity.DAT_User;


@Component
public class UserMapper implements HMapper<DATUserDTO, DAT_User> {

	@Override
	public DATUserDTO toDTO(DAT_User u) {
		DATUserDTO userDTO = new DATUserDTO();
		userDTO.setLoginUserId(u.getLoginUserId());
		userDTO.setRole(u.getRole());
		userDTO.setPasswordHash(u.getPasswordHash());
		userDTO.setStatus(u.getStatus());
		return userDTO;
	}

	@Override
	public DAT_User toEntity(DATUserDTO t) {
		DAT_User user = new DAT_User();
		user.setLoginUserId(t.getLoginUserId());
		user.setRole(t.getRole());
		user.setPasswordHash(t.getPasswordHash());
		user.setStatus(t.getStatus());
		return user;
	}

}
