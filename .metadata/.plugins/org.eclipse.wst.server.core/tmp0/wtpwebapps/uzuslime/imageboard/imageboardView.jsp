<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta charset="UTF-8">

<style type="text/css">
body {
	margin: 0;
	padding: 0;
	height: 100%;
}

#header {
	width: 100%;
	height: 10%;
	text-align: center;
}

#container {
	width: 100%;
	height: 500px;
}

#nav {
	width: 5%;
	height: 100%;
	float: left;
}

#section {
	width: 94%;
	height: 100%;
	float: left;
}

</style>
</head>
<body>
<div id="header">
	<h1>우주슬라임</h1>
</div>

<form name="imageboardViewForm">
<img id="goods_filename" width="500" height="500"><br>
상품번호 : <span id="goods_idSpan"></span><br>
상품명 : <span id="goods_titleSpan"></span><br>
원산지 : <span id="goods_country_of_originSpan"></span><br>
상품원래가격 : <span id="goods_priceSpan"></span><br>
상품판매가격 : <span id="goods_sales_priceSpan"></span><br>
적립포인트 : <span id="goods_pointSpan"></span><br>
추천여부 : <span id="goods_statusSpan"></span><br>
배송비 : <span id="goods_delivery_priceSpan"></span><br>
배송소요일 : <span id="goods_delivery_dateSpan"></span><br>
도서산간배송비 : <span id="goods_extra_chargeSpan"></span><br>
조건부무료배송 : <span id="goods_delivery_free_conditionSpan"></span>원이상 구매시 무료배송<br>
<a href="/slime/order/orderOneGoodsForm">상세제품 주문하기</a><br>
<!-- 상품이미지 --><img id="goods_filename_detail"><br>
상품 설명 : <span id="goods_contextSpan"></span><br>
<pre class="contents">
					<span id="goods_contextSpan"></span>
				</pre>
	<input type="button" value="목록"
		onclick="location.href='imageboardList?pg=${pg }'">
</form>

<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				$.ajax({					
					type : 'post',
					url : '/slime/imageboard/getImageboardView',
					data : 'goods_id=${goods_id}',
					dataType : 'json',
					success : function(data) {
						console.log(data);

						
						$('#goods_filename').attr(
								'src',
								'../storage/'
										+ data.imageboardDTO.goods_filename);
						$('#goods_idSpan').text(
								data.imageboardDTO.goods_id
										.toLocaleString());
						$('#goods_titleSpan').text(
								data.imageboardDTO.goods_title);
						$('#goods_country_of_originSpan').text(
								data.imageboardDTO.goods_country_of_origin);
						$('#goods_priceSpan').text(
								data.imageboardDTO.goods_price
										.toLocaleString());
						$('#goods_sales_priceSpan').text(
								data.imageboardDTO.goods_sales_price
										.toLocaleString());
						$('#goods_pointSpan').text(
								data.imageboardDTO.goods_point
										.toLocaleString());
						$('#goods_delivery_priceSpan').text(
								data.imageboardDTO.goods_delivery_price
										.toLocaleString());
						$('#goods_delivery_dateSpan').text(
								data.imageboardDTO.goods_delivery_date
										.toLocaleString());
						$('#goods_delivery_extra_chargeSpan').text(
								data.imageboardDTO.goods_delivery_extra_charge
										.toLocaleString());
						$('#goods_delivery_free_conditionSpan').text(
								data.imageboardDTO.goods_delivery_free_condition
										.toLocaleString());
						$('#goods_statusSpan').text(
								data.imageboardDTO.goods_status);
						$('#goods_filename_detail').attr(
								'src',
								'../storage/'
										+ data.imageboardDTO.goods_filename_detail);
						$('#goods_contextSpan').text(
								data.imageboardDTO.goods_context);
					},
					error : function(err) {
						console.log(err);
					}
				});
			});
</script>

</body>
</html>











