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
		logined.jsp<br>
		${sessionScope.login.userid }<br>
		${sessionScope.login.passwd }<br>
		<hr>
		${loginDTO.userid }<br>
		${loginDTO.passwd }<br>
		<hr>
		<% 	LoginDTO dto = (LoginDTO)session.getAttribute("login");
			out.print(dto + "<br>");
		%>
		<hr>
		<a href="logout" >�α׾ƿ�</a>
	</body>
</html>