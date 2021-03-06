<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!--★★★★★값 받아오도록 수정-->
<%-- <c:set var="total_order_price" value="10000"/>
<fmt:formatNumber value="${items.total_order_price}" pattern="#,###"/><!--금액은 ,찍기-->
<c:set var="order_id" value="202101292448"/>
<c:set var="receiver_name" value="콩콩이"/>
<c:set var="receiver_hp" value="010-0000-1234"/><!--값 받아서 '-'으로 나눠지도록 하기-->
<c:set var="delivery_addr1" value="서울시 강남구 강남대로"/>
<c:set var="delivery_addr2" value="1234"/>
<c:set var="delivery_zipcode" value="3333333"/>
<c:set var="delivery_message" value="현관 앞에 놓아주세요"/> --%>

<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="vendors/css/grid.css">
    <link rel="stylesheet" href="/slime/css/orderPayResult.css">
    <!-- <link rel="stylesheet" href="resources/css/index.css"> -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
    <title>우주슬라임</title> <!--window창에 해당 제목으로 표시-->
</head>
<body>
   
   <!-- 값 받아오기 -->
   <input type="approved_at" id="approved_at" name="approved_at" value="${info.approved_at}">
   <input type="order_id" id="order_id" name="order_id" value="${info.partner_order_id}">
   <input type="goos_title" id="goods_title" name="goods_title" value="${info.item_name}">
   <input type="order_goods_qty" id="order_goods_qty" name="order_goods_qty" value="${info.quantity}">
   <input type="total_goods_price" id="total_goods_price" name="total_goods_price" value="${info.amount.total}">
   <input type="payment_method_type" id="payment_method_type" name="payment_method_type" value="${info.payment_method_type}">
   
    <!-- HAEDER -->
    
    <header>
        <nav id="nav">
            <div class="row">
                <ul class="main-nav">
                     <!-- 화면 상단 오른쪽 아이콘 2개(장바구니, 검색) -->
                     <li><a href="#"><ion-icon name="cart-outline"></ion-icon></a></li>
                     <li><a href="#"><ion-icon name="search-outline"></ion-icon></a></li>
                </ul>
            </div>
        </nav>
    </header>

    
    <!-- SECTION 1 -->
    <section class="section-orderComplete">
        <div class="orderComplete">
            <h2 class="orderCompleteHead" style="text-align: center;">주문완료</h2>
        </div>

        <!--구매안내 메시지--><!--결제방법에 따라 다르게 표시하기-->
        <div class="orderCompleteMessage">
            <div class="orderCompleteMessage1" style="text-align: center;"><span>아래 계좌정보로 입금해 주시면</span></div>
            <div class="orderCompleteMessage2" style="text-align: center;"><span>결제 완료처리가 됩니다</span></div>
        </div>
    </section>
    

     <!-- SECTION 2 -->
    <section class="section-orderInfo">
        <div class="info-board"><!--하얀 배경 부분 테두리만, 흰색 화면은 각각 div class="~~info" 에서 잡기-->
            <div class="account-info">
                    <div class="account-info-detail-line1">
                         <div class="account-info-title"><p>입금계좌 안내</p></div><div class="account-bank-name"><p>기업은행</p></div> <!--★★★★★ 입금계좌 안내 & 기업은행 붙어서 나오게하기-->
                    </div>
                    <div class="account-info-detail-line2">
                         <div class="account-bank-number"><p>12345678911111</p></div>
                    </div>
                    <div class="account-info-detail-line3">
                         <div class="account-bank-holder"><p>(주)비트캠프크리에이티브</p></div>
                    </div>
                    <div class="account-info-detail-line4">
                         <div class="accoutn-pay-price"><p>${total_order_price}원</p></div>
                    </div>
                
            </div>    
            <div class="orderid-info">
                <div class="orderid-info-detail">
                    <br>
                    <div class="orderid-title"><p>주문번호</p></div>
                    <div class="orderid-number"><p>${order_id}</p></div>
                </div>
            </div>
            <div class="delivery-info">
                <div class="delivery-info-detail-line1">
                    <div class="delivery-info-title"><p>배송지</p></div><div class="delivery-info-receivername"><p>${receiver_name}</p></div>
                </div>
                <div class="delivery-info-detail-line2">
                    <div class="delivery-info-hp"><p>${receiver_hp}</p></div>
                </div>
                <div class="delivery-info-detail-line3">
                    <div class="delivery-info-addr1"><p>${delivery_addr1}</p></div>
                </div>
                <div class="delivery-info-detail-line4">
                    <div class="delivery-info-addr2"><p>${delivery_addr2}</p></div>
                </div>
                <div class="delivery-info-detail-line5">
                    <div class="delivery-info-zipcode"><p>${delivery_zipcode}</p></div>
                </div>
            </div>
            <div class="delivery-method-info">
                <div class="delivery-method-detail">
                    <br>
                    <div class="delivery-method-title"><p>배송방법</p></div>
                    <div class="delivery-method-service"><p>택배</p></div><!--배송방법은 택배로 고정-->
                </div>
            </div>
            <div class="delivery-message-info">
                <div class="delivery-message-detail">
                    <br>
                    <div class="delivery-message-title"><p>배송메모</p></div>
                    <div class="delivery-message-message"><p>${delivery_message}</p></div>
                </div>
            </div>
        </div>
        <div class="gohome">
            <button type="button" class="go_homeBtn" id="go_homeBtn" name="go_homeBtn" style="cursor:pointer;">홈으로</button>
        </div>
        
    </section>
<script type="text/javascript">
$(document).ready(frunction(){
	var approved_at = ${info.approved_at};
	alert(approved_at);
});
</script>
</body>
</html>