<%@page import="com.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		error.jsp<br>
		<hr>
		isErrorPage="true" 설정<br>
		<hr>
		<%= exception.getMessage() %><br>
	</body>
</html>