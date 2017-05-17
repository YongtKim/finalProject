<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="/mappin/css/style.css" type="text/css">
<link rel="stylesheet" type="text/css" href="/mappin/css/guideInsert.css">

<script type="text/javascript" src="/mappin/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="//apis.daum.net/maps/maps3.js?apikey=3e28c6a8dcb935b0c2dc4d014a866ca5&libraries=services"></script>
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
            <div style="border: 1px solid red; height: 400px">
               <div class="map_wrap">
                  <div id="map"
                     style="width: 100%; height: 100%; position: relative; overflow: hidden;"></div>
                  <div id="menu_wrap" class="bg_white">
                     <div class="option">
                        <div>
                           <select id="typeselect">
                              <option>-</option>
                              <option value="12">관광지</option>
                              <option value="32">숙박지</option>
                              <option value="39">음식점</option>
                           </select> 키워드 : <input type="search" value="제주 맛집" id="keyword" size="15">
                           <button id="search">검색하기</button>
                        </div>
                     </div>
                     <hr>
                     <ul id="placesList"></ul>
                     <div id="pagination"></div>
                  </div>
               </div>
            </div>
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
   <script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new daum.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };

var map = new daum.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

// 지도 확대 축소를 제어할 수 있는  줌 컨트롤을 생성합니다
var zoomControl = new daum.maps.ZoomControl();
map.addControl(zoomControl, daum.maps.ControlPosition.RIGHT);

//자료 요성시 적용하는 리스트 타입
var type=null;

// 지도가 확대 또는 축소되면 마지막 파라미터로 넘어온 함수를 호출하도록 이벤트를 등록합니다.
daum.maps.event.addListener(map, 'zoom_changed', function() {        
    // 지도의 현재 레벨을 얻어옵니다
    var level = map.getLevel();
});

$('table').children('tr').each(function(){
   //제1 루트
      $(this).chidren('td').each(function(){
      //제 2루트   
         $(this).click(function(){
            alert("!");
         });
      });
});


$('td[name="td"]').each(function(){
   $(this).click(function(){
      $(this).css("background-color","yellow");
   });
});


//메뉴출력  윈포
var infomenu=null;
//마커용 윈포
var addwindow=null;
//마커 저장용 배열
var markers=[];
var apiMarkers=[];
var apiWindows=[];

//지도 안에서 마우스 우클릭 이벤트
daum.maps.event.addListener(map, 'rightclick', function(mouseEvent) {
   //중복클리기 이전 인포윈도우 삭제
   //메뉴삭제
   if(infomenu!=null){
      infomenu.close();
   }
   //마커등록창 삭제
   if(addwindow!=null){
      addwindow.close();
   }
      
   
    var latlng = mouseEvent.latLng;
    //지번, 도로명 주소 저장용
    var jibun=null;
    var road=null;
   var menudiv='<div id="menuInfo"><label><a href="#" id="addmarker">마커 추가</a></label><br>'
            +'<label><a href="#" id="hidemarker">맵에 마커 숨기기</a></label></div>';
   //우클릭 메뉴 화면 객체 생성
   infomenu=new daum.maps.InfoWindow({
      map:map,
       position:latlng,
       content:menudiv,
       removable:true
   });
   //우클릭 메뉴화면 출력
   infomenu.open(map);
   //마커 숨기기.
   $('#hidemarker').click(function(){
      if(infomenu!=null){
         infomenu.close();
      }
      for(var i=0;i<markers.length;i++){
         markers[i].setVisible(false);
      }
   });
   
   $('#addmarker').click(function(){
      
      //메뉴삭제
      if(infomenu!=null){
         infomenu.close();
      }
      //마커등록창 삭제
      if(addwindow!=null){
         addwindow.close();
      }

      //좌표, 주소변환 객체
   var geocoder = new daum.maps.services.Geocoder();
    searchDetailAddrFromCoords(geocoder,mouseEvent.latLng, function(status, result) {
        if (status === daum.maps.services.Status.OK) {
              jibun=result[0].jibunAddress.name;
            
              $(function(){
                 //주소 좌표 value값 변경
                $('#infolocation').val(jibun);
             });
              
           }
        });
    //마커 윈도우  div생성
      var getinfoDiv = '<div id="getinfo" style="">'
                     + '<input id="infoname" type="text" placeholder="이름을 입력하세요" size="20"><br>'
                     + '이미지 업로드<input type="file" id="getimg"><br>'
                     + '<input id="infolocation"type="text" placeholder="주소" size="50"><br>'
                     + '<input id="infourl"type="text" placeholder="홈페이지" size="20"><br>'
                     + '<input id="infotel" type="tel" placeholder="전호번호(-포함)" size="20"><br>'
                     + '<input id="infocontent" type="textarea" placeholder="장소 요약" size="20"><br>'
                     + '<button id="submitbtn">등록하기</button>'
                     + '</div>';
         
                        
         //마커정보 윈도우 객체 생성 
          addwindow = new daum.maps.InfoWindow({
                                    map : map,
                                    position : latlng,
                                    content : getinfoDiv,
                                    removable : true
                                       });
                              //마커정보 윈도우 출력
                                 addwindow.open(map);
                                 //'등록하기' 버튼 이벤트
                                    $('#submitbtn').click(function(){
                                       var inname=$('#infoname').val();
                                       var inlocation=$('#infolocation').val();
                                       var inurl=$('#infourl').val();
                                       var incontent=$('#infocontent').val();
                                       var addmarker= new daum.maps.Marker({
                                          position:latlng,
                                          clickable:true
                                       });
                                       //마커 배열 추가
                                       markers.push(addmarker);
                                       //맵 화면에 마커 출력
                                       addmarker.setMap(map);
                                          //마커 클릭 이벤트 생성
                                        daum.maps.event.addListener(addmarker, 'click', function() {
                                             var content= '<div class="markerWindow>'
                                                         +'<div class="imgsDiv"/>'
                                                         +'<label>'+inname+'</label><br>'
                                                         +'<label>주소 : '+inlocation+'</label><br>'
                                                         +'<label>홈페이지 : '+inurl+'</label><br>'
                                                         +'<label>전화번호 : '+incontent+'</label><br>'
                                                         +'<label>'+incontent+'</label><br>';
                                             var markerinfo=new daum.maps.InfoWindow({
                                               map:map,
                                               content:content,
                                               removable:true
                                             });
                                             markerinfo.open(map,addmarker);
                                             map.panTo(addmarker.getPosition());

                                       });
                                        if(addwindow!=null){
                                          addwindow.close();
                                       }
                                    });
                                    
                                 
                                 //마커추가 끝      
                                 });
               
         });

   $(function(){
      $('#search').click(function(){
      type=$('#typeselect').val();
      getInfoList(1,type);
      });
   });
   
   //주소,위치 변환 함수
    function searchDetailAddrFromCoords(geocoder,coords, callback) {
          // 좌표로 상세 주소 정보를 요청합니다
          geocoder.coord2detailaddr(coords, callback);
      }
//마커 윈도우 추가 함수
   function closeWindow(map,infoarr) {
       return function() {
         for(i in infoarr){
            infoarr[i].close();
         }
          
       }
      }
   // 검색결과 목록 하단에 페이지번호를 표시는 함수입니다
   function displayPagination(maxpage,page,type) {
      var paginationEl = document.getElementById('pagination'),
        fragment = document.createDocumentFragment(),
        i;
      var endpage=10,startpage=1;
      //페이지 처리.
      for(var j=1;j*10<page+10;j++){
         endpage=j*10;
         startpage=j*10-9;
      }
      if(endpage>=maxpage){
         endpage=maxpage;
      }
       // 기존에 추가된 페이지번호를 삭제합니다
       while (paginationEl.hasChildNodes()) {
           paginationEl.removeChild (paginationEl.lastChild);
       }
       //페이징 이동 버튼 객체 생성
       var stbtn=document.createElement('a');
       stbtn.innerHTML='◀';
       stbtn.href='#';
       var endbtn=document.createElement('a');
       endbtn.innerHTML='▶';
       endbtn.href='#';
       if(startpage==1){
          stbtn.className='on';
       }else{
            stbtn.onclick=(function(){
               return function(){
                  getInfoList(startpage-10,type);
               }
            })();
       }
       if(endpage==maxpage){
          endbtn.className='on';
       }else{
           endbtn.onclick=(function(){
              return function(){
                 getInfoList(startpage+10,type);
              }
           })();
       }
     
      //이전 버튼추가
       fragment.appendChild(stbtn);
      //시작~끝 페이지 나열
       for (i=startpage; i<=endpage; i++) {
           var el = document.createElement('a');
           el.href = "#";
           el.innerHTML = i;
           if (i===page) {
               el.className = 'on';
           } else {
              el.onclick = (function(i) {
                   return function() {
                      getInfoList(i,type);
                   }
               })(i);
           }
         
           fragment.appendChild(el);
       }
       //다음버튼 추가
       fragment.appendChild(endbtn);
       paginationEl.appendChild(fragment);
   }
   function getInfoList(page,type){
      for(i in apiMarkers){
         apiMarkers[i].setMap(null);
      }
      apiMarkers=[];
      $.ajax({
         url:'test',
         type:'get',
         datatype:'json',
         data:{"page":page,
              "type":type},
         success:function(data){
            $('#placesList').html("");
            var jsonData = JSON.stringify(data);
            var jsonArr = JSON.parse(jsonData);
            for(i in jsonArr.list){
               var num=Number(i)+Number(1);
               var content ='<li class="item">'
                        +'<span class="markerbg marker_'+num+'"></span>'
                        +'<div class="info">';
                        if(jsonArr.list[i].img!=null){
                           content+='<img alt="" src="'+jsonArr.list[i].img+'" style="width:70px;height:70px"/>';
                        }
                        
                   content+='<h5>'+decodeURI(jsonArr.list[i].title)+'</h5>'
                        +'</div>'
                        +'<div class="jibun">'
                        +'<span>'+jsonArr.list[i].address+'</span>'
                        +'</div>'
                        +'</li>'
               $('#placesList').html($('#placesList').html()+content);
                    var infowindow= new daum.maps.InfoWindow({
                       map:map,
                       removable:true,
                       content:content
                     });
                    apiWindows.push(infowindow);
                  var apimarker=addmarker(map,new daum.maps.LatLng(jsonArr.list[i].lng,jsonArr.list[i].lat),num);
                  addCilckEvent(map,apimarker,infowindow);
                  console.log($("li.markerbg marker_"+num).parent());
                  $(".markerbg marker_"+num).css("background-color","yellow");
                  $(".markerbg marker_"+num).parent().click(function(){
                     closeWindow(map,apiWindows);
                     addMenuCilckEvent(map,apimarker,infowindow);
                  });
                     
                     
                  
                  
                  changeView(map,'제주시');
                   displayPagination(jsonArr.page,page,type);
            }
         }
      });
   }
   function addCilckEvent(map,apimarker,infowindow,apiWindows){
      closeWindow(map,apiWindows);
      daum.maps.event.addListener(apimarker, 'click', function() {
           infowindow.open(map,apimarker);
             map.panTo(apimarker.getPosition());
        });
   }
   
   function addMenuCilckEvent(map,apimarker,infowindow,apiWindows){
      closeWindow(map,apiWindows);
       infowindow.open(map,apimarker);
          map.panTo(apimarker.getPosition());
   }
   
   function addmarker(map,latlng,num){
       var imageSrc = 'http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/marker_number_blue.png', // 마커 이미지 url, 스프라이트 이미지를 씁니다
        imageSize = new daum.maps.Size(36, 37),  // 마커 이미지의 크기
        imgOptions =  {
            spriteSize : new daum.maps.Size(36, 691), // 스프라이트 이미지의 크기
            spriteOrigin : new daum.maps.Point(0, (num*46)+10), // 스프라이트 이미지 중 사용할 영역의 좌상단 좌표
            offset: new daum.maps.Point(13, 37) // 마커 좌표에 일치시킬 이미지 내에서의 좌표
        },
        markerImage = new daum.maps.MarkerImage(imageSrc, imageSize, imgOptions),
        apiMarker= new daum.maps.Marker({
            position:latlng,
            image: markerImage, 
            clickable:true
         });
            
            apiMarker.setMap(map);
            apiMarkers.push(apiMarker);
            return apiMarker;
   }
   function changeView(map,location){
      var geocoder = new daum.maps.services.Geocoder();
      // 주소로 좌표를 검색합니다
      geocoder.addr2coord(location, function(status, result) {

          // 정상적으로 검색이 완료됐으면 
           if (status === daum.maps.services.Status.OK) {

              var coords = new daum.maps.LatLng(result.addr[0].lat, result.addr[0].lng);
              map.setCenter(coords);
              map.setLevel(10);
           }
       });
   }
</script>
</body>
</html>