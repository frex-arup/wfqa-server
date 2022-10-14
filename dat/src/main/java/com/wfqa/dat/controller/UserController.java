package com.wfqa.dat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wfqa.dat.entity.User;
import com.wfqa.dat.service.IUserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @author Arupananda Pal
 * @since October 2022
 * @apiNote This controller contains all the apis that deals with user datas.
 *
 */

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private IUserService userService;

	@GetMapping
	@ApiOperation(value = "Gets all Users (getUsers)",
            notes = "Gets all active users present inside dat.User table.")
	public List<User> getUsers(
			@ApiParam(value = "status of user", allowableValues = "A, C, I")
			@RequestParam(value = "status", required = true) String status) {
		
		return userService.getUsersByStatus(status);
	}
	
	@GetMapping("/get-user-by-un")
	@ApiOperation(value = "Gets user based on loginUserId and status (getUsersByLoginUserId)",
            notes = "Gets all active users present inside dat.User table.")
	public User getUsersByLoginUserId(
			@ApiParam(value = "loginUserId / username")
			@RequestParam(value = "loginUserId", required = true) String loginUserId,
			@ApiParam(value = "status of user", allowableValues = "A, C, I")
			@RequestParam(value = "status", required = true) String status) {
		
		return userService.getUsersByLoginUserId(loginUserId, status);
	}
}
