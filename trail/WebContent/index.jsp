<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link href="css1/edit.css" rel="stylesheet">
	
	<!-- 
	<link href="css1/jquery.bxslider.css" rel="stylesheet">
	<link href="css1/owl.carousel.css" rel="stylesheet">
	<link href="css1/animate.css" rel="stylesheet">
	<link href="css1/prettyPhoto.css" rel="stylesheet">
	<link href="css1/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css1/color_3.css">
	<link rel="stylesheet" type="text/css" href="css1/style.css">
	 -->
<title>Nasha</title>
</head>
<body>
	<!-- bootstrap -->
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
	 <!-- content-->
	 <div>
	 	
	 </div>
	<!-- end of content -->
	<div class="container">
		<div class="">
			<div align="center">
			</div>
			
		</div>	
	</div>
	
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
                            
	<script>
		function myFunction(){
			document.getElementById("popScroll").style.display = "none";
		}
		
	</script>
</body>
</html>