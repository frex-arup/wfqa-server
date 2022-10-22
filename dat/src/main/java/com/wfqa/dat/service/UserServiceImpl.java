package com.wfqa.dat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.wfqa.dat.entity.User;
import com.wfqa.dat.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsersByStatus(String status) {
	    List<User> allUsers = userRepository.findByStatus(status);
	    allUsers.forEach(u-> u.setPasswordHash(BCrypt.hashpw(u.getPasswordHash(), BCrypt.gensalt())));
	    userRepository.saveAll(allUsers);
		return allUsers;
		
	}

	@Override
	public User getUsersByLoginUserId(String loginUserId, String status) {
		User user = userRepository.findByLoginUserIdIgnoreCaseAndStatus("ranes", "A").get();
		user.setAllowPoctResultEntry(!user.isAllowPoctResultEntry());
		userRepository.save(user);
		return userRepository.findByLoginUserIdIgnoreCaseAndStatus(loginUserId, status).orElse(null);
	}

}
