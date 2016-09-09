<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
Registration Page
<br>
<sf:form modelAttribute="employee" method="POST">
Id : <sf:input path="id"></sf:input><sf:errors path="id"></sf:errors><br><br>
Name : <sf:input path="name"></sf:input><sf:errors path="name"></sf:errors><br><br>
<input type="submit" value="Submit">
</sf:form>
</body>
</html>