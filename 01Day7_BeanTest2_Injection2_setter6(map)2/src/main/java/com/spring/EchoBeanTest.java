package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean echo = ctx.getBean("echoBean", EchoBean.class);
		
		
		Map<String, AnotherBean> map =  echo.getMap();
		
		Set <String> keys = map.keySet();
		for (String key : keys) {	
			System.out.println(map.get(key).getName() + "\t" + map.get(key).getAge());
		}
		
		System.out.println("===============================");

	}

}
