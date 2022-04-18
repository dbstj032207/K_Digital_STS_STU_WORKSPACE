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
		main.jsp
		<hr>
		${list }
		<hr>
		<% ArrayList<String> list = (ArrayList) request.getAttribute("list"); %>
		<%=list %>
	</body>
</html>