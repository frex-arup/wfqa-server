package com.wfqa.dat.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.wfqa.common.entity.HMapper;
import com.wfqa.dat.dto.UserDTO;
import com.wfqa.dat.entity.User;


@Component
public class UserMapper implements HMapper<UserDTO, User> {

	@Override
	public UserDTO toDTO(User u) {
	    UserDTO userDTO = new UserDTO();
	    BeanUtils.copyProperties(u, userDTO);
		return userDTO;
	}

	@Override
	public User toEntity(UserDTO t) {
	    User user = new User();
	    BeanUtils.copyProperties(t, user);
		return user;
	}

}
