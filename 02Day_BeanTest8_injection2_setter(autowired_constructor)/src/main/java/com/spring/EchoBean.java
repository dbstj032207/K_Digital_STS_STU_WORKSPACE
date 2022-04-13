package com.spring;

import java.util.List;
import java.util.Map;

public class EchoBean {
	
	private List valueList;
	private AnotherBean anotherBean;
	
	public String sayEcho() {
		return "Hello";
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EchoBean(AnotherBean anotherBean) {
		super();
		System.out.println("EchoBean(AnotherBean anotherBean) 생성자 호출");
		this.anotherBean = anotherBean;
	}

	public EchoBean(List valueList, AnotherBean anotherBean) {
		super();
		this.valueList = valueList;
		this.anotherBean = anotherBean;
	}

	public List getValueList() {
		return valueList;
	}

	public void setValueList(List valueList) {
		this.valueList = valueList;
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

	@Override
	public String toString() {
		return "EchoBean [valueList=" + valueList + ", anotherBean=" + anotherBean + "]";
	}

	

}
