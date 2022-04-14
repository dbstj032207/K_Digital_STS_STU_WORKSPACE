package com.service;

import org.springframework.stereotype.Component;

@Component("xxx") // id 지정
public class DeptService2 {
	public String getService() {
		return "DeptService.getService() 호출됨";
	}
}
