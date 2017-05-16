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
	<div class="text-center">
		<form action="/test/views/traveler/traveler.jsp">
			<label></label><input type="text">
			<label></label><input type="text">
			<label></label><input type="text">
			<input type="submit" value="입장하기">
		</form>
	</div>
	
	</div>

</body>
</html>