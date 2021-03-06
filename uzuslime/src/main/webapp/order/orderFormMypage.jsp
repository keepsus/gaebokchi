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
<c:set var="delivery_state" value="입금대기"/>
<c:set var="goods_price" value="8500"/>
<c:set var="order_goods_qty" value="1"/>
<c:set var="delivery_price" value="2500"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/grid.css">
    <link rel="stylesheet" href="/slime/css/normalize.css">
    <link rel="stylesheet" href="/slime/css/orderFormMypage.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
<title>우주슬라임</title>
</head>
<body>

     <!-- section2 -->
     <section class="orderForm-wrap">
        <div class="order-box"><!-- 초록박스 -->
            <span class="arrow"><a href="#"><img src="/slime/image/back.jpg"></a></span>
            <span class="orderForm-ordererInfo">
                <span class="orderForm-orderid-title">주문번호</span>
                <span class="orderForm-orderid-number">${order_id}</span>
                <!--DB에 저장된 값 가져오기, 해당 회원(member)과 구매정보(order)테이블 연결필요-->
            </span>
            <span class="orderForm-orderdate">
                <span class="orderForm-orderdate-title">주문일자</span>
                <span class="orderForm-orderdate-date">${pay_order_time}</span><!--DB에 저장된 값 가져오기-->
            </span>
        </div>
        <div class="row">
            <div class="col span-1-of-2">
                <div class="orderInfo-boxAndpayInfo-box"><!--초록박스-->
                    <div class="orderInfo-box"><!--주황박스-->
                        <h3 class="jumun">주문정보</h3><!--보라 박스-->
                        <div class="orderInfo-orderer"><!--보라 박스-->
                            <p class="orderInfo-ordererTitle">주문자</p>
                            <div class="orderInfo-ordererInfo">
                                <span class="orderInfo-ordererName">${orderer_name}</span>
                                <span class="orderInfo-ordererHp"> / ${orderer_hp}</span>
                                <p class="orderInfo-ordererEmail">${orderer_email}</p>
                            </div>
                        </div>
                        <div class="orderInfo-delivery"><!--보라박스-->
                            <p class="orderInfo-deliveryTitle">배송정보</p>
                            <div class="orderInfo-receiver">
                                <div class="orderInfo-receiverInfo">
                                    <span class="orderInfo-receiverName">${receiver_name}</span>
                                    <span class="orderInfo-receiverHp"> / ${receiver_hp}</span>
                                </div>
                                <div class="orderInfo-address">
                                    <span class="orderInfo-zipcode">(${delivery_zipcode})</span>
                                    <span class="orderInfo-addr1">${delivery_addr1}</span>
                                </div>
                                <div class="orderInfo-address2">
                                    <span class="orderInfo-addr2">${delivery_addr2}</span>
                                </div>
                                <div class="orderInfo-infoModify"><a href="#"><img src="/slime/image/infoModifyBtn.jpg"></a></div><!--클릭하면 배송지수정화면 뜨게하기-->
                                <div class="orderInfo-Message">
                                    <p class="orderInfo-deliveryMessageTitle">배송메모</p>
                                    <span class="orderInfo-deliveryMessage">${delivery_message}</span><!--선택하지 않은 경우 '없음'으로 떠야함、JS사용-->
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="payInfo-box"><!--주황박스-->
                        <h3 class="gyuljae">결제정보</h3>
                        <div class="payInfo-payMethodInfo">
                            <p class="payInfo-payMethodTitle">결제방법</p>
                            <p class="payInfo-payMethod">${pay_method}</p>
                        </div>
                        <div class="payInfo-accountInfo">
                            <p class="payInfo-accountTitle">계좌 정보</p>
                            <div class="payInfo-bankInfo">
                                <span class="payInfo-accountName">기업은행</span>
                                <span class="payInfo-accountNumber">12345678911111</span>
                                <span class="payInfo-accountholderName">예금주 : (주)비트캠프크리에이티브</span>
                            </div>
                            <div class="payInfo-cashreceipt">
                                <p class="payInfo-cashreceiptTitle">현금영수증</p>
                                <div class="payInfo-cashreceiptBtn"><a href="#"><img src="/slime/image/cashreceiptBtn.jpg"></a></div>
                            </div> 
                            <p class="payInfo-cashreceiptMessage">주문일로부터 5일이 지나면 신청이 불가능합니다</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col span-1-of-2">   
                <div class="goodsInfo-box"><!--초록박스-->
                    <h3 class="sangpum">상품정보</h3>
                        <div class="goodsInfo-orderGoodsInfo">
                            <span class="goodsInfo-image"><img src="/slime/image/${goods_filename}"></span>
                            <!--★★★★★★장바구니에서 결제기능 구현 후 여러개일때 어떻게 표시할지 ~~외 1개 -->
                            <span class="goodsInfo-goodsTitleAndDeliveryState">
                                <span class="goodsInfo-goodsTitle">${goods_title}</span>
                                <span class="goodsInfo-deliveryState">${delivery_state}</span>
                            </span>
                            <br>
                            <div class="goodsInfo-priceAndQty">
                                <span class="goodsInfo-totalPrice">${goods_price}원</span>
                                <span class="goodsInfo-totalQty"> / ${order_goods_qty}개</span>
                            </div>
                        </div>
                    <!--작업하면서 수정필요-->
                    <div class="orderCancle"><a href="#"><img src="/slime/image/orderCancleBtn.jpg"></a></div>
                    <div class="goodsInfo-goodsAndDeliveryPrice">
                        <div class="goodsInfo-priceInfo">
                            <span class="goodsInfo-priceTitle">상품가격</span>
                            <span class="goodsInfo-goodsprice">${goods_price * order_goods_qty}원</span> <!--장바구니 기능구현 후 수정 필요할듯 -->
                        </div>
                        <div class="goodsInfo-deliveryPriceInfo">
                            <span class="goodsInfo-deliveryPriceTitle">배송비</span>
                            <span class="goodsInfo-deliveryPrice">${delivery_price}원</span>
                        </div>
                    </div>
                    <div class="goodsInfo-totalPriceInfo">
                        <span class="goodsInfo-totalPriceTitle">총 결제금액</span>
                        <span class="goodsInfo-finalTotalPrice">${total_order_price = goods_price * order_goods_qty + delivery_price}원</span>
                    </div>
                </div>
            </div>
        </div>   
     </section>
</body>
</html>