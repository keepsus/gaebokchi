<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/spring/css/quantityForm.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap"
	rel="stylesheet">
<title>Document</title>
</head>
<body>


	<%-- <c:set var="order_goods_qty" value="2"></c:set>
	<c:set var="goods_sales_price" value="7500"></c:set>
	<c:set var="order_goods_total_qty" value="2"></c:set>
	<c:set var="order_goods_price" value="${goods_sales_price*2 }"></c:set>
	<c:set var="goods_title" value="레몬아작"></c:set> --%>




	<div id="whole_box" class="whole_box">
		<!-- 헤더 -->
		<div class="header">
			<div class="header_title">옵션 변경</div>
		</div>
		<!-- end header -->




		<!-- 내용 -->
		<div class="container">
			<div class="container_div">
				<div class="up_part">

					<img src="/slime/image/img3.jpg" class="item_img">

					<div class="item_title">[크리스탈 슬라임]${goods_title }</div>
					<div class="unit_price" id="unit_price">${goods_sales_price }원</div>

				</div>
				<!-- end up_part -->


				<div class="down_part">

					<div class="quantity_div_area">
						<div class="quantity_title">수량</div>

						<div class="quantity_count">
							<div class="minus_div">
								<a role="button" href="javascript:change_qty('m')"
									class="a_minus" id="a_minus_Btn">-</a>
							</div>
							<input type="text" id="cart_qty" class="qty_number"
								value="${order_goods_qty }" readonly>
							<div class="plus_div">
								<a role="button" href="javascript:change_qty('p')"
									class="a_plus" id="a_plus_Btn">+</a>
							</div>
						</div>
					</div>
					<!-- quantity_div -->


					<div class="quantity_price_area">
						<div class="total_quantity">
							총수량 <span id="total_quantity">${order_goods_total_qty}</span>개
						</div>
						<div class="total_price" id="total_price">${order_goods_price }원</div>
					</div>

				</div>
				<!-- end down_part -->

			</div>
			<!-- end container_div -->
		</div>
		<!-- end container  -->

		<!-- Footer -->
		<div class="bottom">
			<div class="two_button_div">
				<a href="" class="cancel_Btn">취소</a> <a href="" class="change_Btn">변경</a>
			</div>
		</div>

	</div>
	<!-- end whole_box -->
</body>
</html>


<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<!-- <script type="text/javascript" src="/slime/js/cart_quantity.js"></script> -->
<script type="text/javascript">
	

	//Number속성에 대한 포멧
	Number.prototype.format = function() {

		if (this == 0)
			return 0;

		var reg = /(^[+-]?\d+)(\d{3})/;
		var n = (this + '');

		while (reg.test(n))
			n = n.replace(reg, '$1' + ',' + '$2');
		return n;
	};
	//String속석에 대한 포멧
	String.prototype.format = function() {
		var num = parseFloat(this);
		if (isNaN(num))
			return "0";
		return num.format();
	};
	
	//전역변수
	var basic_amount = parseInt('15000');
	
	/* 수량 변경 이벤트 함수 ******************
	 * +버튼 -버튼 눌렸을때 실행되는 함수 
	 ***********************************/
	function change_qty(t) {
		//var min_qty = '수량버튼'*1;
		var min_qty = 1;
		var this_qty = $("#cart_qty").val() * 1;
		var max_qty = '10'; // 현재 재고 i
		if (t == "m") {
			this_qty -= 1;
			if (this_qty < min_qty) {

				//alert("최소구매수량 이상만 구매할 수 있습니다.");
				alert("수량은 1개 이상 입력해 주십시오.");
				return;
			}

		} else if (t == "p") {

			this_qty += 1;
			if (this_qty > max_qty) {
				alert("죄송합니다. 재고가 부족합니다.");
				return;
			}
		}

		var show_total_amount = basic_amount * this_qty; //총금액
		var show_total_qty = this_qty;//총수량
		//$("#cart_qty_txt").text(this_qty);
		$("#cart_qty").val(this_qty); //총수량
		$("#it_pay").val(show_total_amount);
		$("#total_price").html(show_total_amount.format());
		$("#total_quantity").html(show_total_qty.format());
	}
	
</script>

















