<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<body>
<font color="green">${smsg}</font>
<h1>Contact Form</h1>
<form:form action="/save" method="post" modelAttribute="phoneBookObj">
<table>
<tr>
<td>Name:</td><td><form:input path="name"/></td></tr>
<tr>
<td>Email:</td><td><form:input path="email"/></td></tr>
<tr>
<td>Phone Number:</td><td><form:input path="phonenumber"/></td>
</tr>
<tr><td><input type="submit"><td></tr>
</table>
</form:form>
</body>
</html>