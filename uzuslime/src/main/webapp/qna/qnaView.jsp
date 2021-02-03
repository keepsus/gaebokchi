<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/grid.css">
    <link rel="stylesheet" href="/slime/css/qnaBoard.css">
    <link rel="stylesheet" href="/slime/css/normalize.css">
    <link rel="stylesheet" href="/slime/css/index.css">
    <link rel="stylesheet" href="/slime/css/qnaView.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
    <title>우주슬라임</title>   
     
</head>

<body>

 <!---------------------->
    <!--------HAEDER-------->
    <!---------------------->
    <header>
        <nav id="nav">
        	<jsp:include page="../menu.jsp"/>           
        </nav>
    </header>

<form name="qnaViewForm">
<section id="qnaViewSection">
<input type="hidden" name="seq" id="seq" value="${seq}">
<input type="hidden" name="pg" id="pg" value="${pg}">
<div class="viewModal" id="qnaViewTotal">
	 <div class="qnaView">
                <div class="qnaContent">
                    <div class="qnaHeader">
                        <div class="qnaTitle">
                        	<!--제목-->
                            <div class="subject" id="subjectSpan">제목들어가는 곳
                            </div>
                            <div class="qnaFix">
                            		<!-- 작성자 -->	
                            	<span class="idSpan" id="idSpan" >작성자</span>
                                <span class="qnaModify" id="qnaModify">
                                    <input type="button" id="qnaModify" value="수정" onclick="mode(1)">
                                    <input type="button" id="qnaDelete"  value="삭제" onclick="mode(2)">
                                </span>
                            </div>
                        </div>
                    <hr style="height:3px; border:0; margin:0px;">
                    </div><!--header-->
                    
                    <div class="qna_content" style="white-space">
                        <div class="qna_body_wrap">
                        <div class="qna_body" id="contentSpan">
								내용들어오는 곳
                        </div><!--qna_body-->
                        </div>
                    </div><!-- qna_content -->
                    <div class="view_wrap">
                        <div class="viewOut">
                        	<hr style="background-color: lightgray;">
                        	<div class="viewOutSpan">
                        	<span class="qnaReply">
                                    <input type="button" id="qnaReply" value="답글" onclick="mode(3)">
                             </span>
							<span class="qnaList">
                                    <input type="button" id="qnaList" value="목록" onclick="location.href='/slime/qna/qnaBoardList.jsp'">
                             </span>
                             </div><!--viewOutSpan-->
                         </div><!--viewOut-->
                     </div><!--view_wrap-->
                </div><!--qnaContent-->
            </div>
</div><!--modal -->
</section>
</form>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

 function mode(num){
	if(num==1){//글수정
		document.qnaViewForm.method="post";
		document.qnaViewForm.action="qnaModifyForm";
		document.qnaViewForm.submit();

/* 	}else if(num==2){//글삭제
		if(confirm("정말로 삭제하시겠습니까?")){
			document.boardViewForm.method="post";
			document.boardViewForm.action="boardDeleteForm";
			document.boardViewForm.submit();
		}		
	}else if(num==3){//답글
		document.boardViewForm.method="post";
		document.boardViewForm.action="boardReplyForm";
		document.boardViewForm.submit();
	} */
}

$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/qna/getBoard',//이 주소로 데이터를 보낸다.
		data: 'seq='+$('#seq').val(),
		dataType : 'json',//컨트롤러에서 돌아오는 데이터는 json타입이다
		success : function(data){
			alert(JSON.stringify(data));
			console.log(data);//이거는 f12번 눌러서의 console
			$('#subjectSpan').text(data.qnaDTO.subject);
/* 			$('#seqSpan').text(data.boardDTO.seq); */
			$('#idSpan').text(data.qnaDTO.member_id);
/* 			$('#hitSpan').text(data.boardDTO.hit); */
			$('#contentSpan').text(data.qnaDTO.content);
			
			if(data.memId == data.qnaDTO.member_id)
				$('#qnaModify').show();
			else
				$('#qnaModify').hide();
		},
		error: function(err){
			console.log(err);
		}
	});
});
</script>
