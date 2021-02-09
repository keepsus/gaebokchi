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
<c:set var="order_goods_qty" value="1"></c:set>
<c:set var="goods_sales_price" value="7500"></c:set>
<c:set var="goods_deli_price" value="2500"></c:set>
<c:set var="total_order_price" value="${goods_sales_price + goods_deli_price }"></c:set>
<c:set var="goods_point" value="-"></c:set>

<c:set var="goods_price" value="9000"></c:set>
<c:set var="goods_sales_price" value="7500"></c:set>
<c:set var="goods_title" value="레몬아작"></c:set>


<!--cartList : 회원아이디, 상품아이디, 주문수량, 장바구니 생성일 정보가 들어있음-->
<c:set var="cartList" value="${cartMap.cartList}"/>
<!-- goodsList : 상품 상세정보가 들어있음 -->
<c:set var="goodsList" value="${cartMap.goodsList}"/>




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
<form id="cartForm" method="get" action="cartDelete">
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
							<th class="whole_checkbox_info"><input type="checkbox" id="check_all"></th>
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
	
	
	<!-- -------------------------------------------------------------------------------------------- -->
	
	
	<!-- 장바구니 담긴 테이블 -->	
	<div class="item_list">
	
	<!-- 장바구니 없을때 -->
	<!--
	<c:if test="${empty display }">	
		 <div class="empty_cart">
			
			<div class="empty_area">
					<div class="empty_cart_div">
						<i class="fas fa-shopping-cart"></i>
						<img class="empty_cart_img" src="data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iaXNvLTg4NTktMSI/Pg0KPCEtLSBHZW5lcmF0b3I6IEFkb2JlIElsbHVzdHJhdG9yIDE5LjAuMCwgU1ZHIEV4cG9ydCBQbHVnLUluIC4gU1ZHIFZlcnNpb246IDYuMDAgQnVpbGQgMCkgIC0tPg0KPHN2ZyB2ZXJzaW9uPSIxLjEiIGlkPSJDYXBhXzEiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgeG1sbnM6eGxpbms9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkveGxpbmsiIHg9IjBweCIgeT0iMHB4Ig0KCSB2aWV3Qm94PSIwIDAgNTEyIDUxMiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgNTEyIDUxMjsiIHhtbDpzcGFjZT0icHJlc2VydmUiPg0KPGc+DQoJPGc+DQoJCTxwYXRoIGQ9Ik01MDkuODY3LDg5LjZjLTIuMTMzLTIuMTMzLTQuMjY3LTQuMjY3LTguNTMzLTQuMjY3SDk2TDg1LjMzMywyOS44NjdjMC00LjI2Ny02LjQtOC41MzMtMTAuNjY3LTguNTMzaC02NA0KCQkJQzQuMjY3LDIxLjMzMywwLDI1LjYsMCwzMmMwLDYuNCw0LjI2NywxMC42NjcsMTAuNjY3LDEwLjY2N2g1NS40NjdsNTEuMiwyNjAuMjY3YzYuNCwzNC4xMzMsMzguNCw1OS43MzMsNzIuNTMzLDU5LjczM0g0MzUuMg0KCQkJYzYuNCwwLDEwLjY2Ny00LjI2NywxMC42NjctMTAuNjY3YzAtNi40LTQuMjY3LTEwLjY2Ny0xMC42NjctMTAuNjY3SDE5MmMtMTcuMDY3LDAtMzQuMTMzLTguNTMzLTQyLjY2Ny0yMy40NjdMNDYwLjgsMjc1LjINCgkJCWM0LjI2NywwLDguNTMzLTQuMjY3LDguNTMzLTguNTMzTDUxMiw5NkM1MTIsOTYsNTEyLDkxLjczMyw1MDkuODY3LDg5LjZ6IE00NTAuMTMzLDI1NmwtMzExLjQ2Nyw0MC41MzNsLTM4LjQtMTkySDQ4Ni40DQoJCQlMNDUwLjEzMywyNTZ6Ii8+DQoJPC9nPg0KPC9nPg0KPGc+DQoJPGc+DQoJCTxwYXRoIGQ9Ik0xODEuMzMzLDM4NEMxNTEuNDY3LDM4NCwxMjgsNDA3LjQ2NywxMjgsNDM3LjMzM2MwLDI5Ljg2NywyMy40NjcsNTMuMzMzLDUzLjMzMyw1My4zMzMNCgkJCWMyOS44NjcsMCw1My4zMzMtMjMuNDY3LDUzLjMzMy01My4zMzNDMjM0LjY2Nyw0MDcuNDY3LDIxMS4yLDM4NCwxODEuMzMzLDM4NHogTTE4MS4zMzMsNDY5LjMzM2MtMTcuMDY3LDAtMzItMTQuOTM0LTMyLTMyDQoJCQlzMTQuOTMzLTMyLDMyLTMyYzE3LjA2NywwLDMyLDE0LjkzNCwzMiwzMlMxOTguNCw0NjkuMzMzLDE4MS4zMzMsNDY5LjMzM3oiLz4NCgk8L2c+DQo8L2c+DQo8Zz4NCgk8Zz4NCgkJPHBhdGggZD0iTTM5NC42NjcsMzg0Yy0yOS44NjcsMC01My4zMzMsMjMuNDY3LTUzLjMzMyw1My4zMzNjMCwyOS44NjcsMjMuNDY3LDUzLjMzMyw1My4zMzMsNTMuMzMzDQoJCQljMjkuODY3LDAsNTMuMzMzLTIzLjQ2Nyw1My4zMzMtNTMuMzMzQzQ0OCw0MDcuNDY3LDQyNC41MzMsMzg0LDM5NC42NjcsMzg0eiBNMzk0LjY2Nyw0NjkuMzMzYy0xNy4wNjcsMC0zMi0xNC45MzQtMzItMzINCgkJCXMxNC45MzMtMzIsMzItMzJjMTcuMDY3LDAsMzIsMTQuOTM0LDMyLDMyUzQxMS43MzMsNDY5LjMzMywzOTQuNjY3LDQ2OS4zMzN6Ii8+DQoJPC9nPg0KPC9nPg0KPGc+DQo8L2c+DQo8Zz4NCjwvZz4NCjxnPg0KPC9nPg0KPGc+DQo8L2c+DQo8Zz4NCjwvZz4NCjxnPg0KPC9nPg0KPGc+DQo8L2c+DQo8Zz4NCjwvZz4NCjxnPg0KPC9nPg0KPGc+DQo8L2c+DQo8Zz4NCjwvZz4NCjxnPg0KPC9nPg0KPGc+DQo8L2c+DQo8Zz4NCjwvZz4NCjxnPg0KPC9nPg0KPC9zdmc+DQo=" />
					</div>
					<div class="empty_info_text_div">
							장바구니가 비어있습니다		
					</div>
			</div>
		</div> end empty_cart
		</c:if>	 
		end 장바구니 없을때  
		
		
		
	<!-- 장바구니 담겼을때 -->
	 <table id="cart_List_table">
				<tr>
						<td class="part_checkbox"><input type="checkbox" class="part_checkbox_click" id="part_check"></td>
						
						<td class="item_info_detail">
							<a class="cart_selected_item">
								<img src="/slime/image/img3.jpg" class="cart_item_img"  onClick="location.href='/slime/detailpage/detailPage.jsp'">
							</a>
							<div class="item_view_name_div">
								<a class="item_view_name">[크리스탈 슬라임]${goods_title }</a>
							</div>
						</td>
						
						<td class="wish_icon">
							<!-- 하트 누르기전 -->
							<c:if test="${sessionScope.heart_check == 0 }">	
								<a href="" class="a_wish_icon" id="a_wish_icon">
									<i class="far fa-heart"></i>
								</a>
							</c:if>	 
							<!-- 하트 누른후 -->
							<c:if test="${sessionScope.heart_check == 1 }">	
								<a href="" class="a_wish_icon" id="a_wish_icon">
									<i class="fas fa-heart"></i>
								</a>
							</c:if>	
						</td>
						
						<td class="quantity_detail">
							<div class="quantity_kind" >
								<div >${order_goods_qty }개</div>
								<!-- <a href="/slime/cart/quantityForm.jsp" rel="modal:open" class="quantity_change_Btn" >변경</a> -->
								<a id="quantity_change_Btn" data-toggle="modal" data-target="#modal" role="button" class="quantity_change_Btn" >변경</a>
									
									<div id="modal" class="modal fade" tabindex="-1" role="dialog">
										<div class="modal-dialog">
											<div class="modal-content">
											
											</div>
										</div>
									</div>
									
							</div><!-- end quantity_kind -->
						</td>
						<td class="deliv_way">
							<div class="deliv_way_text">택배</div>
						</td>
						<td class="deliv_fee_direction">
							
								<div class="deliv_fee_detail">${goods_deli_price }원<br>
									<a href="" class="a_deliv_fee_info" id="a_deliv_fee_info">
										<i class="far fa-question-circle"></i>
									</a>
								</div>
								
							
						</td>
						<td class="price">
							<div class="price_div">
								${goods_sales_price }원
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
	
	
	<!-- -------------------------------------------------------------------------------------------- -->
	
	
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
						<p>${goods_sales_price }원</p>
						<p>${goods_deli_price }원</p>
						<p>${goods_point }</p>
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
						<b><p>${total_order_price }원</p></b>
					</td>
					
					<td></td>
				</tr>
			</table>
		</div> 
		<!--end total_price area-->
		
		
		
		
		
		<!-- 2개의 쇼핑 버튼 -->
	 	<div class="final_button_area" >
			<div class="final_button_div" align="center">
				 <a type="button" class="more_shopping_Btn" onClick="location.href='/slime/index.jsp'">계속 쇼핑하기</a>
				 <a type="button" class="item_order_Btn">주문하기</a>
			</div>
		</div><!-- button_div -->
		<!-- end 장바구니 담겼을때 -->
		
		<!-- 1개의 쇼핑 버튼 -->
		<!-- <div class="final_button_area" >
			<div class="final_button_div2" align="center">
				 <a type="button" class="more_shopping_Btn" onClick="location.href='/slime/index.jsp'">계속 쇼핑하기</a>
			</div>
		</div> -->
		<!-- end 장바구니 안담겼을때 -->
		
		
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
							<div class="item_name">[크리스탈 슬라임]${goods_title }</div>
							<div class="item_present_price"><del>${goods_price }원</del><b> ${goods_sales_price }원</b></div>
							<div class="item_status">sale MD HOT</div>
						</div><!-- end item_explain_form -->
					</div><!-- end wishlist_item_form -->
				</div><!-- end selected_item -->
			
		</div><!-- end wishlist -->
		
		
	</div><!-- end cart_content -->

</div><!-- end cart_box -->
</div><!-- end content -->
</form>


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
   
   
   
   
   
   
   
   
   
   
   