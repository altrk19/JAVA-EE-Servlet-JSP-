<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List,java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- JSP Scriptlet kodu -->
<%
	System.out.println("Java Scriptlet kodu");
	out.println("For denemesi");
	for(int i=0;i<5;i++){
		System.out.println("i"+i);
		out.print("i:"+i+" ");
	}
	
	List<String> testList=new ArrayList<String>();
	testList.add("aliBey");
%>
	<br>
	<br>
	<%
	String name="AliBey";
	int age=99;
	out.println(name);
	out.println(age);
	%>
	<br>
	<br>
	<!-- JSP Expression -->
	<%=name %>
	<%=age %>
	<br><br>
	<%=addNumber(5,15) %>
	<!-- JSP Declaration -->
	<%!public int addNumber(int n1,int n2){
		sum=n1+n2;
		return sum;
	}
	private int sum=0;
	%>
	<br><br>
	<%=addNumber(55,45) %>
	
	<%--JSP YORUM SATIRI --%>
	}
</body>
</html>