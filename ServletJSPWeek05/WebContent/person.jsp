<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="_03.jspaction.Person" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Person personObj=(Person) request.getAttribute("liste");
%>
<%--program deploy edildikten sonra /persons servleti çalıştırılır.
person.jsp sayfası çalıştırılmaz. --%>
<h3>Person Data</h3>
<%=personObj.getName() %></p>
<%=personObj.getSurname() %></p>
<%=personObj.getAge() %></p>
</body>
</html>