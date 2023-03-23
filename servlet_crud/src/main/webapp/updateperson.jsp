<%@page import="com.jsp.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Person</title>
</head>
<body>
<%Person person=(Person)request.getAttribute("person"); %>

	<form action="update" method="post">
	Id: <input type="text" name="id" value="<%= person.getId() %>" readonly>
	Name: <input type="text" name="name" value="<%= person.getName()%>">
	Age:<input type="number" name="age" value="<%= person.getAge()%>">
	Email:<input type="email" name="email" value="<%= person.getEmail()%>">
	Password: <input type="password" name="password" value="<%= person.getPassword()%>">
	<input type="submit" value="update" >
	</form>

</body>
</html>