$('#saveQna').click(function(){//name의 값만 넘어옴
	$('#subjectDiv').empty();
	$('#contentDiv').empty();

	if($('#subject').val()==''){
		$('#subjectDiv').text('제목을 입력하세요');
		$('#subjectDiv').css('color','black');
		$('#subjectDiv').css('font-size','9pt');
		$('#subjectDiv').css('font-weight','bold');
		
	}else if($('#content').val()==''){
		$('#contentDiv').text('문의글을 입력하세요')
		$('#contentDiv').css('color','black')
		$('#contentDiv').css('font-size','9pt')
		$('#contentDiv').css('font-weight','bold');
		
	}else {
		$.ajax({
			type: 'GET',
			url: '/slime/qna/qnaWrite',
			data: {'subject': $('#subject').val(),
				   'content': $('#content').val()},
			success: function(){
				alert('글쓰기 완료');
				location.href='/slime/qna/qnaBoardList';
			},
			error: function(err){
				console.log(err);
			}
		});
	}
});













