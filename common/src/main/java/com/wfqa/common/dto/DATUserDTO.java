package com.wfqa.common.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class DATUserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String loginUserId;
	private String role;
	private String passwordHash;
	private String status;
}
