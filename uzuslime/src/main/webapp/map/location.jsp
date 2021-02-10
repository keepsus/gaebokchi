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
	<video muted autoplay loop width="400">
	    <source src="../videos/white.mp4" type="video/mp4">
	</video>
</div>
<!---------------------->
<!-------location------->
<!---------------------->
	<section class="location">
		<div>
			<h3><strong>찾아오시는 길</strong></h3>
			<p>ʕっ•ﻌ•ʔっ</p>
			<p>우주 슬라임의 모든 제품들을 직접 함께 만들어 볼 고객님,</p>
			<p>나만의 슬라임을 만들고 싶은 고객님은</p>
			<p>저희 매장을 방문해주세요</p>
			<p>----------------------------</p>
			<p>[매장 주소]</p>
			<p>서울 서초구 강남대로 459</p>
			<p>(우)06611</p>
			<p>지번 : 서초동 1303-34</p>
			<p>----------------------------</p>
		</div>
	</section>
<!---------------------->
<!-------location------->
<!---------------------->


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