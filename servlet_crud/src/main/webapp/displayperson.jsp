<%@page import="com.jsp.dto.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Person Data</title>
</head>
<body>
<%List<Person> list=(List<Person>)request.getAttribute("list");%>
	<table border="2px"; style="border-collapse: collapse;">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Age</th>
		<th>Email</th>
		<th>Password</th>
		</tr>
	<% for(Person person: list){ %>
		<tr>
		<td><%= person.getId() %></td>
		<td><%= person.getName() %></td>
		<td><%= person.getAge() %></td>
		<td><%=person.getEmail() %></td>
		<td><%= person.getPassword()%></td>
		</tr>
		<%} %>
	</table>
	
	
</body>
</html>