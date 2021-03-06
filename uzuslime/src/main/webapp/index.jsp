<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URL" %>
<%@ page import="java.net.HttpURLConnection" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/slime/css/grid.css">
<link rel="stylesheet" href="/slime/css/normalize.css">
<link rel="stylesheet" href="/slime/css/index.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" /><!---->
<title>우주슬라임</title>   

<style>
	.logo{
		margin-top: 20px;
	}
</style>

<!---------------------->
<!--------HAEDER-------->
<!---------------------->
<header>
	<nav id="nav">       			
		<a href="/slime/index.jsp"><img src="/slime/image/logo.jpg" alt="slime logo" class="logo"></a>
		<jsp:include page="indexNav.jsp"/>           
	</nav>
</header>  

<!--------------------------->
<!--------SIDEBAR-MENU------->
<!--------------------------->
<jsp:include page="sideMenu.jsp"/>      


<!---------------------->
<!-------SECTION------->
<!---------------------->
<section class="section-features1">
    <div class="hero-text-box">
        <h1>enjoy staying at home <br>with slime</h1>
    </div>
</section>

<!---------------------->
<!-------SECTION2------->
<!---------------------->
<section class="section-features2">
	
	
	
	<!------------------->
	<!-- 제품뿌려주는 위치 -->
    <div class="wrap">    
    	<div id="goodsIndexList" align="center">	    	
	</div>
	<!-- 제품뿌려주는 위치 -->
	<!------------------->
	
	
	<p class="md-choice"><strong>MD추천</strong></p>
	</div>
   
   <div class="md-wrap">
       <div class="md-item-wrapper">
           <a href="/slime/detailpage/detailPage.jsp">
               <div class="imgTransform">
                   <img src="/slime/image/img1.jpg" alt="img1" class="md-item-img">
               </div>
           </a>
           <a href="/slime/detailpage/detailPage.jsp">
               <div>
                   <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2> <!--데이터-->
                   <div class="item-price">
                       <p class="sale-price">세일가</p><!--데이터-->
                       <p class="normal-price">정상가</p><!--데이터-->
                   </div>
                   <div>
                       <div class="sale-icon">sale</div><!--데이터-->
                       <div class="md-icon">md</div><!--데이터-->
                    </div>
                </div>
            </a>
        </div>
        
        <div class="md-item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img2.jpg" alt="img2" class="md-item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>

        <div class="md-item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img3.jpg" alt="img3" class="md-item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>

        <div class="md-item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img4.jpg" alt="img4" class="md-item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>
    </div>    
    
</section>

<!---------------------->
<!-------SECTION3------->
<!---------------------->
<section>
    <div class="row">
        <p class="icon"><ion-icon name="planet-outline"></ion-icon></p>
        <p class="icon-text">Handmade Slime</p>
        <p class="dash">&mdash;</p>
        <p class="product">product</p>
        <p class="product-text">
            슬라임은 감촉과 소리를 통해 스트레스를 해소하고, 정서적 안정에 도움을 주는 제품입니다. 
            <br>본 제품은 Hand•Made 제품이며, 인체에 무해한 재료로 만들었습니다.
        </p>
        <hr>
    </div>
</section>

<!---------------------->
<!-------SECTION4------->
<!---------------------->
<section>
    <div class="row">
        <p class="md-choice"><strong>크리스탈 슬라임</strong></p>
    </div>

    <div class="wrap">
        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img4.jpg" alt="img4" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2><!--데이터-->
               <div class="item-price">
                   <p class="sale-price">세일가</p><!--데이터-->
                   <p class="normal-price">정상가</p><!--데이터-->
               </div>
               <div>
                   <div class="sale-icon">sale</div><!--데이터-->
                   <div class="md-icon">md</div><!--데이터-->
                </div>
            </div>
        </div>
        
        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img5.jpg" alt="img5" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>

        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img6.jpg" alt="img6" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>
    </div><!-- class="wrap" -->  

    <div class="wrap">
        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img7.jpg" alt="img7" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>
        
        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img8.jpg" alt="img8" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>

        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img9.jpg" alt="img9" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>
    </div><!-- class="wrap" -->  

    <div class="wrap">
        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img10.jpg" alt="img10" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>
        
        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img11.jpg" alt="img11" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>

        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img12.jpg" alt="img12" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>
    </div><!-- class="wrap" --> 

    <div class="wrap">
        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img13.jpg" alt="img13" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>
        
        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img14.jpg" alt="img14" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>

        <div class="item-wrapper">
            <div class="imgTransform">
                <img src="/slime/image/img15.jpg" alt="img15" class="item-img">
            </div>
            <div>
                <h2 class="item-title">[크리스탈 슬라임]&nbsp;네온시드</h2>
                <div class="item-price">
                    <p class="sale-price">세일가</p>
                    <p class="normal-price">정상가</p>
                </div>
                <div>
                    <div class="sale-icon">sale</div>
                    <div class="md-icon">md</div>
                </div>
            </div>
        </div>
    </div><!-- class="wrap" --> 

</section>

<!---------------------->
<!-------SECTION5------->
<!---------------------->
<section>
    <div class="row">
        <div class="produce-item">
            <p class="produce-text1"><ion-icon name="rocket-outline"></ion-icon></p>
            <p class="produce-text2">이런 재료로 만들어져요.</p>
            <p class="produce-text3">엘머스스쿨글루, 엘머스글루올, 아모스물풀, 종이나라 착풀을 사용하여 제작합니다.</p>
        </div>
    </div>
    <div class="row">
            <img src="/slime/image/produce.jpg" alt="produce" class="produce-img">
    </div>
</section>

<!---------------------->
<!-------SECTION6------->
<!---------------------->
<section class="section-row">
    <div class="row">
        <div class="col span-1-of-3">
            <h4>고객센터</h4>
            <p>전화문의 070.4352.0860<br>
                평일 오전 10시 - 오후 6시<br>
                주말 & 공휴일 휴무</p>
        </div>
        <div class="col span-1-of-3">
            <h4>1:1 문의</h4>
            <p>궁금한 점이 있으면 문의주세요.<br>
                친철히 답변해 드리고 있습니다.<br>
                1:1 문의 게시판을 이용해주세요.</p>
        </div>
        <div class="col span-1-of-3">
            <h4>배송정보</h4>
            <p>50,000원 이상 무료배송<br>
                오후 1시까지 주문 건 당일배송</p>
        </div>
    </div>
</section>


<!--footer-->

<footer>
    <div class="row">
        <div class="col span-1-of-4">
            <ul class="footer-nav">
                <h3><strong>우주슬라임</strong></h3>
                <p>상호명 : 핌크리에이티브</p>
                <p>대표자 : 신동환</p>
                <p>사업자등록번호 : 105-88-00230</p>
                <p>서울시 강남구 테헤란로83길 18,<br> 매직킹덤빌딩 10층</p>
                <p>통신파매업 제2015-서울강남-03630호</p>
                <p>사업자 정보확인</p>
            </ul>
        </div>
        <div class="col span-1-of-4">
            <div class="footer-nav">
                <h3><strong>무통장입금</strong></h3>
                <p>137-090127-01-022</p>
                <p>기업은행</p>
                <p>(주)핌크리에이티브</p>
            </div>
        </div>
        <div class="col span-1-of-4">
            <div class="footer-nav">
                <h3><strong>고객센터</strong></h3>
                <p>010-2104-2264</p>
                <p>카카오톡 : uzuslime</p>
                <p>월요일 - 금요일 AM 10:00 - 19:00</p>
                <p>문의 : uzuslime@naver.com<br><br></p>
                <p>[반품/교환지 주소]</p>
                <p>경기도 김포시 양촌읍 학운리 3342</p>
                <p>(주)철저한 물류. 우주슬라임</p>
            </div>
        </div>
        <div class="col span-1-of-4">
            <div class="social-links">
                <li><a href="https://www.facebook.com/uzuslime"><ion-icon class="ion-social-facebook" name="logo-facebook"></ion-icon></a></li>
                <li><a href="https://twitter.com/?lang=ko"><ion-icon class="ion-social-twitter" name="logo-twitter"></ion-icon></a></li>
                <li><a href="https://www.instagram.com/uzuslime/"><ion-icon class="ion-social-googleplus" name="logo-google"></ion-icon></a></li>
                <li><a href="https://www.instagram.com/uzuslime/"><ion-icon class="ion-social-instagram" name="logo-instagram"></ion-icon></a></li>
            </div>
        </div>
    </div>
    <div class="row " id="row">
        <p>
            copyright 2018. <strong>우주슬라임</strong> All rights reserved
        </p>
        <p>
            이용약관 <i class="ion-ios-heart" style="color: #ea0000; padding: 0 3px;"></i> 개인정보처리방침
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


<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script><!---->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script><!---->
<script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"> </script>

<script type = "text/javascript">//index.jsp 에 goodsList 뿌려주는 소스
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/goods/getGoodsIndexList',
		dataType: 'json',
		success: function(data){
 			//$('#goodsIndexList').html("<div style='color:red; font-weight:bold'>css 먹히나여?</div>");
			//alert(JSON.stringify(data)); 
 			//console.log(data);			
 			$.each(data.list, function(index, items){
 				$('<div class="item-wrapper"/>').append($('<div class="imgTransform">',{
 	 				}).append($('<img/>',{
	 					src: '/slime/storage/'+items.goods_image0,
	 					style: 'width: 400px; cursor: pointer;',
	 					class: items.seq+''
	 					}))					
 				).append($('<div/>',{
 					align: 'center',
 					text: items.goods_title,
 					
 				})).append($('<span/>',{
 					align: 'center',
					text: "정상가 : "+items.goods_sales_price
					
 				})).append($('<br>')).append($('<span/>',{
 	 				align: 'center',
 					text: "세일가 : "+items.goods_price
 						
  	 			})).appendTo($('#goodsIndexList'));
 				
 												
 				//이미지 보기
				$('.'+items.seq).click(function(){
					location.href="/slime/goods/goodsIndexView?seq="+items.seq+"&pg="+data.pg;
				});
 				
 			});//each
 			
		},//success
		
		error: function(err){
			console.log(err);
		}//error		
		
	});//ajax
});//ready

</script>