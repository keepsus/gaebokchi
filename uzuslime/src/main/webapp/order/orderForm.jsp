<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>




<jsp:useBean id="memberDTO" class="member.bean.MemberDTO" scope="page" />
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate value="${now}" pattern="yyyyMMddHHmmss" var="use_order_id_String" />
<fmt:parseNumber value="${use_order_id_String}" var="use_order_id" />


<!-- 로그인 및 제품상세페이지 에서 받아올 데이터-->
<%-- <c:set var="member_id" value="aaaa"/><!-- 입력란이 없으므로 hidden으로 받아주기 -->
<c:set var="goods_id" value="111"/>
<c:set var="goods_filename" value="cccc"/> 
<c:set var="goods_title" value="버터슬라임"/>
<c:set var="order_goods_gty" value="1"/>
<c:set var="goods_price" value="7500"/>
<c:set var="order_goods_price" value=""/>
<c:set var="order_delivery_price" value="2500"/>
<c:set var="order_sales_price" value="2500"/>


<c:set var="delivery_method" value="1"/>
<c:set var="gift_wrapping" value="1"/>
<c:set var="card_com_name" value="1"/>
<c:set var="card_pay_month" value="1"/>
<c:set var="pay_orderer_hp_num" value="1"/> --%>

<!-- <!DOCTYPE html>
<html> -->
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="vendors/css/grid.css">
    <link rel="stylesheet" href="/slime/css/normalize.css">
    <link rel="stylesheet" href="/slime/css/orderForm.css">
    <link rel="stylesheet" href="resources/css/index.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" /><!---->
    <title>우주슬라임</title>
    
    
</head>
<body>
<header>
    <h2 class="paymentHead" style="text-align: center;">결제하기</h2>
</header>
<form id="form_order"><!-- ajax에서 serialize 사용하기 위해 form지정해줌 -->

<!-- 입력란이 없으므로 hidden으로 받아주기 -->

<input type="hidden" id="detail_or_cart" name="detail_or_cart" value="${orderDTO.detail_or_cart}"> <!-- 상품 상세페이지에서 온 주문인지 장바구니에서 온 주문인지 확인 -->
<input type="hidden" id="member_id" name="member_id" value="${memId}">
<input type="hidden" id="order_id" name="order_id" value="${use_order_id}">
<input type="hidden" id="goods_id" name="goods_id" value="${goodsMap['goods_id']}">
<input type="hidden" id="goods_title" name="goods_title" value="${goodsMap['goods_title']}">
<input type="hidden" id="order_goods_qty" name="order_goods_qty" value="${goodsMap['order_goods_qty']}">
<input type="hidden" id="goods_sales_price" name="goods_sales_price" value="${goodsMap['goods_sales_price']}">
<input type="hidden" id="order_deli_price" name="order_deli_price" value="${goodsMap['goods_deli_price']}">
<input type="hidden" id="gift_wrapping" name="gift_wrapping" value="${gift_wrapping}">
<input type="hidden" id="delivery_method" name="delivery_method" value="택배">
<input type="hidden" id="orderer_zipcode" value="${memDTO.zipcode}">
<input type="hidden" id="orderer_addr1" value="${memDTO.addr1}">
<input type="hidden" id="orderer_addr2" value="${memDTO.addr2}">

<div id="orderAll">
  <div class="paymentAll">
    <div class="paymentView">
        <div class="orderTotal">
            <div class="orderInfo">
                    <h3>주문 상품 정보</h3>
                        <div class="order_row">
                                <!-- 상품정보에서 상품 이미지 및 가격과 가격생성 -->
                                <div class="productImg">
                                        <img src="" width="90" height="90" alt="주문상품 이미지" value="${goods_image0}"><!-- id="goods_filename" name="goods_filename" ★★★★★ 이미지 파일 데이터값 넣는 부분 추가하기, value빼기 -->
                                </div>
                                <div class="productInfo" style="float: left; padding-left: 60px;">
                                     <div class="shop_item">
                                         <span class="goods_title">${goodsMap['goods_title']}</span>
                                         <%-- <input type="hidden" id="goods_title" name="goods_title" value="${goodsMap['goods_title']}"> --%>
                                            <div class="itm_number">
                                                <!-- 이부분 디비에서 넘어와서 값이 바뀜 -->
                                                <p class="order_goods_gty">${goodsMap['order_goods_qty']}개(개수)</p>
                                                <%-- <input type="hidden" id="order_goods_qty" name="order_goods_qty" value="${goodsMap['order_goods_qty']}"> --%>
                                            </div>
                                            <div class="item_pay">
                                                <span class="goods_sales_price">${goodsMap['goods_sales_price']}원</span>
                                                <%-- <input type="hidden" id="goods_sales_price" name="goods_sales_price" value="${goodsMap['goods_sales_price']}"> --%>
                                            </div>
                                     </div>    
                                </div>
                        </div>
            </div>

            <div class="userInfo">
                <div class="userDetail">
                    <h3>주문자 정보</h3>
                    <div class="order_name" style="padding-bottom : 15px;">
                        <input class="orderer_name" id="orderer_name" name="orderer_name" type="text" placeholder="이름" value="${memName}">
                        <div id="orderer_nameDiv"></div>
                        <input class="orderer_hp" id="orderer_hp" name="orderer_hp" type="text" placeholder="연락처" style="width:43%" value="${memHp}">
                        <div id="orderer_hpDiv"></div>
                    </div>
                    <div class="order_email">
                        <input class="orderer_email" id="orderer_email" name="orderer_email" type="text" placeholder="이메일" style="width:80%" value="${memEmail}">
                        <div id="orderer_emailDiv"></div>
                    </div>
                </div>
            </div>

            <div class="deliveryInfo">
                <div class="deliveryDetail">
                    <h3>배송정보</h3>
                    <div class="checks" style="padding-bottom : 15px;"> 
                        <input type="checkbox" id="orderer_reciver_same">
                        <label >주문자 정보와 동일</label>
                    </div>
                    <div class="delivery_addressDetail">
                        <!-- 수령인 -->
                        <div class="receiver_name" style="padding-bottom : 15px;">
                            <input class="receiver_name" id="receiver_name" name="receiver_name" type="text" placeholder="수령인">
                            <div id="receiver_nameDiv"></div>
                            <input class="receiver_hp"  id="receiver_hp" name="receiver_hp" type="text" placeholder="연락처" style="width:43%">
                            <div id="receiver_hpDiv"></div>
                        </div>
                    
                        <div class="delivery_zipcode"style="padding-bottom : 15px;">
                            <input class="delivery_zipcode" id="postcode" name="delivery_zipcode" type="text" placeholder="우편번호" readonly>
                            <div id="delivery_zipcodeDiv"></div>
                            <input type="button" value="주소찾기" id="checkPostBtn"><br>
                        </div>
                       <div class="delivery_addr1" style="padding-bottom : 15px;">
                            <input class="delivery_addr1" id="address" name="delivery_addr1" type="text" placeholder="주소" style="width:80%">
                        	<div id="delivery_addr1Div"></div>
                        </div>
                        <div class="delivery_addr2">
                            <input class="delivery_addr2" id="detailAddress" name="delivery_addr2" type="text" placeholder="상세주소" style="width:80%">
                        	<div id="delivery_addr2Div"></div>
                        </div>
                        
                    </div>
                    <div class="delivery_message">
                        <h4>배송메모</h4>
                        <select class="delivery_message" id="delivery_message" name="delivery_message">
                            <option value="없음" disabled>배송 메모를 선택해 주세요</option>
                            <option value="배송 전에 미리 연락 바랍니다">배송 전에 미리 연락 바랍니다.</option>
                            <option value="부재시 경비실에 맡겨주세요">부재시 경비실에 맡겨주세요</option>
                            <option value="부재시 전화나 문자를 남겨주세요" >부재시 전화나 문자를 남겨주세요</option>
                            <!-- <option value="4">직접입력</option> --> <!-- ★★★★★ 직접입력 클릭 시 입력창 생성하기 -->
                        </select>
                    </div>
                </div>
            </div>
        </div>
        
        <div class="totalPay">
                <div class="finalPay">
                    <h3>최종 결제금액</h3>
                    <div class="pay_row">
                        <div class="totalInfo">
                            <div class="goods_gty"><p>상품가격</p></div>
                            <div class="order_price"><p>${goodsMap['goods_sales_price'] * goodsMap['order_goods_qty']}원</p></div>
                            <%-- <input type="hidden" id="order_goods_price" name="order_goods_price" value="${goodsMap['goods_sales_price']}"> --%>
                        </div><br>
                        <div class="totalInfo">
                            <div class="goods_gty"><p>배송비</p></div>
                            <div class="order_price"><p>${goodsMap['goods_deli_price']}원</p></div>
                            <input type="hidden" id="order_delivery_price" name="order_delivery_price" value="${goodsMap['goods_deli_price']}" >
                        </div>
                    </div>
                    <hr>
                    <div class="totalInfo2">
                        <div class="goods_gty"><strong><p>총 결재금액(${order_goods_gty}개)</p></strong></div>
                        <div class="order_price"><p> ${total_order_price = goodsMap['goods_sales_price'] * goodsMap['order_goods_qty'] + goodsMap['goods_deli_price']}원</p></div>
                        <input type="hidden" id="total_order_price" name="total_order_price" value="${total_order_price}">
                    </div>
                </div>
                <div class="pay_method">
                    <h3> 결제방법</h3>
                    <input type="hidden" id="pay_type">
                    <div>
                        <div class="pay_type_item" style="padding-bottom: 10px;"> 
                            <label class="radio">
                                <input type="radio" name="pay_method" value="card" checked >
                                <span class="type_text">신용카드</span>
                                    <input type="radio" name="pay_method" value="iche" style="margin-left: 60px;" >
                                <span class="type_text">실시간 계좌이체</span>
                            </label>
                        </div>
                        <div class="pay_type_item">
                            <label class="radio">
                                <input type="radio" name="pay_method" value="cash" >
                                <span class="type_text">무통장 입금</span>
                                <input type="radio" name="pay_method" value="kakao" style="margin-left: 39px;" >
                                <span class="type_text"><img src="/slime/image/kakaoPay.png" width="60px" height="25px"></span>
                            </label>
                        </div>
                    </div>
                </div>
                 <div class="agreeCheck">
                    <div class="agreeChceck_group">
                        <div class="agreeChceck_styled">
                            <label>
                                <input type="checkbox" id="all_agreement" name="all_agreement"><!-- ★★★★★ 해당 체크박스 클릭 시 둘다 체크되도록 하기(이미지보드) -->
                                <span>전체동의</span>
                            </label>
                        </div>
                        <div class="agreeChceck_styled" style=padding:10px;>
                            <label>
                                <input type="checkbox" id="order_agreement_info" name="order_agreement_info" value="1" style="margin-left: 20px;">
                                <span>개인정보 수집 및 이용 동의 
                                    <!-- <a href="#">약관보기</a> --> <!-- ★★★★★ 구현하기 -->
                                </span>
                            </label>
                        </div>
                        <div class="agreeChceck_styled">
                            <label>
                                <input type="checkbox" id="order_agreement_order" name="order_agreement_order" value="1" style="margin-left: 30px;">
                                <span>구매조건 확인 및 결제진행에 동의</span>
                            </label>
                        </div>
                    </div>
                </div>
                <div class="payment">
                    <input type="button" class="order_payBtn" id="order_payBtn" name="order_payBtn" style="cursor:pointer;"value="결제하기">
                </div>
        </div>    
    </div>
  </div>
</div>
</form>

<!-- jQuery 사용 & order.js의 JavaScript 사용 -->
    <script type="text/javascript" src="http://code.jquery.com/jquery-3.5.1.min.js"></script><!-- library를 가져온 것뿐, 설치는 하지 않음 -->
	<script type="text/javascript" src="/slime/js/order.js"></script>
	<script type="text/javascript" src="/slime/js/member.js"></script>
</body>
<!-- </html> -->