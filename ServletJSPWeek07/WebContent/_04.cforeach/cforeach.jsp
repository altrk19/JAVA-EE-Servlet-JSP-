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

<c:forEach var="x" begin="1" end="5">
       <c:out value="${x}"/> 
</c:forEach>
<br>
<c:forEach var="y" begin="5" end="15" step="5">
       <c:out value="${y}"/>
</c:forEach>
<br>
<h1>ARRAY</h1>
<%
    int[] numbers = { 5, 10, 15, 20, 25, 30 };
    request.setAttribute("numbersAttribute", numbers);
%>

<c:forEach var="number" items="${numbersAttribute}">
     <c:out value="${number}" />
</c:forEach>
<br>
<h1>LIST</h1>
<%
	java.util.List<String> myList = new java.util.ArrayList<String>();
	myList.add("element1");
	myList.add("element2");
        
	request.setAttribute("myListAttribute", myList);
%>

<c:forEach var="element" items="${myListAttribute}">
	<c:out value="${element}" />
</c:forEach>
<br>

<h1>MAP</h1>
<%
	java.util.Map<String, String> myMap = new java.util.HashMap<String, String>();
	myMap.put("key1", "value1");
	myMap.put("key2", "value2");
	myMap.put("key3", "value3");

	request.setAttribute("myMapAttribute", myMap);
%>

<c:forEach var="entry" items="${myMapAttribute}">
	<c:out value="${entry.key}" />
	<c:out value="${entry.value}" /><br>
</c:forEach>
<br>


</body>
</html>