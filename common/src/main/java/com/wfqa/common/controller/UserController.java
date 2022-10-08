package com.wfqa.common.controller;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wfqa.common.entity.DAT_User;
import com.wfqa.common.service.IUserService;

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
            notes = "Gets all active users present inside dat.dat_user table.")
	public List<DAT_User> getUsers(
			@ApiParam(value = "status of user", allowableValues = "A, C, I")
			@RequestParam(value = "status", required = true) String status) {
		
		return userService.getUsersByStatus(status);
	}
}
