<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="saveperson" method="post">
	<label>Person Name </label><input type="text" placeholder="Enter person name" name="name"><br><br>
	<label>Person Age </label><input type="number" placeholder="Enter person age" name="age"><br><br>
	<label>Person Email </label><input type="email" placeholder="Enter person email" name="email"><br><br>
	<label>Person Password </label><input type="password" placeholder="Enter person password" name="password"><br><br>
	<input type="submit" value="Register">
	</form>
</center>
</body>
</html>