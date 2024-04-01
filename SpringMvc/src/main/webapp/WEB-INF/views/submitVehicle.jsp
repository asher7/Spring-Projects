<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>Vehicle Submitted</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<style>
		body {
			background-color: #F0F8FF;
		}
	</style>
</head>
<body>
	<div class="container">
		<h2>Vehicle Information Submitted</h2>
		<p>Vehicle No: ${vehicle.vehicleNO}</p>
		<p>Tires: ${vehicle.tires}</p>
		<p>Driver Name: ${vehicle.driverName}</p>
		<!-- <a href="vehicleForm" class="btn btn-primary">Back to Vehicle Form</a> -->
	</div>
</body>
</html>
