<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link rel="stylesheet" href="/slime/css/qnaBoard.css">
    <link rel="stylesheet" href="/slime/css/grid.css">
    <link rel="stylesheet" href="/slime/css/normalize.css">
    <link rel="stylesheet" href="/slime/css/style.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" /><!---->
    <title>우주슬라임</title>    
</head>
<body>
 	<!---------------------->
    <!--------HAEDER-------->
    <!---------------------->
    <header>
        <nav>
            <div class="row">
                <a href="/slime/index.jsp"><img src="/slime/image/logo.jpg" alt="slime logo" class="logo"></a>
                <ul class="main-nav">
                    
                    <!-- 로그인  -->
                    <!-- <li><a href="#">로그인</a></li> -->
                    <li><a href="#login" rel="modal:open">로그인</a></li>
                        <div id="login" class="modal">    <!---->
                            <div class="modal-header">
                                <h2 class="login-header">로그인</h2>
                            </div>
                            <article class="modal-main">
                                <div class="login-form">
                                
                                    <div class="id-form">  
                                        <input type="text" class="id" name="id" id="loginId" size="25" placeholder="아이디"><!--데이터-->
                                    </div>
                                   
                                    <div class="pwd-form">
                                        <input type="password" class="pwd" name="pwd" id="loginPwd" size="25" placeholder="비밀번호"><!--데이터-->
                                    </div>
                                    
                                </div>
                                
                                <div class="login-btn-box">
                                    <input type="button" id="loginBtn" class="loginBtn" value="로그인">
                                </div>
                                
                            </article>
                        </div>
                        
                    <!-- 회원가입 -->
                    <!-- <li><a href="#">회원가입</a></li> -->
                    <li><a href="#signUp" rel="modal:open">회원가입</a></li>
                        <div id="signUp" class="modal">
                            <div>
                                <h2 class="signUp-header">회원가입</h2>
                            </div>
                            <article class="signUp-main">
                                <div class="signUp-name-form">
                                    <input type="text" class="sign-name" id="signName" size="25" placeholder="이름"><!--데이터-->
                                    <div id="nameDiv"></div>
                                </div>


                                <div class="signUp-id-form">
                                    <input type="text" class="sign-id" id="signId" size="25" placeholder="아이디"><!--데이터-->
                                    <input type="button" class="check-Btn" value="중복체크" id="checkBtn"><br>
                                    <input type="hidden" id="check" value="">
                                  <div id="idDiv"></div>
                                  
                                </div>


                                <div class="signUp-pwd-form">
                                    <input type="password" class="sign-pwd" id="signPwd" size="25" placeholder="비밀번호"><!--데이터-->
                                    <div id="pwdDiv"></div>
                                </div>


                                <div class="signUp-rePwd-form">
                                    <input type="password" class="sign-repwd" id="signRePwd" size="25" placeholder="비밀번호 재입력"><!--데이터-->
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
                        </div>
                    <li><a href="#">장바구니</a></li>
                    <!-- <li><a href="#">검색</a></li> -->
                    <li><a href="/slime/qna/qnaBoardList">Q & A</a></li>
                    <li><a href="#"><ion-icon name="search-outline"></ion-icon></a></li>
                </ul>
            </div>
        </nav>
    </header>

 <!---------------------->
   <!------QnA목차------->
   <!---------------------->

<input type="hidden" id="pg" value="${pg }">

<div class="qnaTableList"> 
    <section class="qnaTable">
        <div id="qna_list_wrap">
            <table id="boardListTable" border="1" cellpadding="3" cellspacing="0" frame="hsides" rules="rows">
                <tr>
                    <th width="180">글번호</th>
                    <th width="500">제목</th>
                    <th width="180">작성자</th>
                    <th width="100">조회수</th>
                    <th width="180">작성일</th>
                </tr>
         </table>
        </div>
    </section>

     <!---------------------->
    <!------글쓰기 버튼------->
    <!---------------------->
    <div id="QnaWriteBtn">
        <a href="/slime/qna/qnaWriteForm.jsp" role="button" class="writeFormBtn">작성하기</a> 
    </div>
    
    <!---------------------->
    <!------QnA페이지------->
    <!---------------------->
    <section class="qnaPg">
    <div id="boardPagingDiv" class="paging" style="text-align: center;"></div>
    </section>

    <!---------------------->
    <!------QnA검색------->
    <!---------------------->
    <section class="qnaSearch">
        <form id="boardSearchForm">
        <input type="hidden" name="pg" value="1">
            <div style="text-align: center;">
                <select name="searchType" style="width: 100px;">
                    <option value="subject" selected>제목</option>
                    <option value="member_id">아이디</option>
                </select>
                
                <input type="search" name="keyword" id="keyword" autocomplete="off">
                <input type="button" value="검색" id="boardSearchBtn">
            </div>
        </form>
    </section>
</div>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="../js/qnaBoardList.js"></script>
<script>
function boardPaging(pg){
	var keyword = document.getElementById("keyword").value;
	if(keyword == ""){
		location.href = 'qnaBoardList?pg='+pg;
	}else{
		$('input[name=pg]').val(pg);
		
		//강제로 이벤트를 발생
		//[2]페이지에서 다시 검색 버튼을 누르면 2페이지부터 찾는다
		//다시 검색 버튼을 눌렀을 때는 1페이지부터 검색을 할 수 있도록 정의한다.
		$('#boardSearchBtn').trigger('click', 'research');
	}
}
</script>

</body>

</html>