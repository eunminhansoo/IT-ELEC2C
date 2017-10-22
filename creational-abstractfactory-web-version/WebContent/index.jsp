<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="UTF-8">
	<meta name="viewport" content="width = device-width, initial-scale = 1">
	<<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link href="css1/edit.css" rel="stylesheet">
<title>Yasha Fashions</title>
</head>
<style>
	#header{
		font-size: 70px;
	}
	fieldset{
		dispay: inline;
	}
	#button{
		float: left;
	}
</style>
<body>
	<!-- bootstrap-->
		<script src="js/bootstrap.min.js"></script>
		<script src="js/jquery-3.0.0.min.js"></script>
	<!-- end of bootstrap -->
	<!-- navigator -->
	<div class="menu_white2">
		<div class="navsticky navbar-topaz">
			<nav class="navbar" role="navigation">
				<div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                	<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        	<span class="sr-only">Toggle navigation</span>
                         	<span class="icon-bar"></span>
                        	<span class="icon-bar"></span>
                    		<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" type="button" href="index.jsp"><embed  class="logosize" src="minilogo.svg"></embed></a>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav navbar-right">
                        	<li></li>
                        	<li></li>
                        	<li></li>
                        	<li></li>
                       		<li></li>
                        	<li><a href="index.jsp">HOME</a></li>
                       		<li><a href="#"  data-toggle="modal" data-target="#login-modal"><span class="bordernavbar"></span> My Carth</a></li>						
						</ul>
                     </div><!-- /.navbar-collapse -->
				</div><!-- /.container -->
        	</nav>
		</div>
	 </div>
	 <!-- end of navigator -->
	 
	 <!-- popup -->
	<div class="popScroll" id="popScroll">
		<div class="popup">
			<div>
				<embed src="welcome.svg" class="welsvg"></embed>
			</div>
			<button class="btn btn-lg col-xs-6 col-sm-offset-3" id="strbtn" onclick="myFunction()">START</button>
		</div>
	</div>
		
	<!-- end of popup -->
	
	<div class="container">
		
		<h2>Select and pick which category you like
		</h2>
		<fieldset>
			<legend>Choose your Fashion Categories</legend>
			<!-- <form action="clothing.jsp">
	    		<input type="submit">
	    	</form>-->
	    	
	    		<a href="clothing.jsp" type="submit"><button>Clothing</button></a></il>
	    		<a href="accessory.jsp" type="submit"><button id="button">Accessories</button></a></li>
	    	
	    	<br>
	    	<br>
	   		<!-- <form action="accessory.jsp">
	    		<input type="submit">-->
			</form>
		</fieldset>
	</div>
	<script>
		function myFunction(){
			document.getElementById("popScroll").style.display = "none";
		}
		
	</script>
</body>
</html>