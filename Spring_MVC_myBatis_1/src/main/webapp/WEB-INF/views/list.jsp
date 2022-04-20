<%@page import="java.util.List"%>
<%@page import="com.dto.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>list.jsp</h1>
		<hr>
		<% List<DeptDTO> list = (List<DeptDTO>)request.getAttribute("list"); %>
		<% for(DeptDTO s : list){ %>
			<%= s %><br>
		<%} %>
		<hr>
		${list}
	</body>
</html>