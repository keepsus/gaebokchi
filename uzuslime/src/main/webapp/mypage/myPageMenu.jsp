<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 <div class="list-wrap">
     <ul class="menu-links">
    	<!-- 일반회원 -->
	 	<c:if test="${memId != '' && memAdmin == 0 }">
	         <li><a href="myPageOrder.jsp">주문 조회</a></li>
	         <li><a href="myPageWishList.jsp">위시 리스트</a></li>
	         <li><a href="#">취소/교환/반품</a></li>
	         <li><a href="myPageCoupon.jsp">쿠폰</a></li>
	         <li><a href="myPagePoint.jsp">포인트</a></li>
	         <li><a href="myPageQuestion.jsp">1:1 문의</a></li>
	         <li><a href="/slime/member/memberModifyForm" rel="modal:open">정보 수정</a></li>
	         <li><a href="#">회원탈퇴</a></li>
	    </c:if>
	    
	    <!-- 관리자 -->
	    <c:if test="${memId != '' && memAdmin == 1 }">
	         <li><a href="/slime/goods/goodsWriteForm">제품등록</a></li>
	         <li><a href="/slime/goods/goodsList">등록제품 조회</a></li>
	         <li><a href="#">주문정보</a></li>
	         <li><a href="/slime/member/memberList" >회원정보</a></li>
	    </c:if>
     </ul>
 </div>
