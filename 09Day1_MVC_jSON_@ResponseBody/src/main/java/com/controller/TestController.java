package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Login;

@Controller
public class TestController {
	//servlet-context.xml에서 /main처리함 <view-controller path="/" view-name="main"/>

	 @RequestMapping("/ddd")
	 @ResponseBody
	  public   String ddd() { 		 
		  return "ok";  //ok.jsp 가 아닌  @ResponseBody 가 있을 경우  ok 문자열을 결과로 리턴 
	  }
	 
	 
	 
	 
	  @RequestMapping("/aaa")
	  public @ResponseBody  Login aaa() { 
		  System.out.println("aaa()함수 호출");
		  Login login= new Login();
		  login.setUserid("홍길동");
		  login.setPasswd("1234");
		  return login;  
	  }
	 
		
	  @RequestMapping("/bbb")
	  public @ResponseBody  ArrayList<Login> bbb() { 
		 ArrayList<Login> list= new ArrayList<Login>();
		 list.add(new Login("홍길동1", "10"));
		 list.add(new Login("홍길동2", "20"));
		 list.add(new Login("홍길동3", "30"));
		 list.add(new Login("홍길동1", "40"));		
		  return list;  
	  }
	 
	  @RequestMapping("/ccc")	  
	  public @ResponseBody HashMap<String, ArrayList<Login>> ccc(){
		  HashMap<String, ArrayList<Login>> map=
				  new HashMap<String, ArrayList<Login>>();
		  ArrayList<Login> list= new ArrayList<Login>();
		  list.add(new Login("홍길동1", "10"));
		  list.add(new Login("홍길동2", "20"));
		  list.add(new Login("홍길동3", "30"));
		  ArrayList<Login> list2= new ArrayList<Login>();
		  list2.add(new Login("유관순1", "10"));
		  list2.add(new Login("유관순2", "20"));
		  list2.add(new Login("유관순3", "30"));
		  map.put("one", list);
		  map.put("two", list2);
		 return map;
		  
		  
	  }

}
