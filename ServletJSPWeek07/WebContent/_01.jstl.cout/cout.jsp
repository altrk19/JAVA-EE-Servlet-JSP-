<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>           <!-- biz ekledik -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%="Hello JSP Expression" %>	
	<br>
	
	<!-- c:out JSP Expression gibi calisir, value degerini browserda gosterir. -->
	
	<c:out value="Hello JSTL !" />		
	<br>
	
	<%
		request.setAttribute("name","AliBey");
	%>
	
	<%= request.getAttribute("name") %>
	<br>
	
	<!-- value attribute alaninda expression language kullanabiliriz ! -->
	<c:out value="${name}"/>
	<br>
	
	<!-- default attribute'u eger value null'sa yani ilgili attribute bean vs bulunamadiysa calisir. -->
	
	<c:out value="${noValue}" default="i am default" />
	<br>
	
	<!-- default attribute alanini kullanmak yerine body alaninda da yazabiliriz. -->
	<c:out value="${noValue}" >i am default</c:out>	
	<br>
	
	<!-- hem default attribute hem body alanini yazarsak bu durumda calisma zamaninda hata aliriz. -->
	
	<%--
	<c:out value="${noValue}"  default="i am default" >i am default body</c:out>
	
	 --%>
	 	 
	<%="<b> aliBey </b> is bold tag" %> 	
	<br> 
	
	<c:out value="<b> aliBey </b> is bold tag"/>	
	<br>
	
	<!--  escapeXml varsayilan olarak true dur. -->
	<c:out value="<b> </b> is bold tag" escapeXml="false"/>
</body>
</html>