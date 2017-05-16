<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/png" href="favicon.ico">

<!--Google Font link-->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Raleway:400,600,700"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700"
	rel="stylesheet">

<link rel="stylesheet" href="css/slick.css">
<link rel="stylesheet" href="css/slick-theme.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/fonticons.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/bootsnav.css">

<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/responsive.css" />

<script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
<title>Home</title>
</head>
<body data-spy="scroll" data-target=".navbar-collapse">
	<jsp:include page="/WEB-INF/views/common/menuBar.jsp" />
	<section class="parallax-section">
	
		<div id="myCarousel" class="carousel slide col-md-6" style="border:1px solid red;"
			data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="img/header.jpg" alt="Los Angeles">
				</div>
				<div class="item">
					<img src="img/header.jpg" alt="Chicago">
				</div>
				<div class="item">
					<img src="img/header.jpg" alt="New York">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
		
		<div class="col-md-6" style="border:1px solid red;height:150px;">
			<form action="" class="">
				<table>
					<tr>
						<td><input type="text" class="btn btn-primary m-top-20" value="로그인"></td>
					</tr>
				</table>
			</form>
		</div>
	</section>
	
	<section>
	<div class="col-md-12"  style="border:1px solid red;height:150px;"></div>
	</section>
	<section>
	<div class="col-md-12"  style="border:1px solid red;height:150px;"></div>
	</section>
	<section>
	<div class="col-md-12"  style="border:1px solid red;height:150px;"></div>
	</section>
</body>
</html>
