<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%-- <%@ page isELIgnored="true" %> --%>
<!doctype html>
<html lang="en">
<head>
<title>List of users</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<base href="/Slide5Java4Demo1/">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
</head>
<body class="bg-info">
	<div class="container col-8 pt-2">
		<div class="border rounded bg-light pl-4 pr-4 p-3">
		
			<div class="row p-2 pl-3 pt-3 bg-danger text-white rounded">
				<h2>LIST USERS</h2>
				<h2>${message }</h2>
			</div>
			<div>
			<a href="user/add">Add new User</a>
			</div>

				<table class="table border border-dark">
					<thead class="thead-dark font-weight-bold bg-dark text-white">
						<tr>
							<td>No.</td>
							<td>Course ID</td>
							<td>Course Name</td>
							<td>Credit</td>
							<td>Description</td>
							<td>&nbsp;</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="course" items="${listCourse}" varStatus="status">
							<tr>
						
								<td>${course.courseID}</td>
								<td>${course.name}</td>
								<td>${course.credit}</td>
								<td>${course.description}</td>
								<td><a href="course/edit?id=${course.courseID}">Edit</a> | <a href="course/delete?id=${course.courseID}">Delete</a></td>
							</tr>
						</c:forEach>
					<tbody>
				</table>
			</div>
		</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>