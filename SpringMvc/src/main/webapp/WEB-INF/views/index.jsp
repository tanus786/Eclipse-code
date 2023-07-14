<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>This is Home Page</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer i = (Integer) request.getAttribute("number");
	Object fri = (Object) request.getAttribute("fri");
	List<String> frie = (List<String>) request.getAttribute("fri");
	%>
	<h1>
		Name is
		<%=name%></h1>
	<h1>
		Number is
		<%=i%></h1>
	<h1>
		Friends are
		<%=fri%></h1>
	<%
	for (String s : frie) {
	%>
	<h1><%=s%></h1>
	<%
	}
	%>
</body>
</html>