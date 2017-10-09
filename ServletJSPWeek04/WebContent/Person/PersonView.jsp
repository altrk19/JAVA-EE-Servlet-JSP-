<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>                        <!-- import etme kodu -->
<%@ page import="_05.request.dispatch.model.Person" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
//bı kısım java kodu


//PersonController.java                       //bu sınıfa
//req.setAttribute("persons",personList);     //bu şekilde tanımlanmış. attributeyi almak için aşağıdaki kod yazılır

List<Person> personList=(List<Person>) request.getAttribute("persons");

//aldıgımız degerleri yazdıralım aşağıda table ile

%>
<table>
	<%       
		for(Person p: personList){
	%>
	<tr>
		<td><%=p.getName() %></td>             <!-- html içerisinde java kodu yazmaya scriptlet  denir -->
		<td><%= p.getSurname() %></td>
	</tr>
	<%
		}
	%>
</table>


</body>
</html>