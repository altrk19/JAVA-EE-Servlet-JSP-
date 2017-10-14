<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${myMap.key1}</p>
<p>${myMap.key2}</p>
<p>${myMap.key3}</p>

<h1>Bracket myMap</h1>
<p>${myMap['key1']}</p>
<p>${myMap['key2']}</p>
<p>${myMap['key3']}</p>

<h1>Bracket myList</h1>
<p>${myList[0]}</p>
<p>${myList['1']}</p>
<p>${myList['2']}</p>
<p>${myList['3']}</p>
</body>
</html>