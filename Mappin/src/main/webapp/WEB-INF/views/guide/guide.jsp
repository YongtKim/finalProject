<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="/mappin/css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="/mappin/css/style.css" type="text/css">
<style type="text/css">
	
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/menuBar.jsp" />
	
	<div class="container">
	<h2 class="text-left">Guide Package</h2>
	<div class="separator_left"></div>
	<div class="text-right">
		<a class="btn btn-mappin" href="#">
			내글 보기
		</a>
		<a class="btn btn-mappin" href="/mappin/menu/guideInsertForm.ao">
			<span class="glyphicon glyphicon-pencil"></span>가이드 등록
		</a>
	</div>
	
	<div class="row">
	<div style="background:#ff6863; height:100px; padding-top:50px">
		<div class="col-md-2">
				<select class="selectpicker form-control">
					<option class="">지역</option>
					<option class="">서울</option>
					<option class="">인천</option>
					<option class="">광주</option>
					<option class="">부산</option>
					<option class="">제주</option>
				</select>
			</div>
			
		<div class="col-md-2">
				<select class="selectpicker form-control">
					<option class="">관광지</option>
					<option class="">맛집</option>
				</select>
			</div>
		
		<div class="col-md-3">
			<input type="text" class="form-control" placeholder="작성자" >
		</div>
		
		<div class="col-md-3">
			<input type="date" class="form-control" >
		</div>
		
		<div class="col-md-2">
			<a class="btn btn-mappin" href="#">
				<img alt="" src="/test/img/glyphicons/png/glyphicons-28-search.png">
			</a>
		</div>
		</div>
	</div>
	
	<hr/>
      <div class="row">
        <a class="col-sm-3" href="/test/views/guide/guideDetail.jsp">
         	 <div class="well">
         	<img alt="" src="/test/img/header.jpg">
            <h4>Users</h4>
            <p>1 Million</p> 
          </div>
        </a>
        <div class="col-sm-3">
          <div class="well">
         	<img alt="" src="/test/img/header.jpg">
            <h4>Users</h4>
            <p>1 Million</p> 
          </div>
        </div>
        <div class="col-sm-3">
          <div class="well">
         	<img alt="" src="/test/img/header.jpg">
            <h4>Pages</h4>
            <p>100 Million</p> 
          </div>
        </div>
        <div class="col-sm-3">
          <div class="well">
         	<img alt="" src="/test/img/header.jpg">
            <h4>Sessions</h4>
            <p>10 Million</p> 
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-sm-3">
          <div class="well">
         	<img alt="" src="/test/img/header.jpg">
            <h4>Users</h4>
            <p>1 Million</p> 
          </div>
        </div>
        <div class="col-sm-3">
          <div class="well">
         	<img alt="" src="/test/img/header.jpg">
            <h4>Pages</h4>
            <p>100 Million</p> 
          </div>
        </div>
        <div class="col-sm-3">
          <div class="well">
         	<img alt="" src="/test/img/header.jpg">
            <h4>Sessions</h4>
            <p>10 Million</p> 
          </div>
        </div>
        <div class="col-sm-3">
          <div class="well">
         	<img alt="" src="/test/img/header.jpg">
            <h4>Bounce</h4>
            <p>30%</p> 
          </div>
        </div>
      </div>
      
      <div class="text-center col-md-12">
		<ul class="pagination pagination-sm">
		  <li><a href="#">&lt</a></li>
		  <li><a href="#">1</a></li>
		  <li><a href="#">2</a></li>
		  <li><a href="#">3</a></li>
		  <li><a href="#">4</a></li>
		  <li><a href="#">5</a></li>
		  <li><a href="#">&gt</a></li>
		</ul>
	 </div>
</div>
</body>
</html>