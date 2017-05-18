<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

 <!--Google Font link-->
<link href="https://fonts.googleapis.com/css?family=Raleway:400,600,700" rel="stylesheet">
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet" type="text/css">
<script src="https://apis.google.com/js/api:client.js"></script>
<meta name="google-signin-client_id" content="AIzaSyDjMiWF92LASq46PVPqi7V6iSYk1P-W9zo.apps.googleusercontent.com">
<link rel="stylesheet" href="/mappin/css/bootstrap.css" type="text/css">
<link rel="stylesheet" href="/mappin/css/style.css" type="text/css">
<link rel="stylesheet" href="/mappin/css/mappin.css" type="text/css">

<!-- facebootk & google js -->
<script>
//facebook
  window.fbAsyncInit = function() {
    FB.init({
      appId      : '333716877045387',
      xfbml      : true,
      version    : 'v2.9'
    });
    FB.AppEvents.logPageView();
  };

  (function(d, s, id){
     var js, fjs = d.getElementsByTagName(s)[0];
     if (d.getElementById(id)) {return;}
     js = d.createElement(s); js.id = id;
     js.src = "//connect.facebook.net/ko_KR/sdk.js#xfbml=1&version=v2.9&appId=333716877045387";
     fjs.parentNode.insertBefore(js, fjs);
   }(document, 'script', 'facebook-jssdk'));

  
  //google
  (function() {
    var po = document.createElement('script');
    po.type = 'text/javascript'; po.async = true;
    po.src = 'https://apis.google.com/js/client:plusone.js?onload=render';
    var s = document.getElementsByTagName('script')[0];
    s.parentNode.insertBefore(po, s);
  })();
  function render() { // 로그인 버튼 지정
    gapi.signin.render('customBtn', {
      'callback': 'signinCallback', // 버튼 클릭 시 실행할 function
      'clientid': ' AIzaSyDjMiWF92LASq46PVPqi7V6iSYk1P-W9zo ',
      'cookiepolicy': 'single_host_origin',
      'requestvisibleactions': 'http://schemas.google.com/AddActivity',
      'scope': 'https://www.googleapis.com/auth/plus.login'
    });
  }
  function onSuccess(googleUser) {
      console.log('Logged in as: ' + googleUser.getBasicProfile().getName());
    }
    function onFailure(error) {
      console.log(error);
    }
    function renderButton() {
      gapi.signin2.render('my-signin2', {
        'scope': 'profile email',
        'longtitle': true,
        'onsuccess': onSuccess,
        'onfailure': onFailure
      });
    }
	</script>

  <script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script>


<title>Home</title>
</head>
<body class="bg-gray">
	<jsp:include page="menuBar.jsp" />
	<br/><br/>
	<section class="container ">
	<div class="row">
		<b>Event</b>
		<div class="separator_left"></div>
	</div>
	<div class="col-md-13 row">
		<div class="col-md-8">
			 <div id="myCarousel" class="carousel slide " data-ride="carousel">
			    <ol class="carousel-indicators">
			      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			      <li data-target="#myCarousel" data-slide-to="1"></li>
			      <li data-target="#myCarousel" data-slide-to="2"></li>
			    </ol>
			
			    <div class="carousel-inner" >
			      <div class="item active">
			        <img src="/mappin/img/about.png" alt="Los Angeles" style="width:100%; height:300px;">
			      </div>
			
			      <div class="item">
			        <img src="/mappin/img/about.png" alt="Chicago" style="width:100%;height:300px;">
			      </div>
			    
			      <div class="item">
			        <img src="/mappin/img/about.png" alt="New york" style="width:100%;height:300px;">
			    </div>
			
			    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
			      <span class="glyphicon glyphicon-chevron-left"></span>
			      <span class="sr-only">Previous</span>
			    </a>
			    <a class="right carousel-control" href="#myCarousel" data-slide="next">
			      <span class="glyphicon glyphicon-chevron-right"></span>
			      <span class="sr-only">Next</span>
			    </a>
			  </div>
			</div>
			</div>
			<div class="col-md-1 bg-gray "></div>
			<div class="col-md-3 well text-center" >
				<form action="../logincheck.mo" method="post">
					<h2 class="sr-only">Login Form</h2>
					<div class="illustration">
						<i class="icon ion-social-dropbox-outline"></i>
					</div>
					<span class=""></span>
						<input class="form-control" type="text" name="email"
							placeholder="email">
						<input class="form-control" type="password" name="member_pwd"
							placeholder="Password">
						<input class="btn btn-mappin_inverse" type="submit" value="Login">
				</form>
				<div class="fb-login-button btn btn-facebook "><span class="fa fa-facebook-square"></span><span class="m-top-20">Facebook 로그인</span></div>
				<div class="my-signin2 btn btn-google"><span class="fa fa-google-plus-square"></span><span>Google 로그인</span></div>
				
				<a>아이디 찾기</a> | <a>비밀번호찾기</a> | <a>회원가입</a>
			</div>
		</div>
		
		<div class="row">
			<b>Guide</b>
			<div class="separator_left"></div>
		</div>
		
		<div class="col-md-13 row">
	        <div class="col-sm-3">
	          <div class="well">
	         	<img alt="" src="/mappin/img/header.jpg">
	            <h4>Users</h4>
	            <p>1 Million</p> 
	          </div>
	        </div>
	        <div class="col-sm-3">
	          <div class="well">
	         	<img alt="" src="/mappin/img/header.jpg">
	            <h4>Pages</h4>
	            <p>100 Million</p> 
	          </div>
	        </div>
	        <div class="col-sm-3">
	          <div class="well">
	         	<img alt="" src="/mappin/img/header.jpg">
	            <h4>Sessions</h4>
	            <p>10 Million</p> 
	          </div>
	        </div>
	        <div class="col-sm-3">
	          <div class="well">
	         	<img alt="" src="/mappin/img/header.jpg">
	            <h4>Bounce</h4>
	            <p>30%</p> 
	          </div>
	        </div>
	     </div>
		<hr/>
		<div class="row">
			<b>Community</b>
			<div class="separator_left"></div>
		</div>
		<div class="col-md-13 row"  style="height:150px;"></div>
	</section>
</body>
</html>
