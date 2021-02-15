<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!---------------------->
<!---------MENU--------->
<!---------------------->
<section class="sidebar-section">
    <div class="menu-left">
        <span class="openMenu" onclick="openNav()"><ion-icon name="menu-outline"></ion-icon></span>
    </div>
    <div class="menu-center">
        <a href="/slime/index.jsp">크리스탈 슬라임</a>
    </div>
</section>

<!---------------------->
<!--------SIDEBAR------->
<!---------------------->
<div id="mySideNav" class="sideNav">
    <a href="" class="closeBtn" onclick="closeNav()">X</a>
    <a href="/slime/map/location.jsp" style="margin-top: 20px; font-size: 150%;"><ion-icon name="rocket-outline"></ion-icon></a>
    <a href="/slime/index.jsp" style="margin-top: 20px;">크리스탈 슬라임</a>
    <a href="/slime/qna/qnaBoardList" style="margin-top: 20px;">Q & A</a>
</div>

