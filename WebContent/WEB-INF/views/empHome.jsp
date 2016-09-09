<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
Details of employees
<br>

<a href="http://localhost:8080/SpringWebApp/register">Registeration</a><br><br>
<a href="http://localhost:8080/SpringWebApp/Employee1?age=20">Employee 1</a><br> <!-- Employee1 is path parameter -->
<a href="http://localhost:8080/SpringWebApp/Employee2?age=17">Employee 2</a><br> <!-- ?age=17 is request parameter. -->
<a href="http://localhost:8080/SpringWebApp/Employee3?age=18">Employee 3</a><br> <!-- Request parameter can be combined using & symbol -->
</body>
</html>