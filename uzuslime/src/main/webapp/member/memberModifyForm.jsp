<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form name="memberModifyForm" id="memberModifyForm">
<h3>회원정보수정</h3>

<article class="signUp-main">
    <div class="signUp-name-form">
        <input type="text" class="sign-name" id="signName" value="${memberDTO.member_name }" name="member_name" size="25" placeholder="이름">
        <div id="nameDiv"></div>
    </div>


	<div class="signUp-id-form">
	    <input type="text" class="member_id" id="member_id" name="member_id" value="${memberDTO.member_id }" size="25" placeholder="아이디">
	<div id="idDiv"></div>


    <div class="signUp-pwd-form">
        <input type="password" class="sign-pwd" id="signPwd" name="member_pw" size="25" placeholder="비밀번호">
        <div id="pwdDiv"></div>
    </div>


    <div class="signUp-rePwd-form">
        <input type="password" class="sign-repwd" id="signRePwd" name="repw" size="25" placeholder="비밀번호 재입력">
        <div id="repwdDiv"></div>
    </div>


    <div class="signUp-email-form">
        <input type="text" class="sign-email1" name="email1" value="${memberDTO.email1 }" size="15">
        @
        <input type="email" class="sign-email2" name="email2" list="email2" value="${memberDTO.email2 }" placeholder="직접입력">
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
         <input type="text" class="sign-tel2" name="tel2" value="${memberDTO.tel2}" size="5">
         -
         <input type="text" class="sign-tel3" name="tel3" value="${memberDTO.tel3}" size="5">
    </div>


    <div class="signUp-address-form">
        <input type="text" class="sign-post" id="postcode" name="zipcode" value="${memberDTO.zipcode}" size="5" readonly >
        <input type="button" class="check-Post-Btn" value="우편번호검색" id="checkPostBtn"><br>
        <input type="text" class="sign-address" id="address" name="addr1" value="${memberDTO.addr1}" size="40"  readonly placeholder="주소"><br>
        <input type="text" class="sign-detail" id="detailAddress" name="addr2" value="${memberDTO.addr2}" size="40" placeholder="상세주소">
    </div>


    <div class="signUp-btn-box">
        <input type="button" id="modifyBtn" value="회원정보수정">
        <input type="reset" value="다시작성">
    </div>
</article>
</form>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="../js/member.js"></script>
<script type="text/javascript">

window.onload=function(){
	document.memberModifyForm.email2.value = "${memberDTO.email2 }";
	document.memberModifyForm.tel1.value = "${memberDTO.tel1 }";
}
</script>




















