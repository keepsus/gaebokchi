<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/grid.css">
    <link rel="stylesheet" href="/slime/css/qnaBoard.css">
    <link rel="stylesheet" href="/slime/css/normalize.css">
    <link rel="stylesheet" href="/slime/css/index.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">

    <title>우주슬라임</title>   
     
</head>
<body>
    <!---------------------->
    <!--------HAEDER-------->
    <!---------------------->
    <header>
        <nav>
        	<jsp:include page="../indexNav.jsp"/>           
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
	<input type="button" id="writeFormBtn" class="writeFormBtn" value="작성하기">
    </div>
    
    <!---------------------->
    <!------QnA페이지------->
    <!---------------------->
    <section class="qnaPg">
    <div id="boardPagingDiv" class="paging" style="text-align: center;"></div>
    </section>

    <!---------------------->
    <!------QnA검색---------->
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

<!-- <script>
	function openNav() {
		document.getElementById('mySideNav').style.width = '250px';
	}
	function closeNav() {
		document.getElementById('mySideNav').style.width = '0';
	}
</script> -->

<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="../js/qnaBoardList.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script><!---->
<script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"> </script>
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