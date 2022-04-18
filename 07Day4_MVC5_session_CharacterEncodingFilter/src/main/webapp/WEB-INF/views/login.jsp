<%@page import="com.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		login.jsp<br>
		<hr>
		sessionScope.login.userid: ${sessionScope.login.userid }<br>
		sessionScope.login.passwd: ${sessionScope.login.passwd }<br>
		<hr>
		loginDTO.userid: ${loginDTO.userid }<br>
		loginDTO.passwd: ${loginDTO.passwd }<br>
		<% 	LoginDTO dto = (LoginDTO)session.getAttribute("login");
			String name = dto.getUserid();
			out.print("req.getAttribute: " + name + "<br>");
		%>
		<hr>
		<a href="logout" >로그아웃</a>
	</body>
</html>