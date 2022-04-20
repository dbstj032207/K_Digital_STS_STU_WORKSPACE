<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#get").on("click", function() {
			$.ajax({
				url:"board",
				type:"get",
				datatype:"text",
				success: function(data, status, xhr) {
					console.log(data, "success");
				},
				error: function(xhr, status, error) {
					console.log(error);				
				}				
			});//end ajax
		});//end get
		
		$("#post").on("click", function() {
			$.ajax({
				url:"board",
				type:"post",
				datatype:"text",
				success: function(data, status, xhr) {
					console.log(data, "success");
				},
				error: function(xhr, status, error) {
					console.log(error);				
				}				
			});//end ajax
		});//end post
		
		$("#put").on("click", function() {
			$.ajax({
				url:"board",
				type:"put",
				datatype:"text",
				success: function(data, status, xhr) {
					console.log(data, "success");
				},
				error: function(xhr, status, error) {
					console.log(error);				
				}				
			});//end ajax
		});//end get
		
		$("delete").on("click", function() {
			$.ajax({
				url:"board",
				type:"delete",
				datatype:"text",
				success: function(data, status, xhr) {
					console.log(data, "success");
				},
				error: function(xhr, status, error) {
					console.log(error);				
				}				
			});//end ajax
		});//end get
		
	});

</script>
</head>
<body>
	main.jsp<br>
	<button id="get">get</button><br>
	<button id="post">post</button><br>
	<button id="put">put</button><br>
	<button id="delete">delete</button><br>
</body>
</html>