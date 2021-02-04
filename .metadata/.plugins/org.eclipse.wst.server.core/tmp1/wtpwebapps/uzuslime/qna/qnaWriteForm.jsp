<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/slime/css/qnaWriteForm.css">
    <title>QnA</title>
</head>
<body>
<form>
    <div class="qnaHeader" style="width: 100%;">
            <div class="write_header"></div>
                <div class="header_line">
                    <div class="border_name" style="color : #4a4a4a; font-size:x-large" >
                        <a href="/slime/qna/qnaBoardList"><strong>Q&A</strong></a>
                    </div>
                    <div class="btns">
                        <input type="reset" class="cancleQna" value="취소">
                        <button type="button" id="saveQna" class="saveQna">작성</button>
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
<script type="text/javascript" src="../js/qnaWrite.js"></script>
</body>
</html>