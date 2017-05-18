<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="/test/css/style.css" type="text/css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/menuBar.jsp" />
	
	<div class="container">
		<h2 class="text-center">별이와 함께하는 여행</h2>
		<div class="separator_auto"></div>
		<div class="media">
			<div class="media-left">
				<img src="/test/img/about.png" class="media-object img-thumbnail"
					style="width: 60px">	
			</div>
			<div class="media-body">
				<h4 class="media-heading">허예별
				<img alt=""	src="/test/img/glyphicons/png/glyphicons-50-star.png">4.6
				</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
			</div>
		</div>
		<br/>
		<div class="row">
			<div class="col-md-4 text-center">
				<div style="border: 1px solid red; height: 300px">지도</div>
				<div style="border: 1px solid red; height: 400px">
					코멘트 <br>
					<textarea rows="14" cols="40"></textarea>
				</div>
			</div>
			<div class="col-md-8">
				<div style="border: 1px solid red; height: 700px">플랜</div>
			</div>
		</div>
		<br />
		<div class="row">
			<div class="col-md-12">
				<div style=" height: 100px">
					리뷰<br />
					<div class="media-body">
						<h4 class="media-heading" data-toggle="collapse"
							data-target=".review">
							별이님의 리뷰&nbsp;&nbsp;&nbsp;&nbsp;<img alt=""
								src="/test/img/glyphicons/png/glyphicons-50-star.png">
							4.0&nbsp;&nbsp;&nbsp;&nbsp; 2017-05-11
						</h4>

						<div class="review media collapse" style="border:1px solid black">
							<img src="/test/img/about.png" class="media-object"
								style="width: 60px">
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row"></div>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
	</div>
</body>
</html>