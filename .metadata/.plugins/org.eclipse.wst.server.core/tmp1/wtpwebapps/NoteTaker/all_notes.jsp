<%@page import="org.hibernate.query.Query"%>
<%@page import="com.entities.Note"%>
<%@page import="java.util.List"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="JsCss.jsp"%>
<title>All Notes</title>
</head>
<body>
	<div class="container-fluid p-0 m-0">
		<%@include file="navbar.jsp"%>
	</div>
	<br>
	<div class="container">
		<h1 style="font-weight: 300" class="text-uppercase">All notes</h1>
		<div class="row">
			<div class="col-12">
				<%
				Session s = FactoryProvider.getFactory().openSession();
				Query q = s.createQuery("from Note ");
				List<Note> list = q.list();
				for (Note note : list) {
				%>
				<div class="card mt-3">
					<img class="card-img-top pl-3 pt-4" style="max-width: 60px"
						src="img/pencil.png" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title"><%=note.getTitle()%></h5>
						<p class="card-text"><%=note.getContent()%></p>
						
						<p><i class= "text-primary"><%=note.getAddedDate()%></i></p>
						<a href="delete?note_id=<%=note.getId()%>" class="btn btn-danger">Delete</a>
						<a href="edit.jsp?note_id=<%=note.getId()%>"
							class="btn btn-primary">Update</a>
					</div>
				</div>
				<%
				}
				s.close();
				%>
			</div>

		</div>

	</div>

</body>
</html>