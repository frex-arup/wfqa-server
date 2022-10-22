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
    
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
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
		
		User user = userRepository.findByLoginUserIdIgnoreCaseAndStatus(userDetails.getUsername(), "A").orElse(new User());
		UserDTO dto = userMapper.toDTO(user);
		dto.setEncryKey(generatePassword(7));
		try {
			response.setData(dto);
			response.setSucessCode(1000);
			return response;
		}catch (Exception e) {
			response.setData(userMapper.toDTO(user));
			return response;
		}
		
	}
	
	/**
     * <tt>generatePassword</tt> is a method used to generate random password
     * 
     * @param count
     * @return
     */
    public static String generatePassword(int count) {
        StringBuilder builder = new StringBuilder();
        int c = count;
        while (c-- != 0) {
            double random = Math.random();
            int character = (int) (random * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

}
