<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="liste" class="_03.jspaction.Person" scope="request"/>

<p> <jsp:getProperty property="name" name="liste"/> </p>
<p> <jsp:getProperty property="surname" name="liste"/> </p>
<p> <jsp:getProperty property="age" name="liste"/> </p>
</body>
</html>

