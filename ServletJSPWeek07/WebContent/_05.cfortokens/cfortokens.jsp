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
    <c:forTokens items="value1 value2 value3 value4" delims=" " var="value">
        <c:out value="${value}" />
    </c:forTokens>

    <br>

    <c:forTokens items="value1,value2,value3,value4" delims="," var="value">
        <c:out value="${value}" />
    </c:forTokens>
    
    <br>
    
	<c:forTokens items="value1:value2;value3:value4" delims=", : ;" var="value">
        <c:out value="${value}" />
    </c:forTokens>
</body>
</html>