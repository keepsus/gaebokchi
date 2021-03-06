<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!--임시로 값 입력-->
<c:set var="order_id" value="202101300001"/>
<c:set var="pay_order_time" value="2021-01-30"/>
<c:set var="orderer_name" value="콩콩이"/>
<c:set var="orderer_hp" value="010-3333-3333"/>
<c:set var="orderer_email" value="aa@naver.com"/>
<c:set var="receiver_name" value="콩돌이"/>
<c:set var="receiver_hp" value="010-3333-5555"/>
<c:set var="delivery_zipcode" value="01234"/>
<c:set var="delivery_addr1" value="서울시 종로구 종로5가"/>
<c:set var="delivery_addr2" value="11111번지"/>
<c:set var="delivery_message" value="없음"/>
<c:set var="pay_method" value="무통장입금"/>
<c:set var="goods_title" value="[버터슬라임]버터슬라임"/>
<c:set var="goods_state" value="입금대기"/>
<c:set var="goods_price" value="8500"/>
<c:set var="order_goods_qty" value="1"/>
<c:set var="delivery_price" value="2500"/>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/grid.css">
    <link rel="stylesheet" href="/slime/css/normalize.css">
    <link rel="stylesheet" href="/slime/css/index.css">
    <link rel="stylesheet" href="/slime/css/myPageOrder.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
    <title>마이페이지</title>
</head>
<body>
    
    <!---------------------->
    <!--------HAEDER-------->
    <!---------------------->
    <header>
        <nav>
            <div class="row">
                <a href="../index.jsp"><img src="/slime/image/logo.jpg" alt="slime logo" class="logo"></a>
				<jsp:include page="/mypage/myPageNav.jsp"/>
            </div>
        </nav>
    </header>
    
	<!--------------------------->
	<!--------SIDEBAR-MENU------->
	<!--------------------------->
	<jsp:include page="../sideMenu.jsp"/>       


    <!-- SECTION -->
    <section>
        <div class="row">
				<jsp:include page="/mypage/myPageMenu.jsp"/>	<!-- myPageMenu 불러오기 -->
				<jsp:include page="/mypage/myPageBox.jsp"/>	<!-- myPageMenu 불러오기 -->            	
            
            	<c:if test="${not empty display }">
					<div>주문 내역이 없습니다.</div>
				</c:if>
				<c:if test="${empty display }">
					<jsp:include page="../order/orderListMypage.jsp" />
				</c:if>
        </div>
    </section>
    



    <!-- FOOTER -->
    <footer>
        <div class="row">
            <ul class="social-links">
                <li><a href="#"><ion-icon class="ion-social-facebook" name="logo-facebook"></ion-icon></a></li>
                <li><a href="#"><ion-icon class="ion-social-twitter" name="logo-twitter"></ion-icon></a></li>
                <li><a href="#"><ion-icon class="ion-social-googleplus" name="logo-google"></ion-icon></a></li>
                <li><a href="#"><ion-icon class="ion-social-instagram" name="logo-instagram"></ion-icon></a></li>
            </ul>
        </div>
        <div class="row">
            <p>
                copyright 2018. <strong>우주슬라임</strong> All rights reserved
            </p>
            <p>
                <strong>이용약관</strong>
                <strong>개인정보처리방침</strong>
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


    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
    <script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"> </script>  
</body>
</html>