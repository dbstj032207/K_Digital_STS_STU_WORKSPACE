package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;

@Controller
//@RestController  // ResponseBody로  자동 처리됨 
public class TestController {
	  @RequestMapping("/eee")  // @RestController시  @ResponseBody의 삭제 
	  public  @ResponseBody String eee() { 

		  return "hello";  
	  }

	 @RequestMapping("/ddd")//문자열로 데이터를 받게 됨 home.jsp가 아님 
	 public  ResponseEntity<Login> ddd() { 	
		 System.out.println("ddd 호출됨 ");
		 Login login= new Login("윤동주", "20");
		 ResponseEntity<Login> entity=
				 ResponseEntity.status(200).body(login);
		 return entity;  //entity객체에 상태값 body추가 200정상 body에추가 
	 }
	  @RequestMapping("/aaa")  // @RestController시  @ResponseBody의 삭제 
	  public  @ResponseBody Login aaa() { 
		  Login login= new Login();
		  login.setUserid("홍길동");
		  login.setPasswd("1234");
		  return login;  
	  }
	 
		
	  @RequestMapping("/bbb")
	  public  @ResponseBody  ArrayList<Login> bbb() { //@ResponseBody의 삭제 
		 ArrayList<Login> list= new ArrayList<Login>();
		 list.add(new Login("홍길동1", "10"));
		 list.add(new Login("홍길동2", "20"));
		 list.add(new Login("홍길동3", "30"));
		 list.add(new Login("홍길동1", "40"));		
		  return list;  
	  }
	 
	  @RequestMapping("/ccc")	  
	  public @ResponseBody  HashMap<String, ArrayList<Login>> ccc(){//@ResponseBody의 삭제 
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
