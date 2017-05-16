<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- menuBar -->
	<jsp:include page="/WEB-INF/views/common/menuBar.jsp" />
	<!--Contact Us Section-->
	<section id="contact" class="contact bg-mega fix">
	<div class="container">
		<div class="row">
			<div class="main_contact roomy-100 text-white">
				<div class="col-md-4">
					<div class="rage_widget">
						<div class="widget_head">
							<h3 class="text-white">RAGE</h3>
							<div class="separator_small"></div>
						</div>
						<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
							sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna
							aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud
							exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea
							commodo consequat.</p>

						<div class="widget_socail m-top-30">
							<ul class="list-inline">
								<li><a href=""><i class="fa fa-facebook"></i></a></li>
								<li><a href=""><i class="fa fa-twitter"></i></a></li>
								<li><a href=""><i class="fa fa-linkedin"></i></a></li>
								<li><a href=""><i class="fa fa-vimeo"></i></a></li>
								<li><a href=""><i class="fa fa-instagram"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-8 sm-m-top-30">
					<form class="" action="subcribe.php">
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									<input id="first_name" name="first_name" type="text"
										placeholder="Name" class="form-control" required="">
								</div>
							</div>

							<div class="col-sm-6">
								<div class="form-group">
									<input id="phone" name="phone" type="text" placeholder="Phone"
										class="form-control">
								</div>
							</div>

							<div class="col-sm-12">
								<div class="form-group">
									<textarea class="form-control" rows="6" placeholder="Message"></textarea>
								</div>
								<div class="form-group text-center">
									<a href="" class="btn btn-primary">SEND MESSAGE</a>
								</div>
							</div>

						</div>

					</form>
				</div>
			</div>
		</div>
		<!--End off row -->
	</div>
	<!--End off container --> </section>
	<!--End off Contact Section-->
</body>
</html>