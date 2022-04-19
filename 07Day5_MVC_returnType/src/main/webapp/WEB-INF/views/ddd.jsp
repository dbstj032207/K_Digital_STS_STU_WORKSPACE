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
		login3.jsp<br>
		<hr>
		id: ${xxx.userid }<br>
		passwd: ${xxx.passwd }<br>
		<% 	LoginDTO dto = (LoginDTO)request.getAttribute("xxx");
			String name = dto.getUserid();
			out.print("req.getAttribute: " + name + "<br>");
		%>
		<hr>
	</body>
</html>