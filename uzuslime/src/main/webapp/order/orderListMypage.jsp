<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="cancleBtnOrCancleDetailBtn" value="cancleDetailBtn.jsp"/>
<c:set var="order_id" value="202101310001"/>
<c:set var="pay_order_time" value="2021-01-31"/>
<c:set var="goods_title" value="[버터슬라임]버터슬라임"/>
<c:set var="delivery_state" value="입금대기"/>
<c:set var="total_goods_price" value="8500"/>
<c:set var="order_goods_qty" value="1"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/grid.css">
    <link rel="stylesheet" href="/slime/css/normalize.css">
    <link rel="stylesheet" href="/slime/css/orderListMypage.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
<title>우주슬라임</title>
</head>
<body>
	<!-- section2 -->
    <section class="box-wrap">
	           <div class="orderList-row1">
	               <span class="orderList-orderId">${order_id}</span>
	               <span class="orderList-orderFormBtn"><a href="#"><img src="/slime/image/orderFormBtn.jpg"></a></span>
	               <span class="orderList-orderDate">주문일자 ${pay_order_time}</span>
	               <p></p>
	           </div>
	           <div class="orderList-row2">
	               <span class="orderList-orderFileName"><img src="/slime/image/${order_filename}"></span>
	               <span class="orderList-goodsTitle">${goods_title}</span>
				   <span></span>
				   <span class="orderList-deliveryState">${delivery_state}</span>
	               <span class="orderList-cancleBtn"><a href="#"><img src="/slime/${cancleBtnOrCancleDetailBtn}"></a></span>
				   <br><br>
				   <span class="totalGoodsPriceAndorderGoodsQty">
						<span class="orderList-totalGoodsPrice">${total_goods_price}원</span>
						<span class="orderList-orderGoodsQty"> / ${order_goods_qty}개</span> 
				   </span>
	           </div>
    </section>
</body>
</html>