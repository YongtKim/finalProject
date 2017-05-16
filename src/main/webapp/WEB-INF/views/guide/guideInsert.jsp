<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="/test/css/style.css" type="text/css">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../common/menuBar.jsp" />
	
	<div class="container">
		<h2 class="text-center">가이드 등록</h2>
		<div class="separator_auto"></div>
		<br/>
		<div class="row">
			<div class="col-md-8 text-center">
				<div style="border: 1px solid red; height: 400px">지도</div>
				<div style="border: 1px solid red; height: 300px">캘린더</div>
			</div>
			<div class="col-md-4">
				<div style="border: 1px solid red; height: 700px">
				<form action="">
					<table>
					 <tr>
						 <td>패키지 명 :</td>
						 <td colspan="2"><input type="text" class="form-control"></td>
					 </tr>
					  <tr>
						  <td colspan="3">
								<div style="border: 1px solid red; height: 400px"></div>
						  </td>
					</tr>
					 <tr>
						 <td colspan="3"><textarea rows="10" cols="43"></textarea></td>
					 </tr>
					 <tr>
						 <td colspan="3" class="text-center"><input type="submit" class="btn btn-default"value="저장하기"></td>
					 </tr>
					</table>
				</form>
				</div>
				<div></div>
			</div>
		</div>
	
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
	</div>
</body>
</html>