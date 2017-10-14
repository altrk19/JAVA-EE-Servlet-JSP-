<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="employeeAttribute" class="_01.expression.language.Employee" scope="request"/>

<jsp:getProperty property="id" name="employeeAttribute"/>
<jsp:getProperty property="name" name="employeeAttribute"/>
<jsp:getProperty property="salary" name="employeeAttribute"/>
<jsp:getProperty property="department" name="employeeAttribute"/>

<%--jsp:useBean'de sadece 1 derinliğe inebiliyoruz.  --%>
<%-- bizim bu uygulamada 2 tane derinliğe ihtiyacımız var. bu yüzden jsğ expression language kullanalım--%>

<!-- jsp:getProperty property="department.id"                  hata verir bu kod-->

</body>
</html>