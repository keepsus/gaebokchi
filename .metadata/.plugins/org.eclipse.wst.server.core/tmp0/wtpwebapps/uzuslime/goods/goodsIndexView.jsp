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
<section>
<form name="goodsIndexViewForm">
	<div class="row">
	
		<div class="nav">
			<img id="goods_image0" width="200" height="200">
			<img id="goods_image1" width="200" height="200"> 	
		</div>   
		
		<div class="section">
			상품명: <span id="goods_titleSpan"></span><br>
			제품가격 : <span id="goods_priceSpan"></span>
			할인가격 : <span id="goods_sales_priceSpan"></span><br>
			<span id="goods_contentSpan"></span>
			원산지 : <span id="goods_countrySpan"></span><br>
			적립포인트 : <span id="goods_pointSpan"></span><br>
			배송비 : <span id="goods_deli_priceSpan"></span>	
		</div>
	
		<input type="button" value="목록" onclick="location.href='goodsIndexList?pg=${pg }'">
		
		<div class="detailInformation">
			<img id="goods_image2" alt="s01e 제품상세 설명">			
		</div>
	</div>

</form>
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


<!-- side menu 모달창으로 쓰려면 필요 -->
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

<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/goods/getGoodsView',
		data: 'seq=${seq}',
		dataType: 'json',
		success: function(data){			
			console.log(data);
						
			$('#goods_image0').attr('src', '../storage/'+data.goodsDTO.goods_image0);
			$('#goods_image1').attr('src', '../storage/'+data.goodsDTO.goods_image1);
			$('#goods_image2').attr('src', '../storage/'+data.goodsDTO.goods_image2);
			$('#goods_titleSpan').text(data.goodsDTO.goods_title);			
			$('#goods_priceSpan').text(data.goodsDTO.goods_price.toLocaleString());
			$('#goods_sales_priceSpan').text(data.goodsDTO.goods_sales_price.toLocaleString());
			$('#goods_contentSpan').text(data.goodsDTO.goods_content);
			$('#goods_countrySpan').text(data.goodsDTO.goods_country);
			$('#goods_pointSpan').text(data.goodsDTO.goods_point);
			$('#goods_deli_priceSpan').text(data.goodsDTO.goods_deli_price);
			
		},
		error: function(err){
			console.log(err);
		}
	});
});
</script>

