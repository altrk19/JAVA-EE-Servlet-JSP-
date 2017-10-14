<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${param.firstName }<br>
${param.lastName }<br>
${param.gender }<br>
${param.maritalstatus}<br>
${param.lang }<br>
${paramValues.lang[0]}
${paramValues.lang[1]}
<%--******NOT:Bu yaklaşımı kullanmayız. Formu jsp'ye submit etmek yerine controller'a submit etmeliyiz. --%>

</body>
</html>