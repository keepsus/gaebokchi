<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="box-wrap">
	<!-- 일반회원 -->
	<c:if test="${memId != '' && memAdmin == 0 }">
        <div class="member-box">
	        <!-- 일반회원 -->
	            <span>${memName }님 안녕하세요.</span>
	            <div>누적 구매금액 : ${00 }원</div>
        </div>
        <div class="point-box">
            <p>포인트</p>
            <span>${00 }</span>
        </div>
        <div class="coupon-box">
            <p>쿠폰</p>
            <span>${00 }</span>
		</div>
	</c:if>
	
	
	<!-- 관리자 -->
	<c:if test="${memId != '' && memAdmin == 1 }">
		<img src="https://img1.daumcdn.net/thumb/R1280x0.fjpg/?fname=http://t1.daumcdn.net/brunch/service/user/BX0/image/r2yH7FOsCiEKMHcYAZE9ZAaHGPo.jpg" width="1000";>
<%-- 	
        <div class="member-box">
	        <!-- 일반회원 -->
	            <span>${memName }님 안녕하지않아요.</span>
	            <div>누적 구매금액 : ${00 }원</div>
        </div>
        <div class="point-box">
            <p>포인트</p>
            <span>${00 }</span>
        </div>
        <div class="coupon-box">
            <p>쿠폰</p>
            <span>${00 }</span>
		</div>
		 --%>
	</c:if>      
</div>