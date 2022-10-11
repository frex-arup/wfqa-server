package com.wfqa.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfqa.common.entity.DAT_User;
import com.wfqa.common.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<DAT_User> getUsersByStatus(String status) {
		return userRepository.findByStatus(status);
		
	}

	@Override
	public DAT_User getUsersByLoginUserId(String loginUserId, String status) {
		DAT_User user = userRepository.findByLoginUserIdAndStatus("ranes", "A").get();
		user.setAllowPoctResultEntry(!user.isAllowPoctResultEntry());
		userRepository.save(user);
		return userRepository.findByLoginUserIdAndStatus(loginUserId, status).orElse(null);
	}

}
