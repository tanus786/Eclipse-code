<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<h1 class="text-center">${Header}</h1>
	<p class="text-center">${desc }</p>
	<h1>Successfully Submitted!!</h1>
	<%-- <h1>${name } ${email } ${password }</h1> --%>
	<h1>${user.name }${user.email } ${user.password }</h1>
</body>
</html>