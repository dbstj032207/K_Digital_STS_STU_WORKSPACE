<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		main2.jsp
		<hr>
		${address}
		${username}
		<hr>
		<% 	String address = (String) request.getAttribute("address");
			String username = (String) request.getAttribute("username");%>
		<%= address %>
		<%= username %>	
	</body>
</html>