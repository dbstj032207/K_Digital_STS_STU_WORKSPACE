<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<H1>주문 상세 화면입니다.</H1>
		<jsp:include page="common/top.jsp" flush="ture"/><br>
		<jsp:include page="common/menu.jsp" flush="ture"/>	
		<hr>
		<jsp:include page="order/orderDone.jsp" flush="true"></jsp:include>
	</body>
</html>