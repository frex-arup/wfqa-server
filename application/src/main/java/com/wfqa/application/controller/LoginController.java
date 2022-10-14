package com.wfqa.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wfqa.application.service.UserDetailsServiceImpl;
import com.wfqa.common.entity.ApiResponse;
import com.wfqa.dat.dto.UserDTO;
import com.wfqa.dat.entity.User;
import com.wfqa.dat.mapper.UserMapper;
import com.wfqa.dat.repository.UserRepository;

@RestController
@RequestMapping(value = "/api/login")
public class LoginController {
	
	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper userMapper;
	
	@PostMapping
	public ApiResponse<UserDTO> login(@RequestBody UserDTO userDTO) {

		UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(userDTO.getLoginUserId());
		ApiResponse<UserDTO> response = new ApiResponse<UserDTO>();
		
		User user = userRepository.findByLoginUserIdAndStatus(userDetails.getUsername(), "A").orElse(new User());
		try {
			UserDTO dto = userMapper.toDTO(user);
			response.setData(dto);
			response.setSucessCode(1000);
			return response;
		}catch (Exception e) {
			response.setData(userMapper.toDTO(user));
			return response;
		}
		
	}

}
