<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
	<h1>This is help page</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer i = (Integer) request.getAttribute("id");
	LocalDateTime date = (LocalDateTime) request.getAttribute("date");
	%>
	<h1>
		Name is
		<%=name%>

		Id is
		<%=i%>
	</h1>
	<h1>
		Date is
		<%=date%>
	</h1>
</body>
</html>