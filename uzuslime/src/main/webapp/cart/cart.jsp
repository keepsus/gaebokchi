<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/grid.css">
    <link rel="stylesheet" href="/slime/css/normalize.css">
    <link rel="stylesheet" href="/slime/css/index.css">
    <link rel="stylesheet" href="/slime/css/cart.css">
    <link rel="stylesheet" href="/slime/css/myPage.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" /><!---->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
	<title>우주슬라임</title>
</head>

<!-- 자체값 주기 -->
<c:set var="unit_quantitiy" value="1"></c:set>
<c:set var="unit_price" value="7500"></c:set>
<c:set var="deliv_fee" value="2500"></c:set>
<c:set var="total_price" value="${unit_price + deliv_fee }"></c:set>
<c:set var="point" value="-"></c:set>

<c:set var="unit_original_price" value="9000"></c:set>
<c:set var="unit_price" value="7500"></c:set>
<c:set var="unit_name" value="레몬아작"></c:set>



<body>

	<!---------------------->
    <!--------HAEDER-------->
    <!---------------------->
    <header>
        <nav>
            <div class="row">
                <a href="../index.jsp"><img src="/slime/image/logo.jpg" alt="slime logo" class="logo"></a>
                <ul class="main-nav">
                    
                  
                    <li><a href="../mypage/myPage.jsp">마이페이지</a></li>
                    <li><a href="../cart/cart.jsp" >장바구니</a></li>
                    <!-- <li><a href="#">검색</a></li> -->
                    <li><a href="../qna/qnaBoardList.jsp">Q & A</a></li>
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
            <a href="index.jsp">크리스탈 슬라임</a>
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



<!-- -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->
<!-- -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->
<!-- -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -->
<!-- 장바구니 -->
<!-- 장바구니 -->

<div class="content">
<div class="cart_box">


	<div class="cart_content">
	
		<div class="cart_title_box">
			<div class="cart_title_content">
						<span>장바구니</span>
						<!-- <img class="cart_item_count">3 -->
				
			</div><!-- cart_title_content -->
		</div><!-- end cart_title_box -->
		
	<!-- 장바구니 항목 테이블 -->	
	<div class="item_table">
	
	<table >
				<tr>
						<th class="whole_checkbox_info"><input type="checkbox"></th>
						<th class="item_info"><span class="hidden-sm hidden-xs">item</span>
						<th class="wish_info"><span class="hidden-sm hidden-xs">위시</span></th>
						<th class="quantity_info"><span class="hidden-sm hidden-xs">수량</span></th>
						<th class="deliv_way_info"><span class="hidden-sm hidden-xs">배송수단</span></th>
						<th class="deliv_fee_info"><span class="hidden-sm hidden-xs">배송비</span></th>
						<th class="price_info"><span class="hidden-sm hidden-xs">가격</span></th>
						<th ></th>
				</tr>
				
				
	</table>
	</div><!-- end item_table -->
	
	<!-- 장바구니 담긴 테이블 -->	
	<div class="item_list">
	
	<table >
				<tr>
						<td class="part_checkbox"><input type="checkbox" class="part_checkbox_click"></td>
						<td class="item_info_detail">
							<a class="cart_selected_item">
								<img src="/slime/image/img3.jpg" class="cart_item_img"  onClick="location.href='/slime/detailpage/detailPage.jsp'">
							</a>
							<div class="item_view_name_div">
								<a class="item_view_name">[크리스탈 슬라임]${unit_name }</a>
							</div>
						</td>
						<td class="wish_icon">
							<!-- 하트 누르기전 -->
							<%-- <c:if test="${sessionScope.heart_check == 0 }">	
								<a href="" class="a_wish_icon" id="a_wish_icon">
									<i class="far fa-heart"></i>
								</a>
							</c:if>	 
							<!-- 하트 누른후 -->
							<c:if test="${sessionScope.heart_check == 1 }">	--%>
								<a href="" class="a_wish_icon" id="a_wish_icon">
									<i class="fas fa-heart"></i>
								</a>
							<%-- </c:if>	 --%>
						</td>
						
						<td class="quantity_detail">
							<div class="quantity_kind" >
								<div >${unit_quantitiy }개</div>
								<a href="/slime/cart/quantityForm.jsp" rel="modal:open" class="quantity_change_Btn" >변경</a>
							</div>
						</td>
						<td class="deliv_way">
							<div class="deliv_way_text">택배</div>
						</td>
						<td class="deliv_fee_direction">
							
								<div class="deliv_fee_detail">${deliv_fee }원<br>
									<a href="" class="a_deliv_fee_info" id="a_deliv_fee_info">
										<i class="far fa-question-circle"></i>
									</a>
								</div>
								
							
						</td>
						<td class="price">
							<div class="price_div">
								${unit_price }원
							</div>
						</td>
						<td class="order_delete_Btn_area">
							<div class="order_and_delete">
								<a type="button" class="order_Btn" id="order_Btn">주문</a>
								<a type="button" class="delete_Btn" id="delete_Btn">삭제</a>
							</div>
						</td>
				</tr>
	</table>	
	</div><!-- end item_list -->
	
	
		<!-- 합계된 내역 -->
		<div class="calculated_price_list">
			<table>
				<tr>
					<td class="calculated_price_part1"></td>
					
					<td class="calculated_price_part2">
						<p>상품가격</p>
						<p >배송비</p>
						<p>적립예정 포인트</p>
					</td>	
					
					<td class="calculated_price_part3">
						<p>${unit_price }원</p>
						<p>${deliv_fee }원</p>
						<p>${point }</p>
					</td>			
					<td class="calculated_price_part4"></td>
				</tr>
			</table>
		</div><!-- end calculated_price_list -->
		
		
		<!-- 합계내역 -->
		<div class="total_price_area">
			<table style="width: 100%; margin: auto 0;">
				<tr>
					<td class="total_price_part1">
						<button type="button" class="seleced_delete_Btn">선택상품 삭제</button>
						<button type="button" class="put_wishlist_Btn">위시리스트 담기</button>
					</td>
					
					<td class="total_price_part2">
						<b><p>결제금액</p></b>
					</td>
					
					<td class="price_number3">
						<b><p>${total_price }원</p></b>
					</td>
					
					<td></td>
				</tr>
			</table>
		</div><!-- total_price area-->
		
		
		
		
		
		<!-- 2개의 쇼핑 버튼 -->
		<div class="final_button_area" >
			<div class="final_button_div" align="center">
				 <a type="button" class="more_shopping_Btn" onClick="location.href='/slime/index.jsp'">계속 쇼핑하기</a>
				 <a type="button" class="item_order_Btn">주문하기</a>
			</div>
		</div><!-- button_div -->
		
		
		
		
		
		
		
		
		<!-- 위시리스트 -->
		<div class="wishlist_area">
		
				<!-- 위시리스트 타이틀 -->
				<div class="wishlist_title">
					<div class="wishlist_div">
				 		<span>위시리스트</span>
				 		<a href="/slime/mypage/myPage.jsp" class="a_more_search_Btn">더보기</a>
					</div>
				</div><!-- end wishlist_title -->
				
				<!-- 선택한 위시리스트 상품 -->
				<div class="selected_item">
					<div class="wishlist_item_form">
							<img class="wishlist_item_img" src="/slime/image/img4.jpg" />
						<div class="item_explain_form">
							<div class="item_name">[크리스탈 슬라임]${unit_name }</div>
							<div class="item_present_price"><del>${unit_original_price }원</del><b> ${unit_price }원</b></div>
							<div class="item_status">sale MD HOT</div>
						</div><!-- end item_explain_form -->
					</div><!-- end wishlist_item_form -->
				</div><!-- end selected_item -->
			
		</div><!-- end wishlist -->
		
		
	</div><!-- end cart_content -->

</div><!-- end cart_box -->
</div><!-- end content -->



  <!-- footer Start -->

   <div class="footer">
   
   		<div class="footerArea" align="center">
   		
	   		<div class="footer_icons">
	              <ul class="social-links">
	                  <li><a href="#"><ion-icon class="ion-social-facebook" name="logo-facebook"></ion-icon></a></li>
	                  <li><a href="#"><ion-icon class="ion-social-instagram" name="logo-instagram"></ion-icon></a></li>
	                  <li><a href="#"><ion-icon class="ion-social-twitter" name="logo-twitter"></ion-icon></a></li>
	              </ul>
	         </div>
	         
   			 <div class="site_info_div">
			     <p> Copyright 2018. <b>우주슬라임</b> All rights reserved</p>
			     <a class="terms_and_conditions">이용약관</a> <b><a class="personal_information_policy">개인정보처리방침</a></b>
		     </div>
     </div> <!-- end footerArea-->
   </div><!-- footer  -->
 



</body>
</html>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/slime/js/cart.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"> </script>
   
   
   
   
   
   
   
   
   
   
   