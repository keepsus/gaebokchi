<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.security.SecureRandom" %>
<%@ page import="java.math.BigInteger" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/memberLoginForm.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
    <title>Document</title>
   	<script>
		$('.link-find').click(function (event) {
				event.preventDefault();
				$(this).modal({
					closeExisting: false
				})
			});   			
/*    		$(function() {
   		}); */
	</script>
</head>

<body>
    <div class="modal-header">
        <h2 class="login-header">로그인</h2>
    </div>
    
		<div class="memberLoginForm"> <!-- 가운데 정렬하려고 잡아놨음. -->
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
	                <input type="button" id="loginBtn" class="loginBtn" value="로그인" sytle="margin-bottom:10px;">
	            </div>
	            <div style="margin-top:10px;">
					                	            <!--네이버 로그인-->
								<%
						    String clientId = "bpePMEMFqUEtjH5x7Ira";//애플리케이션 클라이언트 아이디값";
						    String redirectURI = URLEncoder.encode("http://localhost:8080/slime/", "UTF-8");
						    SecureRandom random = new SecureRandom();
						    String state = new BigInteger(130, random).toString();
						    String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
						    apiURL += "&client_id=" + clientId;
						    apiURL += "&redirect_uri=" + redirectURI;
						    apiURL += "&state=" + state;
						    session.setAttribute("state", state);
						 %>
					  <a href="<%=apiURL%>">
					  <img height="40" width="308" src="/slime/image/naver.jpg"/>
						 </a>
					</div> 
	            

	          	            
	            <div class="login-append" style="margin-left:10px;">
	                <div class="inp-chk">
	                    <input type="checkbox" id="keepLogin" class="inp-radio" name="keepLogin">
	                    <span class="txt-lab">로그인 상태 유지</span>                 
	                </div>
	                <span>
	                    <a data-dismiss="modal" href="/slime/member/memberSearch" rel="modal:open" class="link-find">아이디·비밀번호 찾기</a>
	                </span>
	            </div>
	            
	        </form>
        </div>
        
       	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script> <!-- 위아래 순서가 바뀌면 안된다 -->
       	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
		<script type="text/javascript" src="/slime/js/member.js?ver=1"></script>	<!-- 위아래 순서가 바뀌면 안된다 -->
        
</body>
</html>