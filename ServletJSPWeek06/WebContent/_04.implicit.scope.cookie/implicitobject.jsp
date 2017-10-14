<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${employee.name } <br>
	${requestScope.employee.name } <br>
	${sessionScope.employee.name } <br>
	

	${str} <br> 
	${requestScope.str} <br>
	${sessionScope.str} <br>
	${applicationScope.str } <br>
    ${cookie.userName.value }<br>
    
    
    <%=request.getHeader("host") %><br>
    <!-- ile aşağıdaki Expression Language ifadesi aynı çıktıyı verir -->
    ${header["host"] }<br>
    <!-- veya  -->
    ${header.host}<br><br>
    
    
    <%=request.getMethod() %> <br><!-- kullanılan metdo gösterir. doGet kullandık. -->
    <!-- ile aşağıdaki Expression Language ifadesi aynı çıktıyı verir -->
    ${pageContext.request.method}
    
    <!--  ${request.method } çalışmaz.
  
    request adinda Expression Language’e ait bir implicit object yoktur ! request adinda JSP implicit object vardir.
	
	JSP implicit object ile Expression Language implicit object’ler pageContext haric ayni degildir.
	
	requestScope adinda Expression Language’e ait bir implicit object vardir.
	
	requestScope , request scope attribute’leri tutan Map’tir . requestScope objesi request objesinin kendisi degildir. requestScope request attribute objelerine ulasabiliriz , request properties’lere ulasamayiz.
	
	pageContext EL implicit objesi araciligiyla request property degerine sonrasinda ise method property degerine ulasabiliriz.
     -->
</body>
</html>