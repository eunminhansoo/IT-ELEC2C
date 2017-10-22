<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="fashion1" 
	type="demo.model.jewel.YashaJewel" 
	scope="request"/>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yasha Accessory</title>
</head>
<body>
	<h2>Welcome to Inuyasha Fashion Shop</h2>
	<h2>Selected fashion details</h2>
	
	<p>Jewel model: <b><%=fashion1.viewJewelWear() %></b></p>
	<p>Jewel Price: <b><%=fashion1.viewPrice1() %></b></p>
	
	<!-- now on engine display -->
	<p><tt>Accessory Details</tt></p>
	<p>Accessory wear model: <b>
		<%=fashion1.getAccessories().displayAccessories() %></b></p>
	<p>Accessory wear price: <b>
		<%=fashion1.getAccessories().displayAccessoriesPrice() %></b> </p> 
	<hr/>
	
	<form action = "index.jsp">
		<input type="submit" 
			value = "<< GO BACK >>">
	</form>
</body>
</html>