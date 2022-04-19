<%@page import="java.util.ArrayList"%>
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
		${yyy }<br>
		<hr>
		<% 	ArrayList<String> list = (ArrayList<String>)request.getAttribute("yyy");
			out.print(list + "<br>");
		%>
		<hr>
	</body>
</html>