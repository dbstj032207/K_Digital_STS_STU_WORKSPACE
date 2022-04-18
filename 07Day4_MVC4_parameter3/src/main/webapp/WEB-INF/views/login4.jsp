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
		login4.jsp<br>
		<hr>
		id: ${login.userid }<br>
		passwd: ${login.passwd }<br>
		<% 	LoginDTO dto = (LoginDTO)request.getAttribute("login");
			String name = dto.getUserid();
			out.print("req.getAttribute: " + name + "<br>");
		%>
		<hr>
		4번: ${dto.userid }
	</body>
</html>