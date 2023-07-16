<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Form</title>
</head>
<body class="" style="background: #e2e2e2;">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Registration Form</h3>
						<div class="alert alert-danger" role="alert">
							<form:errors path="student.*" />
						</div>
						<form action="handle" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Name</label>
								<input type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" name="name">
								<div class="form-group">
									<label for="exampleInputPassword1" class="form-label">Id</label>
									<input type="text" class="form-control"
										id="exampleInputPassword1" name="id">
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1" class="form-label">DOB</label>
									<input type="text" class="form-control"
										id="exampleInputPassword1" name="dob">
								</div>
								<div class="form-group">
									<label for="exampleInputPassword1" class="form-label">Courses</label>
									<select name="courses" class="form-control"
										id="exampleInputPassword1" multiple>
										<option>Java</option>
										<option>Python</option>
										<option>C++</option>
										<option>Swing</option>
										<option>Hibernate</option>
									</select>
								</div>
								<div class="form-group mt-3">
									<span class="mr-3">Select Gender</span> <br> <input
										class="form-check-input" type="radio" name="gender"
										id="flexRadioDefault1" value="Male"> <label
										class="form-check-label" for="flexRadioDefault1"> Male
									</label>
								</div>
								<div class="form-group">
									<input class="form-check-input" type="radio" name="gender"
										id="flexRadioDefault2" value="Female"> <label
										class="form-check-label" for="flexRadioDefault2">
										Female </label>
								</div>
								<div class="form-group mt-3">
									<label>Select Type</label> <select class="form-control"
										name="type">
										<option>Old Student</option>
										<option>New Student</option>
									</select>
								</div>
								<div class="card mt-3">
									<div class="card-body">
										<p>Address</p>
										<div class="form-group">
											<input type="text" class="form-control"
												placeholder="Enter Street" name="address.street" />
										</div>
										<div class="form-group mt-2">
											<input type="text" class="form-control"
												placeholder="Enter city" name="address.city" />
										</div>
									</div>
								</div>
								<div class="container text-center">
									<button type="submit" class="btn btn-primary mt-3">Submit</button>
								</div>

							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</body>
</html>