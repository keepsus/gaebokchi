<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<form name="memberWriteForm" method="post" action="/slime/member/write">
	<div>
	    <h2 class="signUp-header">회원가입</h2>
	</div>
	<article class="signUp-main">
	    <div class="signUp-name-form">
	        <input type="text" class="sign-name" name="member_name" size="25" placeholder="이름">
	        <div id="nameDiv"></div>
	    </div>
	
	
	    <div class="signUp-id-form">
	        <input type="text" class="member_id" id="member_id" name="member_id" size="25" placeholder="아이디">
	        <input type="button" class="check-Btn" value="중복체크" id="checkBtn"><br>
	        <input type="hidden" id="check" value="">
	      <div id="idDiv"></div>
	      
	    </div>
	
	
	    <div class="signUp-pwd-form">
	        <input type="password" class="sign-pwd" name="member_pw" size="25" placeholder="비밀번호">
	        <div id="pwdDiv"></div>
	    </div>
	
	
	    <div class="signUp-rePwd-form">
	        <input type="password" class="sign-repwd" name="repw" size="25" placeholder="비밀번호 재입력">
	        <div id="repwdDiv"></div>
	    </div>
	
	
	    <div class="signUp-email-form">
	        <input type="text" class="sign-email1" name="email1" size="15">
	        @
	        <input type="email" class="sign-email2" name="email2" list="email2" placeholder="직접입력">
	        <datalist id="email2">
	            <option value="gmail.com">
	            <option value="naver.com">
	            <option value="hanmail.net">
	        </datalist>
	        <input type="button" class="email-Btn" value="이메일인증" id="emailBtn"><br>
	         <input type="text" class="check-email" name="check-email" placeholder="인증번호 입력">
	        <input type="button" class="email-check-Btn" value="인증번호확인" id="emailCheckBtn"><br>
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
	        <input type="button" class="check-Post-Btn" value="우편번호검색" id="checkPostBtn"><br>
	        <input type="text" class="sign-address" id="address" name="addr1" size="40"  readonly placeholder="주소"><br>
	        <input type="text" class="sign-detail" id="detailAddress" name="addr2" size="40" placeholder="상세주소">
	    </div>
	
	
	    <div class="signUp-btn-box">
	        <input type="button" id="writeBtn" value="회원가입">
	        <input type="reset" value="다시작성">
	    </div>
	</article>

	<input type="hidden" name="email_key" value="0">	<!— 일단 0으로 처리 —>
	<input type="hidden" name="admin_yn" value="0">		<!— 관리자는 1, 그 외는 0 —>	

</form>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>	<!— 위아래 순서가 바뀌면 안된다 —>
<script type="text/javascript" src="/slime/js/member.js?ver=1"></script>	<!— 위아래 순서가 바뀌면 안된다 —>