<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<H1>mypage화면입니다.</H1>
		<jsp:include page="common/top.jsp" flush="ture"/><br>
		<jsp:include page="common/menu.jsp" flush="ture"/>	
		<hr>
		<jsp:include page="member/mypage.jsp" flush="true"></jsp:include>
	</body>
</html>