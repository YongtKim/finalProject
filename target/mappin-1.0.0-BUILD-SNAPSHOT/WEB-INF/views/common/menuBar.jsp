<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap Core CSS -->
<link rel="stylesheet" href="/mappin/css/bootstrap.css" type="text/css">
<link rel="stylesheet" href="/mappin/css/bootsnav.css" type="text/css">
<title>MenuBar</title>
</head>
<body>
	<!--Home page style-->
	<nav class="navbar navbar-default white no-background bootsnav">
		<div class="container">
			<!-- Atribute Navigation -->
			<div class="attr-nav">
				<ul>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> <i class="fa fa-shopping-bag"></i> <span
							class="badge">3</span>
					</a>
						<ul class="dropdown-menu cart-list">
							<li><a href="#" class="photo"><img
									src="assets/images/thumb01.jpg" class="cart-thumb" alt="" /></a>
								<h6>
									<a href="#">Delica omtantur </a>
								</h6>
								<p class="m-top-10">
									2x - <span class="price">$99.99</span>
								</p></li>
							<li><a href="#" class="photo"><img
									src="assets/images/thumb01.jpg" class="cart-thumb" alt="" /></a>
								<h6>
									<a href="#">Delica omtantur </a>
								</h6>
								<p class="m-top-10">
									2x - <span class="price">$99.99</span>
								</p></li>
							<li><a href="#" class="photo"><img
									src="assets/images/thumb01.jpg" class="cart-thumb" alt="" /></a>
								<h6>
									<a href="#">Delica omtantur </a>
								</h6>
								<p class="m-top-10">
									2x - <span class="price">$99.99</span>
								</p></li>
							<!---- More List ---->
							<li class="total"><span class="pull-right"><strong>Total</strong>:
									$0.00</span> <a href="#" class="btn btn-cart">Cart</a></li>
						</ul></li>
				</ul>
			</div>

			<!-- Header Navigation -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar-menu">
					<i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="#brand">
				 <img src="img/logo_black_min.png" class="logo logo-display m-top-0">
<!-- 				 <img src="img/logo_black_min.png" class="logo logo-scrolled"> -->
				</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="navbar-menu">
				<ul class="nav navbar-nav navbar-right" data-in="fadeInDown"
					data-out="fadeOutUp">
					<li><a href="start2.do">About</a></li>
					<li><a href="#News">News</a></li>
					<li class="dropdown"><a href="#Mappin" class="dropdown-toggle" data-toggle="dropdown">Mappin</a>
						<ul class="dropdown-menu">
							<li><a href="traveler.jsp">traveler</a></li>
							<li><a href="guide.jsp">guide</a></li>
						</ul>
					</li>
					<li><a href="#portfolio">community</a></li>
					<li><a href="contact.do">Contact</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
	</nav>
</body>
</html>