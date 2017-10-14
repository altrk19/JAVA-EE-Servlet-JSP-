<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="_01.expression.language.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=((Employee)(request.getAttribute("employeeAttribute"))).getId() %>
<%=((Employee)(request.getAttribute("employeeAttribute"))).getName() %>
<%=((Employee)(request.getAttribute("employeeAttribute"))).getSalary() %>                        <%--HATA YAPMA OLASILIGIMIZ ÇOK FAZLA --%>
<%=((Employee)(request.getAttribute("employeeAttribute"))).getDepartment().getId() %>			 <%--BİZ BUNU İYİLEŞTİRMEK İÇİN jsp:useBean kullanmıstık. --%>
<%=((Employee)(request.getAttribute("employeeAttribute"))).getDepartment().getName() %>          <%--aynı kodu jsp:useBean ile yazalım. --%>
</body>
</html>