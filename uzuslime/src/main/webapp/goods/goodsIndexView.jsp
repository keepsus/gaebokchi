<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/slime/css/grid.css">
<link rel="stylesheet" href="/slime/css/normalize.css">
<link rel="stylesheet" href="/slime/css/index.css">
<link rel="stylesheet" href="/slime/css/myPageOrder.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
<title>우주슬라임-제품상세 페이지</title>  


<!---------------------->
<!--------HAEDER-------->
<!---------------------->
<header>
	<nav>
		<div class="row">       			
			<a href="../index.jsp"><img src="/slime/image/logo.jpg" alt="slime logo" class="logo"></a>
			<jsp:include page="../indexNav.jsp"/>           
		</div>
	</nav>	
</header>  


<!--------------------------->
<!--------SIDEBAR-MENU------->
<!--------------------------->
<jsp:include page="../sideMenu.jsp"/>      


<!-- SECTION -->
<form name="goodsIndexViewForm" id="goodsIndexViewForm">

	<div class="row">
		<div class="col span-1-of-2" >
			<img id="goods_image0Span" name="goods_image0Span" alt="제품 메인 이미지" width="200" height="200">
			<img id="goods_image1Span" name="goods_image1Span" alt="제품 서브 이미지"width="200" height="200"> 	
		</div>   
		
		<div class="col span-1-of-2">
			상품번호: <span id="goods_idSpan"></span><br>
			상품명: <span id="goods_titleSpan"></span><br>
			제품가격 : <span id="goods_priceSpan"></span> 원<br>
			할인가격 : <span id="goods_sales_priceSpan"></span> 원<br>
			제품설명 : <span id="goods_contentSpan"></span><br>
			원산지 : <span id="goods_countrySpan"></span><br>
			적립포인트 : <span id="goods_pointSpan"></span> 포인트<br>
			배송비 : <span id="goods_deli_priceSpan"></span> 원<br>
			재고수량 : <span id="goods_qtySpan"></span> EA<br>
			
			<!-- 강사님 알려주신 소스, max 확인용 코드 -->
			<input type="hidden" id="stock" value="">
			
			<!-- 참고소스 시작부분 -->								
			<p class="cartStock">		
				구입수량 : 				
				<button type="button" class="plus">+</button>
				<span id="numboxSpan"></span>
				<button type="button" class="minus">-</button>					
			</p>	
			
			<input type="button" value="목록" onclick="location.href='goodsIndexList?pg=${pg }'">
			<input type="button" value="주문하기" id="goodsOrderBtn">
			<input type="button" value="장바구니" id="goodsCartBtn">
			
		</div>
	
		
		<div class="detailInformation">
			<img id="goods_image2Span" alt="제품상세 설명">			
		</div>
	</div>

</form>



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


<!-- ↓↓↓↓↓side menu 모달창으로 쓰려면 필요↓↓↓↓↓  -->
<script>
function openNav() {
	document.getElementById('mySideNav').style.width = '250px';
}
function closeNav() {
	document.getElementById('mySideNav').style.width = '0';
}
</script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script><!---->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script><!---->
<script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"> </script>
<!-- ↑↑↑↑↑side menu 모달창으로 쓰려면 필요↑↑↑↑↑ -->

<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src= "/slime/js/goods.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/goods/getGoodsView',
		data: 'seq=${seq}',
		dataType: 'json',
		success: function(data){			
			console.log(data);
			
			/* --id에 한 곳에만 값이 입력됨, 만약 goods_qty 값을 여러곳에 쓰고 싶으면 받는 곳의 id 값을 각각 다르게 잡아 줘야 한다.
			$('#goods_qtySpan').text(data.goodsDTO.goods_qty);
			$('#goods_qtySpanAA').text(data.goodsDTO.goods_qty);
			*/
			$('#goods_idSpan').text(data.goodsDTO.goods_id);
			$('#goods_image0Span').attr('src', '../storage/'+data.goodsDTO.goods_image0);
			$('#goods_image1Span').attr('src', '../storage/'+data.goodsDTO.goods_image1);
			$('#goods_image2Span').attr('src', '../storage/'+data.goodsDTO.goods_image2);
			$('#goods_titleSpan').text(data.goodsDTO.goods_title);			
			$('#goods_priceSpan').text(data.goodsDTO.goods_price);
			$('#goods_sales_priceSpan').text(data.goodsDTO.goods_sales_price);
			$('#goods_contentSpan').text(data.goodsDTO.goods_content);
			$('#goods_countrySpan').text(data.goodsDTO.goods_country);
			$('#goods_pointSpan').text(data.goodsDTO.goods_point);
			$('#goods_deli_priceSpan').text(data.goodsDTO.goods_deli_price);
			$('#goods_qtySpan').text(data.goodsDTO.goods_qty);
			$('#stock').val(data.goodsDTO.goods_qty); //max 확인용 코드
		
			/*
			구매수량 부분 - 
			-. json 으로 작업을 하면 방법이 없어서, 지저분하지만 html 에다가 소스를 모두 넣음. -> 구동은 됨
			-. https://kuzuro.blogspot.com/2018/10/15_13.html-> 얘 처럼하면 json 사용하지 않고 java_ee 때 처럼 객체로 받아오는 거임.
			-. spaceBar 도 모두 인식함. 다 붙여서 코드작성 할 것!!!
			-. 이렇게 하면 'goods_qty' 사용할 때마다 아래 처럼 써야한다... 
			*/
			if(data.goodsDTO.goods_qty == 0) {
				$('#numboxSpan').text("재고가 없습니다.");
			}else{
				$('#numboxSpan').html('<input type="number" name="numbox" class="numbox" min="1" value="1" max="'+data.goodsDTO.goods_qty+'" readonly>');
			}
		},//success
		
		error: function(err){
			console.log(err);
		}//error
	});//ajax	
});//ready
</script>