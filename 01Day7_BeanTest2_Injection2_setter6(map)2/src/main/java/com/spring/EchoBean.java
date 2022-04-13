package com.spring;

import java.util.List;
import java.util.Map;

public class EchoBean {
	
	Map<String, AnotherBean> map;
	
	public String sayEcho() {
		return "Hello";
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setMap(Map<String, AnotherBean> map) {
		this.map = map;
	}

	public Map<String, AnotherBean> getMap() {
		return map;
	}

}
