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
		<h1>main.jsp</h1>
		<hr>
		1. : ${userid}<br>
		1. : requset.getAttribute : <%=request.getAttribute("userid") %><br>
		2. <%= request.getAttribute("passwd") %><br>
		3. : request.getParameter : <%= request.getParameter("userid") %><br>
	</body>
</html>