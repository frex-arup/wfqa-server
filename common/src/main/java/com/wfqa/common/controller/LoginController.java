package com.wfqa.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wfqa.common.dto.ApiResponse;
import com.wfqa.common.dto.DATUserDTO;
import com.wfqa.common.entity.DAT_User;
import com.wfqa.common.mapper.UserMapper;
import com.wfqa.common.repository.UserRepository;
import com.wfqa.common.service.UserDetailsServiceImpl;

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
	public ApiResponse<DATUserDTO> login(@RequestBody DATUserDTO userDTO) {

		UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(userDTO.getLoginUserId());
		ApiResponse<DATUserDTO> response = new ApiResponse<DATUserDTO>();
		
		DAT_User user = userRepository.findByLoginUserIdAndStatus(userDetails.getUsername(), "A").orElse(new DAT_User());
		try {
			DATUserDTO dto = userMapper.toDTO(user);
			response.setData(dto);
			response.setSucessCode(1000);
			return response;
		}catch (Exception e) {
			response.setData(userMapper.toDTO(user));
			return response;
		}
		
	}

}
