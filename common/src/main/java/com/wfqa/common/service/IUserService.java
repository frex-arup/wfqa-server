package com.wfqa.common.service;

import java.util.List;

import com.wfqa.common.entity.DAT_User;

public interface IUserService {
	List<DAT_User> getUsersByStatus(String status);

	DAT_User getUsersByLoginUserId(String loginUserId, String status);
}
