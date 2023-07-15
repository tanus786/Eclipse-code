<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
	<h1>This is help page</h1>
	<%
	/* String name = (String) request.getAttribute("name");
	Integer i = (Integer) request.getAttribute("id");
	LocalDateTime date = (LocalDateTime) request.getAttribute("date"); */
	%>
	<h1>
		Name is ${name }
		<%-- <%=name%> --%>

		Id is ${id }
		<%-- <%=i%> --%>
	</h1>
	<h1>
		Date is ${date }
		<%-- <%=date%> --%>
	</h1>
	<h1>
		Friends are
		<c:forEach var="item" items="${fri }">
			<%-- <h1>${item }</h1> --%>
			<c:out value="${item }" />
		</c:forEach>
	</h1>
</body>
</html>