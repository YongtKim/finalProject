<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- CSS -->
<link rel="stylesheet" href="/mappin/css/bootstrap.css" type="text/css">
<link rel="stylesheet" href="/mappin/css/bootsnav.css" type="text/css">
<link rel="stylesheet" href="/mappin/css/style.css">
<link rel="stylesheet" href="/mappin/css/mappin.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>MenuBar</title>
</head>
<body>
	<nav class="navbar navbar-default bootsnav " style="height:80px">	
		<div class="container">
			<div class="attr-nav">
			<ul>
				<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown"> 
					<i class="fa fa-shopping-bag"></i><span class="badge">3</span>
				</a>
					<ul class="dropdown-menu cart-list">
						<li>
							<a href="#" class="photo"><img src="assets/images/thumb01.jpg" class="cart-thumb" alt="" /></a>
							<h6>
								<a href="#">Delica omtantur </a>
							</h6>
							<p class="m-top-10">
								<span class="price">$99.99</span>
							</p>
						</li>
						<!---- More List ---->
						<li class="total"><span class="pull-right"><strong>Total</strong>:
								$0.00</span> <a href="#" class="btn btn-cart">Cart</a></li>
					</ul>
				</li>
			</ul>
		</div>
<!-- Left nav: mobile menu and logo -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#navbar-menu">
				<i class="fa fa-bars"></i>
			</button>
			<a class="navbar-brand" href="/mappin/menu/home.ao">
			 <img src="/mappin/img/logo_black_min.png" class="logo logo-display m-top-0">
			</a>
		</div>

<!-- Right nav : menu Button -->
		
		<div class="collapse navbar-collapse" id="navbar-menu">
			<ul class="nav navbar-nav navbar-right" data-in="fadeInDown" data-out="fadeOutUp">
				<li><a href="/mappin/menu/about.ao" >About</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">News</a>
					<ul class="dropdown-menu">
						<li><a href="/mappin/menu/notice.ao">notice</a></li>
						<li><a href="/mappin/menu/event.ao">event</a></li>
					</ul>
				</li>
				<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Mappin</a>
					<ul class="dropdown-menu">
						<li><a href="/mappin/menu/traveler.ao">traveler</a></li>
						<li><a href="/mappin/menu/guide.ao">guide</a></li>
					</ul>
				</li>
				<li><a href="/mappin/menu/community.ao">community</a></li>
				<li><a href="/mappin/menu/contact.ao">contact</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<br/>
	<br/>
</body>
</html>