<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
<title>Home</title>
</head>
<body data-spy="scroll" data-target=".navbar-collapse">
	<jsp:include page="/WEB-INF/views/common/menuBar.jsp" />
	<section class="container" style="border:1px solid black;">
		<div class="col-md-9" style="border:1px solid red;height:150px;">이벤트</div>
		<div class="col-md-3" style="border:1px solid red;height:150px;">로그인폼</div>
		<div class="col-md-12"  style="border:1px solid red;height:150px;">추천가이드</div>
		<div class="col-md-12"  style="border:1px solid red;height:150px;">추천 후기</div>
	</section>
</body>
</html>
