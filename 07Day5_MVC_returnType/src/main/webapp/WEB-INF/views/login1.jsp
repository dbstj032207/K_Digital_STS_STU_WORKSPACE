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
		login1.jsp<br>
		<hr>
		id: ${loginDTO.userid }<br>
		passwd: ${loginDTO.passwd }<br>
		<% 	LoginDTO dto = (LoginDTO)request.getAttribute("loginDTO");
			String name = dto.getUserid();
			out.print("req.getAttribute: " + name + "<br>");
		%>
		<hr>
		4��: ${dto.userid }
	</body>
</html>