package com.wfqa.dat.mapper;

import org.springframework.stereotype.Component;

import com.wfqa.common.entity.HMapper;
import com.wfqa.dat.dto.UserDTO;
import com.wfqa.dat.entity.User;


@Component
public class UserMapper implements HMapper<UserDTO, User> {

	@Override
	public UserDTO toDTO(User u) {
	    UserDTO userDTO = new UserDTO();
		userDTO.setLoginUserId(u.getLoginUserId());
		userDTO.setRole(u.getRole());
		userDTO.setPasswordHash(u.getPasswordHash());
		userDTO.setStatus(u.getStatus());
		return userDTO;
	}

	@Override
	public User toEntity(UserDTO t) {
	    User user = new User();
		user.setLoginUserId(t.getLoginUserId());
		user.setRole(t.getRole());
		user.setPasswordHash(t.getPasswordHash());
		user.setStatus(t.getStatus());
		return user;
	}

}
