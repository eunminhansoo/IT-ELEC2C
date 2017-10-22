<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="behikulo" 
	type="demo.model.vehicle.ToyotaVehicle" 
	scope="request"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Toyota Trucks</title>
</head>
<body>
	<h2>Welcome to UST Toyota Vehicles</h2>
	<h2>Selected vehicle details</h2>
	
	<p>Vehicle model: <b><%=behikulo.viewModel() %></b></p>
	<p>Vehicle Price: <b><%=behikulo.viewPrice() %></b></p>
	
	<!-- now on engine display -->
	<p><tt>Engine Details</tt></p>
	<p>Engine Name: <b>
		<%=behikulo.getEngine().diplayEngineType() %></b></p>
	<p>Engine Details: <b>
		<%=behikulo.getEngine().literAndHorsePower() %></b> </p> 
	<hr/>
	<form action = "index.jsp">
		<input type="submit" 
			value = "<< GO BACK >>">
	</form>
</body>
</html>