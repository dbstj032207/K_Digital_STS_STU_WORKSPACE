package com.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student {


	private String name;
	private int age;	
	public void getInfo() {
		System.out.println("getInfo()==================");
	}
	//어노테이션 사용 <context:annotationConfg...
	 	@PostConstruct
		public void aaa() {
			System.out.println("init-method.aaa");
		}
	   @PreDestroy
		public void bbb() {
			System.out.println("destroy-method.bbb");
		}
	public Student() {
	System.out.println("기본 생성자 호출");
	}
	
	
 
}
