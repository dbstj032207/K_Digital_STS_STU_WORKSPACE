<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="header" method="post">
			post방식<br>
			아이디:<input type="text" name="userid"><br>
			비밀번호:<input type="text" name="passwd"><br>
			전화번호1:<input type="text" name="phone"><br>
			전화번호2:<input type="text" name="phone"><br>
			checkbox<input type="checkbox" name="chk" value="aa1">aa1<br>
			checkbox<input type="checkbox" name="chk" value="aa12">aa2<br>
			<input type="submit" value="로그인">
		</form>
	</body>
</html>