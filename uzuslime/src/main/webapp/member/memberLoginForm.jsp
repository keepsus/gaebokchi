<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/memberLoginForm.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <title>Document</title>
</head>

<body>
    <div class="modal-header">
        <h2 class="login-header">로그인</h2>
    </div>

        <form action="" name="memberLoginForm" class="loginForm">
            <div class="box-login">    
                <div class="input-text">
                    <input type="text" id="loginId" name="loginId" placeholder="아이디 입력">
                    <div id="loginIdDiv"></div>
                </div>
                
                <div class="input-text">
                    <input type="password" id="loginPwd" name="loginPwd" placeholder="비밀번호 입력">
                    <div id="loginPwdDiv"></div>
                </div>
            </div>
            
            <div>
                <input type="button" id="loginBtn" class="loginBtn" value="로그인">
            </div>
            
            <div class="login-append">
                <div class="inp-chk">
                    <input type="checkbox" id="keepLogin" class="inp-radio" name="keepLogin">
                    <span class="txt-lab">로그인 상태 유지</span>
                </div>
                <span>
                    <a href="" class="link-find">아이디</a>
                    · 
                    <a href="" class="link-find">비밀번호 찾기</a>
                </span>
            </div>
        </form>
        
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>	<!-- 위아래 순서가 바뀌면 안된다 -->
		<script type="text/javascript" src="/slime/js/member.js?ver=1"></script>	<!-- 위아래 순서가 바뀌면 안된다 -->
        
</body>
</html>