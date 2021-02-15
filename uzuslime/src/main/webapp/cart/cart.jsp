<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



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

<style>
#currentPaging {
	color: red;
	text-decoration: underline;
	cursor: pointer;
}
#paging {
	color: black;
	text-decoration: none;
	cursor: pointer;
}
</style>


<!-- 자체값 주기 -->
<c:set var="goods_title" value="[크리스탈 슬라임] 네온시드"></c:set>
<c:set var="order_goods_qty" value="4"></c:set>
<c:set var="goods_price" value="8000"></c:set>
<c:set var="goods_sales_price" value="7500"></c:set>
<c:set var="goods_deli_price" value="1500"></c:set>
<c:set var="total_order_price" value="${goods_sales_price * order_goods_qty + goods_deli_price }"></c:set>
<c:set var="goods_point" value="-"></c:set>

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

<form id="imageboardListForm" method="get" action="imageboardDelete">

<!-- 장바구니 항목 테이블 -->	
<div class="item_table">

<table id="cart_title_table" >
	 <!-- <tr>
	  	<th width="100"><input type="checkbox" id="all">번호</th>
	 	<th width="150">이미지</th>
	 	<th width="150">상품명</th>
	 	<th width="100">단가</th>
	 	<th width="100">개수</th>
	 	<th width="100">합계</th>
	 </tr> -->
	 
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





<!-- 장바구니 테이블 -->	
<div class="item_list">

	<!-- 장바구니 없을때 -->
		<!--  <div class="empty_cart">
			<td class="empty_area">
				<div class="empty_cart_div">
					<i class="fas fa-shopping-cart"></i>
				</div>
				<div class="empty_info_text_div">
						장바구니가 비어있습니다		
				</div>
			</td>
		</div>  -->


	<table class="cart_List_table" id="cart_List_table" ><!-- ajax로 들어온다 -->
		<tr>
						<td class="part_checkbox"><input type="checkbox" class="part_checkbox_click" id="part_check"></td>
						
						<td class="item_info_detail">
							<a class="cart_selected_item">
								<img src="/slime/image/img3.jpg" class="cart_item_img"  onClick="location.href='/slime/detailpage/detailPage.jsp'">
							</a>
							<div class="item_view_name_div">
								<span class="item_view_name" id="goods_title" name="goods_title">${goods_title }</span>
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
								<span id="order_goods_qty" name="order_goods_qty">${order_goods_qty }</span>개
								<br>
								<!-- <a href="/slime/cart/quantityForm.jsp" rel="modal:open" class="quantity_change_Btn" >변경</a> -->
								<span id="quantity_change_Btn" data-toggle="modal" data-target="#modal" role="button" class="quantity_change_Btn" >변경</span>
									
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
							
								<span class="deliv_fee_detail" id="goods_deli_price" name="goods_deli_price">${goods_deli_price }</span>원<br>
									<a href="" class="a_deliv_fee_info" id="a_deliv_fee_info">
										<i class="far fa-question-circle"></i>
									</a>
								
								
							
						</td>
						<td class="price">
							<div class="price_div" id="goods_sales_price" name="goods_sales_price">${goods_sales_price }</div>원
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
		</div><!-- total_price area-->

			<!-- 2개의 쇼핑 버튼 -->
			<div class="final_button_area" >
				<div class="final_button_div" align="center">
					 <a type="button" class="more_shopping_Btn" onClick="location.href='/slime/index.jsp'">계속 쇼핑하기</a>
					 <input type="button" class="item_order_Btn" id="item_order_Btn" value="주문하기">
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
						
							<div class="item_name">${goods_title }</div>
							<div class="item_present_price"><del>${goods_price }원</del><b> ${goods_sales_price }원</b></div>
							<div class="item_status">sale MD HOT</div>
							
						</div><!-- end item_explain_form -->
						
						
					</div><!-- end wishlist_item_form -->
					
				</div><!-- end selected_item -->
				
		</div><!-- end wishlist area-->
		
		
	</div><!-- end cart_content -->

</div><!-- end cart_box -->
</div><!-- end content -->		


		
<!-- <div style="float: left;">
	<input type="button" value="선택삭제" id="choiceDeleteBtn">
</div>

<div id="imageboardPagingDiv" style="float: left; width: 600px; text-align: center;"></div>
 -->

</form>
<script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"> </script>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<script type="text/javascript">
$('#item_order_Btn').click(function(){
	$.ajax({
		type:'post',
		url: '/slime/order/orderOneGoodsForm',
		data: {'goods_id':$('#goods_id').text(),
   	     'goods_title':$('#goods_title').text(),
         'order_goods_qty':$('#order_goods_qty').text(),
         'goods_sales_price':$('#goods_sales_price').text(),
         'goods_deli_price':$('#goods_deli_price').text()  
        },
        dataType:'json',
        success:function(){
        	location.href= '/slime/order/orderForm.jsp';
        }
	});
});
</script>
</body>
</html>




<!-- <script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/spring/imageboard/getImageboardList',
		data: 'pg=${pg}',
		dataType: 'json',
		success : function(data){
			console.log(data);
			
			$.each(data.list, function(index, items){
				
				$('<tr/>').append($('<td/>',{ //체크박스 div
					class: 'part_checkbox'
					
					}).append($('<input/>',{ 
						type: 'checkbox',
						class: 'part_checkbox_click',
						id: 'part_check'
					}))
					
					
				).append($('<td/>',{ // 상품 이미지 + 상품 타이틀 div
						class: 'item_info_detail'
					
					}).append($('<a/>', {
						class:'cart_selected_item' 
						}
					
					).append($('<img/>',{
						src: '/spring/storage/'+items.image1,
						class: 'cart_item_img'
					}))
					).append($('<div/>',{
						class: 'item_view_name_div'
						}).append($('<a/>',{
							class: 'item_view_name',
							text: "[크리스탈 슬라임]레몬아작" //추후에 값 변경해줘야함 (문자열 안먹힘)
							
						})))//end div 
					
					
					
				).append($('<td/>',{
					class: 'wish_icon'
					}).append($('<a/>',{
						class: 'a_wish_icon',
						id: 'a_wish_icon'}
					).append($('<i/>',{
						id: 'far',
						class: 'far fa-heart'}))) 
						
				).append($('<td/>',{//수량
					class: 'quantity_detail'
					}).append($('<div/>',{
						class: 'quantity_kind'
						
					}).append($('<div/>',{
								text: ${order_goods_qty}
						})).append($('<a/>',{ 
							id: 'quantity_change_Btn',
							class: 'quantity_change_Btn',
							href: '/spring/imageboard/quantityForm.jsp',
							rel: 'modal:open',
							//data-toggle: 'modal',
							//data-target: '#modal',
							role: 'button',
							text: '변경'
						
					})).append($('<div/>',{
						class: 'modal-dialog'
					}).append($('<div/>',{
						class: 'modal-content'
					})))
						
						)
						
				).append($('<td/>',{ //배송수단
					class: 'deliv_way'
					
					}).append($('<div/>',{ 
							class: 'deliv_way_text',
							text: '택배'
					}))
					
				).append($('<td/>',{//배송비
					class: 'deliv_fee_direction'
					
					}).append($('<div/>',{ 
							class: 'deliv_fee_detail',
							text: ${goods_deli_price}
						
					}).append($('<br>')
					).append($('<a/>',{
							class: 'a_deliv_fee_info',
							id: 'a_deliv_fee_info',
							style: 'cursor:pointer;',
							//onclick: //onClick안먹음
							
					}).append($('<i/>',{
							class: 'far fa-question-circle'
							})))
				
				)).append($('<td/>',{//가격 
					class: 'price'
					
					}).append($('<div/>',{ 
							class: 'price_div',
							text: ${goods_sales_price}
					}))
				
				
				).append($('<td/>',{// 주문/삭제 버튼 
					class: 'order_delete_Btn_area'
					
					}).append($('<div/>',{ 
							class: 'order_and_delete'
						
					}).append($('<a/>',{
							type: 'button',
							class: 'order_Btn',
							id: 'order_Btn',
							text: '주문'
							})
					 ).append($('<a/>',{
						 	type: 'button',
						 	class: 'delete_Btn',
						 	id: 'delete_Btn',
						 	text: '삭제'
						 }))
				
				)).appendTo($('#cart_List_table'));  
				
				
					$('#a_wish_icon').on('click', function(){
					    
					    
					    if($('#far').attr('class') == 'fas fa-heart' ){//검정하트면 흰 하트로
					  	    console.log("데이터가 있어요!" );
					    	$('#far').attr('class', 'far fa-heart'); //흰색 하트
					    	console.log("데이터가 없애야한다" );
					    	
					    }else if($('#far').attr('class') == 'far fa-heart' ){//흰하트면 검정하트로
					    	console.log("데이터가 없어요" );
					    	 $('#far').attr('class', 'fas fa-heart'); //검정 하트
					    	 console.log("데이터를 넣어야한다!!" );
					    	 
					    }
					  
					});
				
				
				//이미지 보기
				$('.'+items.seq).click(function(){
					location.href = '/spring/imageboard/imageboardView?seq='+items.seq+'&pg='+data.pg;            
				});
				
			});//each
			
			//패이징 처리
			$('#imageboardPagingDiv').html(data.imageboardPaging.pagingHTML);
		},
		error: function(err){
			console.log(err);
		}
	});
});





function imageboardPaging(pg){
	location.href="imageboardList?pg="+pg;
}

//전체 선택 또는 해제
$('#check_all').click(function(){
	//alert($('#all').attr('checked')); - checked 속성이 없어서 undefind으로 나온다
	//alert($('#all').prop('checked')); - true, false
	
	if($('#check_all').prop('checked'))
		$('input[id=part_check]').prop('checked', true);
	else
		$('input[id=part_check]').prop('checked', false);
});

//선택 삭제
$('#delete_Btn').click(function(){
	let count = $('input[id=part_check]:checked').length;
	
	if(count == 0)
		alert('삭제할 항목을 선택하세요');
	else{
		if(confirm('정말로 삭제하시겠습니까?')){
			$('#imageboardListForm').submit();
		}
	}
});



</script> -->

<%--
attr()
- HTML에 작성된 속성값을 문자열로 받아온다

prop()
- 자바스크립트의 프로퍼티를 가져온다
- 자바스크립트의 프로퍼티 값이 넘어오므로 boolean, date, function등을 가져올 수 있다

[형식]
prop(key)          -> 속성값을 가져온다
prop(key, value)   -> 속성값을 추가한다

[실습] exam04.html
 --%>













