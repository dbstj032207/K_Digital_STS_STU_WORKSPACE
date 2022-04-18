<%@page import="com.dto.LoginDTO"%>
<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<% 	String username = (String)request.getAttribute("username");
			String username_p = request.getParameter("username");
		   	String age = (String)request.getAttribute("age");
			LoginDTO dto = (LoginDTO)request.getAttribute("login");   	
		%>
		main2.jsp
		<hr>
		username: <%= username %><br>
		username_p: <%= username_p %><br>
		age: <%= age %><br>
		login: <%= dto %>
		<hr>
		username: ${username}<br>
		age: ${age}<br>
		login: ${login}
		<hr>
		<img alt="aaa" src="resources/images/a.jpg">
	</body>
</html>