package com.wfqa.common.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ApiResponse<T> {
	List<T> datas = new ArrayList<>();
	T data;
	Integer sucessCode;
	Integer errorCode;
	String errorMessage;
}