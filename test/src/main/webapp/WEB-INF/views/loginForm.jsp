<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="login" method="Post">
			post���<br>
			���̵�:<input type="text" name="userid"><br>
			��й�ȣ:<input type="text" name="passed"><br>
			<input type="submit" value="�α���">
		</form>
		<hr>
		<form action="login" method="get">
			get���<br>
			���̵�:<input type="text" name="userid"><br>
			��й�ȣ:<input type="text" name="passed"><br>
			<input type="submit" value="�α���">
		</form>
	</body>
</html>