package com.dto;

import java.util.Arrays;

public class LoginDTO {
	
	private String name;

	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "LoginDTO [name=" + name + "]";
	}

}
