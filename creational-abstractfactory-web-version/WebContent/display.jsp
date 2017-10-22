<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="fashion" 
	type="demo.model.top.YashaTop" 
	scope="request"/>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Yasha Clothing</title>
</head>
<body>
	<h2>Welcome to Inuyasha Fashion Shop</h2>
	<h2>Selected fashion details</h2>
	
	<p>Top wear model: <b><%=fashion.viewTopWear() %></b></p>
	<p>Top wear Price: <b><%=fashion.viewPrice() %></b></p>
	
	<!-- now on engine display -->
	<p><tt>Bottom wear Details</tt></p>
	<p>Bottom wear model: <b>
		<%=fashion.getBottom().displayBottom() %></b></p>
	<p>Bottom wear price: <b>
		<%=fashion.getBottom().displayBottomPrice() %></b> </p> 
	<hr/>
	
	<form action = "index.jsp">
		<input type="submit" 
			value = "<< GO BACK >>">
	</form>
</body>
</html>