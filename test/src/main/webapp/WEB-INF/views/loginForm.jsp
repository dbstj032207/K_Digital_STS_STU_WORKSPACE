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
			post방식<br>
			아이디:<input type="text" name="userid"><br>
			비밀번호:<input type="text" name="passed"><br>
			<input type="submit" value="로그인">
		</form>
		<hr>
		<form action="login" method="get">
			get방식<br>
			아이디:<input type="text" name="userid"><br>
			비밀번호:<input type="text" name="passed"><br>
			<input type="submit" value="로그인">
		</form>
	</body>
</html>