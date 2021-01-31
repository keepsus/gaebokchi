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
    <link rel="stylesheet" href="/slime/css/myPage.css">
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
                <ul class="main-nav">
                    
                    <!-- <li><a href="#">로그인</a></li> -->
                    <li><a href="../member/memberLoginForm.jsp" rel="modal:open">로그인</a></li>
                    <!-- <li><a href="#">회원가입</a></li> -->
                    <li><a href="#">회원가입</a></li>
                    <li><a href="#">장바구니</a></li>
                    <!-- <li><a href="#">검색</a></li> -->
                    <li><a href="#"><ion-icon name="search-outline"></ion-icon></a></li>
                </ul>
            </div>
        </nav>
    </header>
    
    <!---------------------->
    <!---------MENU--------->
    <!---------------------->
    <section class="sidebar-section">
        <div class="menu-left">
            <span class="openMenu" onclick="openNav()"><ion-icon name="menu-outline"></ion-icon></span>
        </div>
        <div class="menu-center">
            <a href="../index.jsp">크리스탈 슬라임</a>
        </div>
    </section>




    <!---------------------->
    <!--------SIDEBAR------->
    <!---------------------->
    <div id="mySideNav" class="sideNav">
        <a href="" class="closeBtn" onclick="closeNav()">X</a>
        <a href="#" style="margin-top: 20px; font-size: 150%;"><ion-icon name="rocket-outline"></ion-icon></a>
        <a href="../index.jsp" style="margin-top: 20px;">크리스탈 슬라임</a>
    </div>


    <!-- SECTION -->
    <section>
        <div class="row">
            <div class="list-wrap">
                <ul class="menu-links">
                    <li><a href="#">주문 조회</a></li>
                    <li><a href="#">위시 리스트</a></li>
                    <li><a href="#">취소/교환/반품</a></li>
                    <li><a href="#">쿠폰</a></li>
                    <li><a href="#">포인트</a></li>
                    <li><a href="#">1:1 문의</a></li>
                    <li><a href="#">정보 수정</a></li>
                    <li><a href="#">회원탈퇴</a></li>
                </ul>
            </div>
            <div class="box-wrap">
                    <div class="member-box">
                        <span>[]님 안녕하세요.</span>
                        <div>누적 구매금액 : []원</div>
                    </div>
                    <div class="point-box">
                        <p>포인트</p>
                        <span>[]</span>
                    </div>
                    <div class="coupon-box">
                        <p>쿠폰</p>
                        <span>[]</span>
                    </div>
            </div>
            <div class="order-history">
                <div>[]주문 내역이 없습니다.</div>
            </div>
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