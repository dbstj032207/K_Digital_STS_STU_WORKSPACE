<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>회원가입 화면 입니다.</h1>
		<jsp:include page="common/top.jsp" flush="ture"></jsp:include><br>
		<jsp:include page="common/menu.jsp" flush="ture"></jsp:include>	
		<hr>
		<jsp:include page="member/memberForm.jsp" flush="true"></jsp:include>
	</body>
</html>