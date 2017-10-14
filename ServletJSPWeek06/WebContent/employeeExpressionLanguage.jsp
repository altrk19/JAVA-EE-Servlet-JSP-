<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${employeeAttribute.id}</p>
<p>${employeeAttribute.name}</p>
<p>${employeeAttribute.salary}</p>
<p>${employeeAttribute.department.id}</p>
<p>${employeeAttribute.department.name}</p>

<h2>Bracket Kullanimi</h2>
<p>${employeeAttribute['id']} </p>
<p>${employeeAttribute['name']} </p>
<p>${employeeAttribute['salary']} </p>
<p>${employeeAttribute['department']['id']} </p>
<p>${employeeAttribute['department']['name']} </p>
</body>
</html>