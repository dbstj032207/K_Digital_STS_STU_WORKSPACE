<%@page import="java.util.List"%>
<%@page import="com.dto.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<hr>
		추가
		<form action="add" method="get">
		deptno: <input type="text" name="deptno"><br>
		dname: <input type="text" name="dname"><br>
		loc: <input type="text" name="loc"><br>
		<input type="submit" value="추가">
		</form>
		<hr>
		삭제: <a href="del?deptno=51">삭제하기</a>
		<hr>
		수정
		<form action="update" method="get">
		deptno: <input type="text" name="deptno"><br>
		dname: <input type="text" name="dname"><br>
		loc: <input type="text" name="loc"><br>
		<input type="submit" value="수정">
		</form>
	</body>
</html>