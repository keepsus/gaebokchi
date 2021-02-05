<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>       
 
<!DOCTYPE html>
<html>
<head>
 	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/quantityForm.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <title>Document</title>
</head>
<body>

	<c:set var="quantity" value="2"></c:set>
	<c:set var="unit_price" value="7500"></c:set>
	<c:set var="total_quantity" value="2"></c:set>
	<c:set var="total_price" value="${unit_price*2 }"></c:set>
	<c:set var="unit_name" value="레몬아작"></c:set>
	
	


	<div class="whole_box">
	<!-- 헤더 -->
	<div class="header">
		<div class="header_title">
			옵션 변경
		</div>
	</div><!-- end header -->
	
	
	
	
	<!-- 내용 -->
	<div class="container">
		<div class="container_div">
			<div class="up_part">
				
				<img src="/slime/image/img3.jpg" class="item_img">
				
				<div class="item_title">[크리스탈 슬라임]${unit_name }</div>
				<div class="unit_price">${unit_price }원</div>
				
			</div><!-- end up_part -->
			
			
			<div class="down_part">
			
				<div class="quantity_div_area">
					<div class="quantity_title">수량</div>
					<div class="quantity_count">
						<div class="minus_div"><a href="" class="a_minus">-</a></div>
							<input type="text" class="qty_number" value="${quantity }" readonly>
						<div class="plus_div" ><a href="" class="a_plus">+</a></div>
					</div>
				</div><!-- quantity_div -->
				
				
				<div class="quantity_price_area">
					<div class="total_quantity">총수량 ${total_quantity }개</div>
					<div class="total_price">${total_price }원</div>
				</div>	
				
			</div><!-- end down_part -->
		</div><!-- end container_div -->
	</div><!-- end container  -->




	<!-- 풋터 -->
	<div class="bottom">
		<div class="two_button_div">
			<a href="" class="cancel_Btn">취소</a>
			<a href="" class="change_Btn">변경</a>
		</div>
	</div>

</div><!-- end whole_box -->
</body>
</html>


<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>	
<script type="text/javascript" src="/slime/js/cart.js"></script>	


