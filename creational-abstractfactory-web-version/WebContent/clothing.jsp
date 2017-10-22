<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="UTF-8">
	<meta name="viewport" content="width = device-width, initial-scale = 1">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="style.css">
<title>Toyota Trucks</title>
</head>
<body>
	<!-- bootstrap-->
		<script src="js/bootstrap.min.js"></script>
		<script src="js/jquery-3.0.0.min.js"></script>
	<!-- end of bootstrap -->
	<div class="container">
		<div class="welcome" id="welcome">
			<h2>Welcome to Inuyasha Fashion Shop</h2>
		</div>
		<h2>Select and pick which category you like
		</h2>
		<fieldset>
			<legend>List of Fashion Categories</legend>
			<form action='selection.html' 
				method='post'>
				
				<p>Select a fashion category:
					<select name='preferredFashion'>
						<option value="CASUAL">Casual</option>
						<option value="FORMAL FEMALE">Formal for Female</option>
						<option value="FORMAL MALE">Formal for Male</option>
						<option value="GYM">Gym</option>
						<option value="SUMMER">Summer</option>
					</select>
				</p>
				<p>
					<input type='submit' 
						value='Show Fashion Information'/>
						&nbsp;&nbsp;&nbsp;
					<input type='reset'/>	
				</p>
			</form>
		</fieldset>
	</div>
</body>
</html>