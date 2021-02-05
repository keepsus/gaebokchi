<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/grid.css">
    <link rel="stylesheet" href="/slime/css/normalize.css">
    <link rel="stylesheet" href="/slime/css/index.css">
    <link rel="stylesheet" href="/slime/css/myPageDetailPage.css">
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
                <img src="/slime/image/logo.jpg" alt="slime logo" class="logo">
                <ul class="main-nav">
                    <li><a href="#">마이페이지</a></li>
                    <li><a href="#">장바구니</a></li>
                    <!-- <li><a href="#">검색</a></li> -->
                    <li><a href="#"><ion-icon name="search-outline"></ion-icon></a></li>
                </ul>
            </div>
        </nav>
    </header>
    
    <!---------------------->
    <!---------MENU--------->
    <!---------------------->
    <section class="sidebar-section">
        <div class="menu-left">
            <span class="openMenu" onclick="openNav()"><ion-icon name="menu-outline"></ion-icon></span>
        </div>
        <div class="menu-center">
            <a href="../index.jsp">크리스탈 슬라임</a>
        </div>
    </section>


    <!---------------------->
    <!--------SIDEBAR------->
    <!---------------------->
    <div id="mySideNav" class="sideNav">
        <a href="" class="closeBtn" onclick="closeNav()">X</a>
        <a href="#" style="margin-top: 20px; font-size: 150%;"><ion-icon name="rocket-outline"></ion-icon></a>
        <a href="../index.jsp" style="margin-top: 20px;">크리스탈 슬라임</a>
    </div>
    
    
    <section>
        <div class="row">
                <div class="col span-1-of-2">
                    <img src="/slime/image/img1.jpg" alt="제품1 상세페이지">
                    <div></div>
                </div>
                <div class="col span-1-of-2">
                    <div class="goods_wrap">
                        <h3>[크리스탈슬라임] 네온시드</h3><!-- 데이터 -->
                        <span>7,500원 8,000원</span><!-- 데이터 -->
                        <hr>
                        <p>비비드한 네온 색상의 씨앗 모양의 비즈로 이루어진 크런치 타입.<br> 비비드한 색상으로 시각적 즐거움을 물론, 소리도 꼬득꼬득 재미있답니다:)<br> 새콤달콤한 네온컬러같은 상큼한 과일향이 나요.</p><!-- 데이터 -->
                        <div class="item-detail-wrap">
                            <div class="item-detail">
                                <span><strong>원산지</strong></span><!-- 데이터 -->
                                <span>한국</span> <!-- 데이터 -->
                            </div>
                            <div class="item-detail">
                                <span><strong>구매혜택</strong></span><!-- 데이터 -->
                                <span>포인트 적립예정</span><!-- 데이터 -->
                            </div>
                            <div class="item-detail">
                                <span><strong>배송 방법</strong></span><!-- 데이터 -->
                                <span>택배</span><!-- 데이터 -->
                            </div>
                            <div class="item-detail">
                                <span><strong>배송비</strong></span>
                                <span>2500</span>
                            </div>
                            <div>
                                <div class="opt-block">
                                    <div>
                                        <span>수량</span> <!-- 데이터 -->
                                    </div>
                                    <hr>
                                    <div class="opt-button-wrap">
                                        <div>
                                            <input type="text">
                                        </div>
                                        <span>7.500</span> <!-- 데이터 -->
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                </div>
            
        </div>
    </section>
	
	
	<script>
		function openNav() {
			document.getElementById('mySideNav').style.width = '250px';
		}
		function closeNav() {
			document.getElementById('mySideNav').style.width = '0';
		}
	</script>
    

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script><!---->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script><!---->
    <script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"> </script>  
</body>
</html>


