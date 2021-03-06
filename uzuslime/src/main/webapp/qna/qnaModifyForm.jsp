<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/qnaWriteForm.css">
    <title>QnA_글수정</title>
</head>
<body>
<form id="qnaModifyForm">
<input type="hidden" name="seq" id="seq" value="${seq }">
<input type="hidden" name="pg" id="pg" value="${pg }">

    <div class="qnaHeader" style="width: 100%;">
            <div class="write_header"></div>
                <div class="header_line">
                    <div class="border_name" style="color : #4a4a4a; font-size:x-large" >
                        <a href="/slime/qna/qnaBoardList"><strong>Q&A</strong></a>
                    </div>
                    <div class="btns">
                        <input type="reset" class="cancleQna" value="다시작성">
                        <button type="button" id="qnaModifyBtn" class="saveQna">글수정</button>
                    </div>
                </div>
            </div>
    </div>

    <!---------------------->
    <!------글 작성 Form------>
    <!---------------------->
    <section id="qnaWriteSection">
        <hr>
        <div class="qnaWriteForm">
                <div class="editor_box">
                    <div class="title_box">
                            <div class="qna_subject">
                                <input type="text" class="qna_subject" id="subject" name="subject" placeholder="제목" autocomplete="off">
                                <div id="subjectDiv"></div>
                            </div>
                            <div class="qnaBody" style="padding-top: 15px;">
                                <div class="txt_wrapper">
                                    <input type="text" class="qna_content" id="content" name="content" placeholder="문의글을 입력해주세요">
                                     <div id="contentDiv"></div>
                                </div>
                            </div>
                    </div>
                </div>
        </div>
    </section>
</form>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/qna/getBoard',
		data: 'seq='+$('#seq').val(),
		dataType: 'json',
		success : function(data){
			//alert(JSON.stringify(data));
			
			$('#subject').val(data.qnaDTO.subject);
			$('#content').val(data.qnaDTO.content);
		},
		error: function(err){
			console.log(err);
		}
	});
});

$('#qnaModifyBtn').click(function(){
	$('#subjectDiv').empty();
	$('#contentDiv').empty();

	if($('#subject').val()==''){
		$('#subjectDiv').text('제목을 입력하세요');
		$('#subjectDiv').css('color','black');
		$('#subjectDiv').css('font-size','8pt');
		$('#subjectDiv').css('font-weight','bold');
		
	}else if($('#content').val()==''){
		$('#contentDiv').text('수정할 내용을 입력하세요')
		$('#contentDiv').css('color','black')
		$('#contentDiv').css('font-size','8pt')
		$('#contentDiv').css('font-weight','bold');
		
	}else{
		$.ajax({
			type: 'post',
			url: '/slime/qna/qnaModify',
			data: $('#qnaModifyForm').serialize(),
			success: function(){
				alert('글수정 완료');
				location.href='/slime/qna/qnaBoardList?pg='+$('#pg').val();//여기 pg값을 못주고 있다.
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