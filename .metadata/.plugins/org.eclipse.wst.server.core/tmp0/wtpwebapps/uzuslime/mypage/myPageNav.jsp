<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 <ul class="main-nav">
 	  <!-- 일반회원 -->
     <c:if test="${memId != '' && memAdmin == 0 }">
		 <h4>${memName }님 반갑습니다.</h4>
		 <li><a href="/slime/member/logout">로그아웃</a></li>
	     <li><a href="/slime/mypage/myPageOrder">마이페이지</a></li>
	     <li><a href="#">장바구니</a></li>
	     <li><a href="#"><ion-icon name="search-outline"></ion-icon></a></li>
     </c:if>
     
      <!-- 관리자  -->
     <c:if test="${memId != '' && memAdmin == 1 }">
		 <h4>${memName }님 반갑습니다.</h4>
		 <li><a href="/slime/member/logout">로그아웃</a></li>
	     <li><a href="/slime/mypage/myPageOrder">관리자페이지</a></li>
	     <li><a href="#"><ion-icon name="search-outline"></ion-icon></a></li>
     </c:if>
 </ul>
