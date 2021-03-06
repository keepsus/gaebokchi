<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel="stylesheet" href="/slime/css/qnaWriteForm.css">
	<title>qna_답변작성</title>
</head>
<body>
<form>
	<input type="hidden" id="pseq" value="${pseq }">
	<input type="hidden" id="pg" value="${pg }">

<div class="qnaHeader" style="width: 100%;">
            <div class="write_header"></div>
                <div class="header_line">
                    <div class="border_name" style="color : #4a4a4a; font-size:x-large" >
                        <a href="/slime/qna/qnaBoardList"><strong>Q&A</strong></a>
                    </div>
                    <div class="btns">
                        <input type="reset" class="cancleQna" value="다시작성">
                        <button type="button" id="QnaReplyBtn" class="saveQna">답변작성</button>
                    </div>
                </div>
            </div>

    <!---------------------->
    <!------글 작성 Form------>
    <!---------------------->
    <div class="qnaReplySection">
        <hr>
        <div class="qnaReplyForm">
                <div class="editor_box">
                    <div class="title_box">
                            <div class="qna_subject">
                                <input type="text" class="qna_subject" id="subject" name="subject" placeholder="제목" autocomplete="off">
                                <div id="subjectDiv"></div>
                            </div>
                            <div class="qnaBody" style="padding-top: 15px;">
                                <div class="txt_wrapper">
                                    <input type="text" class="qna_content" id="content" name="content" placeholder="답변을 입력해주세요" autocomplete="off">
                                     <div id="contentDiv"></div>
                                </div>
                            </div>
                    </div>
                </div>
        </div>
    </div>
</form>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
$('#QnaReplyBtn').click(function(){
	$('#subjectDiv').empty();
	$('#contentDiv').empty();

	if($('#subject').val()==''){
		$('#subjectDiv').text('제목을 입력하세요');
		$('#subjectDiv').css('color','black');
		$('#subjectDiv').css('font-size','8pt');
		$('#subjectDiv').css('font-weight','bold');
		
	}else if($('#content').val()==''){
		$('#contentDiv').text('답변을 입력하세요')
		$('#contentDiv').css('color','black')
		$('#contentDiv').css('font-size','8pt')
		$('#contentDiv').css('font-weight','bold');
	}else{
		$.ajax({
			type: 'post',
			url: '/slime/qna/qnaReply',
			data: {'pseq': $('#pseq').val(), //원글번호
				   'pg': $('#pg').val(), //원글이 있는 페이지번호
				   'subject': $('#subject').val(),
				   'content': $('#content').val()},
			success: function(){
				alert('답글쓰기 완료');
				location.href='/slime/qna/qnaBoardList';
			},
			error: function(err){
				console.log(err);
			}
		});
	}
});
</script>
</body>
</html>