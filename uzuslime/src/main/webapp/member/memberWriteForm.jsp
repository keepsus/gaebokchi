<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <link rel="stylesheet" href="/slime/css/memberWriteForm.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">


<form name="memberWriteForm" method="post" action="/slime/member/write">
	<div>
	    <h2 class="modal-header">회원가입</h2>
	</div>
	
	
	<article name="memberSignUpForm" class="signUpForm" >
	    <div class="input-text">
	        <input type="text" name="member_name" size="25" placeholder="이름">
	        <div id="nameDiv"></div>
	    </div>
	
	
	    <div class="input-text">
	        <input type="text" class="member_id" id="member_id" name="member_id" size="25" placeholder="아이디">
	        <input type="hidden" id="check" value="">
	      <div id="idDiv"></div>
	      
	    </div>
	
	
	    <div class="input-text">
	        <input type="password" class="sign-pwd" name="member_pw" size="25" placeholder="비밀번호">
	        <div id="pwdDiv"></div>
	    </div>
	
	
	    <div class="input-text">
	        <input type="password" class="sign-repwd" name="repw" size="25" placeholder="비밀번호 재입력">
	        <div id="repwdDiv"></div>
	    </div>
	
	
	    <div class="signUp-email-form">
	        <input type="text" class="sign-email1" name="email1" size="10">
	        @
	        <input type="email" class="sign-email2" name="email2" list="email2" placeholder="직접입력" size="10">
	        <datalist id="email2">
	            <option value="gmail.com">
	            <option value="naver.com">
	            <option value="hanmail.net">
	        </datalist>
	        <input type="button" id="emailBtn" class="emailBtn" value="이메일인증"><br>
	         <input type="text" class="checkEmail" name="checkEmail" placeholder="인증번호 입력">
	        <input type="button" id="emailCheckBtn" class="emailCheckBtn" value="인증번호확인" ><br>
	    </div>
	
	
	    <div class="signUp-phone-form">
	        <select name="tel1" class="sign-tel1" style="width: 60px;">
	            <option value="010">010
	            <option value="011">011
	            <option value="019">019
	        </select>
	         -
	         <input type="text" class="sign-tel2" name="tel2" size="5">
	         -
	         <input type="text" class="sign-tel3" name="tel3" size="5">
	    </div>
	
	
	    <div class="signUp-address-form">
	        <input type="text" class="sign-post" id="postcode" name="zipcode" size="5" readonly>
	        <input type="button" id="checkPostBtn" class="checkPostBtn" value="우편번호검색"><br>
	        <input type="text" class="sign-address" id="address" name="addr1" size="40"  readonly placeholder="주소"><br>
	        <input type="text" class="sign-detail" id="detailAddress" name="addr2" size="40" placeholder="상세주소">
	    </div>
	
	
	    <div class="signUp-btn-box">
	        <input type="button" id="writeBtn" class="writeBtn" value="회원가입">
	        <input type="reset" value="다시작성">
	    </div>
	</article>

	<input type="hidden" name="email_key" value="0">	
	<input type="hidden" name="admin_yn" value="0">		

</form>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>	
<script type="text/javascript" src="/slime/js/member.js?ver=1"></script>	