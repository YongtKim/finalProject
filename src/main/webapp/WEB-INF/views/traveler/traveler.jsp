<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/menuBar.jsp" />

	<div class="container">
		<h2 class="text-center">플랜</h2>
		<div class="separator_auto"></div>
		<br />
		<div class="row">
			<div class="col-md-8 text-center">
				<div style="border: 1px solid red; height: 700px">지도</div>
			</div>
			<div class="col-md-4">
				<div style="border: 1px solid red; width: 100%; height: 700px">
					<form action="">
						<div class="form-group">
							<label>플랜 명 : </label> <input type="text" class="form-control col-md-2">
						</div>
						<div class="form-group"
							style="border: 1px solid red; height: 600px"></div>
						<div class="form-group text-center">
							<input type="submit" class="btn btn-default" value="저장하기">
						</div>
					</form>
				</div>
				<div></div>
			</div>
		</div>

		<br /> <br /> <br /> <br /> <br />
	</div>

</body>
</html>