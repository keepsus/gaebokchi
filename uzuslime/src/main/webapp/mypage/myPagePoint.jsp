<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/grid.css">
    <link rel="stylesheet" href="/slime/css/normalize.css">
    <link rel="stylesheet" href="/slime/css/index.css">
    <link rel="stylesheet" href="/slime/css/myPagePoint.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" /><!---->
    <title>포인트</title>
</head>
<body>
    
    <!---------------------->
    <!--------HAEDER-------->
    <!---------------------->
    <header>
        <nav>
            <div class="row">
                <a href="../index.jsp"><img src="/slime/image/logo.jpg" alt="slime logo" class="logo"></a>
				<jsp:include page="myPageNav.jsp"/>
            </div>
        </nav>
    </header>
    
	<!--------------------------->
	<!--------SIDEBAR-MENU------->
	<!--------------------------->
	<jsp:include page="../sideMenu.jsp"/>       
    
    

    <!-- SECTION -->
    <section>
        <div class="row">
				<jsp:include page="myPageMenu.jsp"/>	<!-- myPageMenu 불러오기 -->
				<jsp:include page="myPageBox.jsp"/>	<!-- myPageMenu 불러오기 -->  

            <div class="point-wrap">
                <h6>
                    <span>포인트</span>
                </h6>
                <table>
                    <thead>
                        <tr class="point-title">
                            <th>날짜</th>
                            <th>사유/내용</th>
                            <th>포인트내역</th>
                        </tr>
                    </thead>
                    
                    <tbody>
                        <tr class="point-history">
                            <td>%{}2021-01-19</td>
                            <td><strong>%{}신규회원 쇼핑지원금</strong></td>
                            <td>%{}500포인트</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </section>


    <!-- FOOTER -->
    <footer>
        <div class="row">
            <ul class="social-links">
                <li><a href="#"><ion-icon class="ion-social-facebook" name="logo-facebook"></ion-icon></a></li>
                <li><a href="#"><ion-icon class="ion-social-twitter" name="logo-twitter"></ion-icon></a></li>
                <li><a href="#"><ion-icon class="ion-social-googleplus" name="logo-google"></ion-icon></a></li>
                <li><a href="#"><ion-icon class="ion-social-instagram" name="logo-instagram"></ion-icon></a></li>
            </ul>
        </div>
        <div class="row">
            <p>
                copyright 2018. <strong>우주슬라임</strong> All rights reserved
            </p>
            <p>
                <strong>이용약관</strong>
                <strong>개인정보처리방침</strong>
            </p>
        </div>
    </footer>
    
	<script>
		function openNav() {
			document.getElementById('mySideNav').style.width = '250px';
		}
		function closeNav() {
			document.getElementById('mySideNav').style.width = '0';
		}
	</script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
    <script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"> </script>  
</body>
</html>