<%@page import="com.entities.Note"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.helper.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="JsCss.jsp"%>
<title>Edit Note</title>
</head>
<body>
	<div class="container-fluid p-0 m-0">
		<%@include file="navbar.jsp"%>
	</div>
	<div class="container">
		<%
		int noteId = Integer.parseInt(request.getParameter("note_id").trim());
		Session s = FactoryProvider.getFactory().openSession();
		Note note = (Note) s.get(Note.class, noteId);

		s.close();
		%>
		<div class="container">

			<!--Form for adding note  -->
			<h1 style="font-weight: 300" class="text-uppercase">Edit the note</h1>
			<br>
			<form action="update" method="post">
			
			<input value="<%=note.getId()%>" name="noteId" type="hidden" />
				<div class="form-group">
					<label for="title">Note Title</label> <input required type="text"
						class="form-control" id="title" aria-describedby="emailHelp"
						placeholder="Enter note title" name="title" value="<%=note.getTitle()%>">
				</div>
				<div class="form-group">
					<label for="content">Note Content</label>
					<textarea required class="form-control" id="content"
						placeholder="Enter note content" style="height: 300px"
						name="content"><%=note.getContent()%></textarea>
				</div>
				<button type="submit" class="btn btn-success">Update</button>
			</form>


		</div>

	</div>
</body>
</html>