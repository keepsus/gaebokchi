<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/memberSearch.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <title>Document</title>
</head>
<body>
<!-- <form action="" name="searchForm" class="searchForm">
	<div class="modal-header">
	    <h2>아이디 · 비밀번호 찾기</h2>
	</div>
	탭
	<div class="tabmenu">
	    <ul>
	        <li id="tab1" class="btnCon"><a class="btn first" href="#tab1">menu1</a>        
	            <div class="tabCon">
	                <div class="input-text">
	                    <input type="text" id="email" name="email" placeholder="아이디를 입력하세요">
	                </div>
	                <div>
	                    <input type="button" id="findBtn" class="findBtn" value="아이디 찾기">
	                </div>
	            </div>
	        </li>
	
	    
	        <li id="tab2" class="btnCon"><a class="btn" href="#tab2">menu2</a>
	            <div class="tabCon">
	                <div class="input-text">
	                    <input type="text" id="email" name="email" placeholder="아이디를 입력하세요">
	                </div>
	                <div>
	                    <input type="button" id="findBtn" class="findBtn" value="비밀번호 찾기">
	                </div>
	            </div>
	        </li>
	    </ul>
	</div>
</form>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
-->
<form id="memberSearch">
	<div class="full">
		<div class="container">
			<div class="area_inputs wow fadeIn">
				<div class="sub_title font-weight-bold text-white">
					<h3>아이디/비밀번호 찾기</h3>
					<p>인증된 이메일만 정보 찾기가 가능합니다 :)</p>
				</div>
				<div style="margin-bottom: 10px;"
					class="custom-control custom-radio custom-control-inline">
					<input type="radio" class="custom-control-input" id="search_1" name="search_total" onclick="search_check(1)" checked="checked">
					<label class="custom-control-label font-weight-bold text-white"	for="search_1">아이디 찾기</label>
				</div>
				<div class="custom-control custom-radio custom-control-inline">
					<input type="radio" class="custom-control-input" id="search_2" name="search_total" onclick="search_check(2)"> 
					<label class="custom-control-label font-weight-bold text-white" for="search_2">비밀번호 찾기</label>
				</div>
				
				
				
				<div id="searchI">
					<div class="form-group">
						<label class="font-weight-bold text-white" for="member_name">이름</label>
						<div>
							<input type="text" class="form-control" id="member_name" name="member_name" placeholder="ex) 찹귤">
						</div>
					</div>
					<div class="form-group">
						<label class="font-weight-bold text-white" for="tel1">휴대폰번호</label>
						<div>
					        <select name="tel1" id="tel1" class="sign-tel1" style="width: 60px;">
					            <option value="010">010
					            <option value="011">011
					            <option value="019">019
					        </select>
					         -
					         <input type="text" class="sign-tel2" id="tel2" name="tel2" size="5">
					         -
					         <input type="text" class="sign-tel3" id="tel3" name="tel3" size="5">
						</div>
					</div>
					<div class="form-group">
						<button id="searchBtn" type="button" class="btn btn-primary btn-block">확인</button>
					<a class="btn btn-danger btn-block"	href="${pageContext.request.contextPath}">취소</a>
					</div>
				</div>
				
				
				
				
				<div id="searchP" style="display: none;">
					<div class="form-group">
						<label class="font-weight-bold text-white" for="member_id">아이디</label>
						<div>
							<input type="text" class="form-control" id="member_id" name="member_id" placeholder="ex) chqpkyul">
						</div>
					</div>
					<div class="form-group">
						<label class="font-weight-bold text-white" for="email1">이메일</label>
						<div>
					        <input type="text" class="sign-email1" id="email1" name="email1" size="10">
					        @
					        <input type="email" class="sign-email2" name="email2" list="email2" placeholder="직접입력" size="10">
					        <datalist id="email2">
					            <option value="gmail.com">
					            <option value="naver.com">
					            <option value="hanmail.net">
					        </datalist>
						</div>
					</div>
					<div class="form-group">
						<button id="searchBtn2" type="button" class="btn btn-primary btn-block">확인</button>
					<a class="btn btn-danger btn-block"	href="${pageContext.request.contextPath}">취소</a>
				</div>
				</div>
			</div>
		</div>
	</div>
	
</form>
<script>
function search_check(num){
	if(num == "1"){
		document.getElementById("searchP").style.display="none";
		document.getElementById("searchI").style.display="";
	}else if(num == "2"){
		document.getElementById("searchP").style.display="";
		document.getElementById("searchI").style.display="none";
	}
}
</script>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/slime/js/member.js?ver=1"></script>	<!-- 위아래 순서가 바뀌면 안된다 -->
</body>
</html>