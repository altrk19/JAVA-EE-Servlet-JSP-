<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="result" scope="request" value="70"/>

<c:if test="${result > 50}">
   <p>You pass exam ! : <c:out value="${result}"/><p>
</c:if>


<c:set var="result2" scope="request" value="40"/>

<c:if test="${result2 lt 50}">
   <p>You failed ! ! : <c:out value="${result2}"/><p>
</c:if>

<!-- Aynı örnegi Java Scriptlet ile yapalım -->

<%
String result =(String)request.getAttribute("result");
if(Integer.parseInt(result)>75){
	
%>
	<p>sinavi gectin (java kontrolu)</p>
<% } %>


<c:set var="myName" scope="request" value="Levent"/>

<c:if test="${myName eq 'Levent'}">
   <p>Hello(eq) , ${myName}<p>
</c:if>

<c:if test="${myName =='Levent'}">
   <p>Hello(==) , ${myName}<p>
</c:if>
</body>
</html>