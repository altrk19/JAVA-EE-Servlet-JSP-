<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
	request.setAttribute("requestAttribue", "requestValue");
	session.setAttribute("sessionAttribute", "sessionValue");
	application.setAttribute("applicationAttribute", "applicationValue");
	pageContext.setAttribute("pageContextAttribute", "pageContextValue");
	
	out.print("Attribute'ler eklendi. Simdi /attribute2.jsp sayfasina gidin"); //bu örnekte servlet sınıfı kullanılmadı. attributeler jsp de eklendi.
	
	pageContext.setAttribute("key1", "value1",PageContext.SESSION_SCOPE);    //SESSİON'A EKLER
%>
</body>
</html>