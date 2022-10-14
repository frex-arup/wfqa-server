package com.wfqa.dat.service;

import java.util.List;

import com.wfqa.dat.entity.User;

public interface IUserService {
	List<User> getUsersByStatus(String status);

	User getUsersByLoginUserId(String loginUserId, String status);
}
