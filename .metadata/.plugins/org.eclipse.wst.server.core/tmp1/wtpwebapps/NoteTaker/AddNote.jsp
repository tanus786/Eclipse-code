<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="JsCss.jsp"%>
<title>Add Note</title>
</head>
<body>
	<div class="container-fluid p-0 m-0">
		<%@include file="navbar.jsp"%>
	</div>
	<br>
	<div class="container">

		<!--Form for adding note  -->
		<h1 style="font-weight: 300" class="text-uppercase">Please fill your note details</h1>
		<br>
		<form action="Save" method="post">
			<div class="form-group">
				<label for="title">Note Title</label> <input required type="text"
					class="form-control" id="title" aria-describedby="emailHelp"
					placeholder="Enter note title" name="title">
			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea required class="form-control" id="content"
					placeholder="Enter note content" style="height: 300px"
					name="content"></textarea>
			</div>
			<button type="submit" class="btn btn-primary">Add Note</button>
		</form>


	</div>
</body>
</html>