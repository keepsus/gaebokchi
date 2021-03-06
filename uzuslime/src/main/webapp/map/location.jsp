<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/slime/css/grid.css">
<link rel="stylesheet" href="/slime/css/normalize.css">
<link rel="stylesheet" href="/slime/css/index.css">
<link rel="stylesheet" href="/slime/css/location.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">

<title>찾아오시는 길</title>
<!---------------------->
<!--------HAEDER-------->
<!---------------------->
<header>
	<nav id="nav">    			
		<a href="/slime/index.jsp"><img src="/slime/image/logo.jpg" alt="slime logo" class="logo"></a>
		<div style="margin-bottom: 2%;"><jsp:include page="../indexNav.jsp"/></div>      
	</nav>
</header>  

<!--------------------------->
<!--------SIDEBAR-MENU------->
<!--------------------------->
<jsp:include page="../sideMenu.jsp"/>

<body>

<!---------------------->
<!-------동영상------->
<!---------------------->
<div class="videobox">
	<video muted autoplay loop style="height:5%;">
	    <source src="/slime/videos/white.mp4" type="video/mp4">
	</video>

	<!---------------------->
	<!-------location------->
	<!---------------------->
	<div class="location-text">
				<h3><strong>찾아오시는 길</strong></h3>
				<hr style="width:800px;">
				<p><strong>ʕっ•ﻌ•ʔっ</strong></p>
				<p>우주 슬라임의 모든 제품들을 직접 함께 만들어 볼 고객님,</p>
				<p>슬라임을 만들어 본 적이 없는데 </p>
				<p>혼자는 만들어보기 두렵고 도움이 필요한 고객님,</p>
				<p>나만의 슬라임을 만들고 싶은 고객님은</p>
				<p>아래의 주소를 참고해서 저희 매장을 방문해주세요</p>
				<hr style="width:800px;">
				<p><strong>(ू•ᴗ•ू)!</strong></p>
				<p>*매장을 방문하시기 전에 예약전화를 주시면 감사하겠습니다</p>
				<p></p>
	</div>
</div><!--videobox-->

<!---------------------->
<!-------location------->
<!---------------------->
<div class="locationTotal">
	<div class="location">
		<!-- * 카카오맵 - 지도퍼가기 -->
		<!-- 1. 지도 노드 -->
		<div id="daumRoughmapContainer1612931646259" class="root_daum_roughmap root_daum_roughmap_landing" style="margin:10px;"></div>
		
		<!--
			2. 설치 스크립트
			* 지도 퍼가기 서비스를 2개 이상 넣을 경우, 설치 스크립트는 하나만 삽입합니다.
		-->
		<script charset="UTF-8" class="daum_roughmap_loader_script" src="https://ssl.daumcdn.net/dmaps/map_js_init/roughmapLoader.js"></script>
		
		<!-- 3. 실행 스크립트 -->
		<script charset="UTF-8">
			new daum.roughmap.Lander({
				"timestamp" : "1612931646259",
				"key" : "24dyg",
				"mapWidth" : "400",
				"mapHeight" : "300"
			}).render();
		</script>
	</div>
	
	<div class="location-text2">
		<p>[우주슬라임 오프라인 매장 주소 ]</p>
		<p>- 서울 서초구 강남대로 459 (우)06611</p>
		<p>- 백암빌딩 구관 2층 201호</p>
		<p>- 지번 : 서초동 1303-34</p>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
	</div>
</div>

<footer>
    <div class="row">
        <div class="col span-1-of-4">
            <ul class="footer-nav">
                <h3><strong>우주슬라임</strong></h3>
                <p>상호명 : 핌크리에이티브</p>
                <p>대표자 : 신동환</p>
                <p>사업자등록번호 : 105-88-00230</p>
                <p>서울시 강남구 테헤란로83길 18,<br> 매직킹덤빌딩 10층</p>
                <p>통신파매업 제2015-서울강남-03630호</p>
                <p>사업자 정보확인</p>
            </ul>
        </div>
        <div class="col span-1-of-4">
            <div class="footer-nav">
                <h3><strong>무통장입금</strong></h3>
                <p>137-090127-01-022</p>
                <p>기업은행</p>
                <p>(주)핌크리에이티브</p>
            </div>
        </div>
        <div class="col span-1-of-4">
            <div class="footer-nav">
                <h3><strong>고객센터</strong></h3>
                <p>010-2104-2264</p>
                <p>카카오톡 : uzuslime</p>
                <p>월요일 - 금요일 AM 10:00 - 19:00</p>
                <p>문의 : uzuslime@naver.com<br><br></p>
                <p>[반품/교환지 주소]</p>
                <p>경기도 김포시 양촌읍 학운리 3342</p>
                <p>(주)철저한 물류. 우주슬라임</p>
            </div>
        </div>
        <div class="col span-1-of-4">
            <div class="social-links">
                <li><a href="https://www.facebook.com/uzuslime"><ion-icon class="ion-social-facebook" name="logo-facebook"></ion-icon></a></li>
                <li><a href="https://twitter.com/?lang=ko"><ion-icon class="ion-social-twitter" name="logo-twitter"></ion-icon></a></li>
                <li><a href="https://www.instagram.com/uzuslime/"><ion-icon class="ion-social-googleplus" name="logo-google"></ion-icon></a></li>
                <li><a href="https://www.instagram.com/uzuslime/"><ion-icon class="ion-social-instagram" name="logo-instagram"></ion-icon></a></li>
            </div>
        </div>
    </div>
    <div class="row " id="row">
        <p>
            copyright 2018. <strong>우주슬라임</strong> All rights reserved
        </p>
        <p>
            이용약관 <i class="ion-ios-heart" style="color: #ea0000; padding: 0 3px;"></i> 개인정보처리방침
        </p>
    </div>
</footer>

<script>
function openNav() {
	document.getElementById('mySideNav').style.width = '250px';
}
function closeNav() {
	document.getElementById('mySideNav').style.width = '0';
}
</script>
<script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"> </script>
</body>
</html>