$('#imageboardWriteBtn').click(function(){
	$('#goods_idDiv').empty();
	
	if($('#imageId').val() == 'img_' || $('#imageId').val() == ''){
		$('#goods_idDiv').text('상품코드를 입력하세요');
		$('#goods_idDiv').css('color','red');
		$('#goods_idDiv').css('font-size','8pt');
		$('#goods_idDiv').css('font-weight','bold');
	
	}else{
		//1.
		//$('#imageboardWriteForm').submit();
		
		//2. AJax통신 할 때
		let formData = new FormData($('#imageboardWriteForm')[0]);
		
		$.ajax({
			type: 'post',
			enctype: 'multipart/form-data',
			processData: false, //데이터를 컨텐트 타입에 맞게 변환 여부
			contentType: false, //요청 컨텐트 타입
			url: '/spring/imageboard/imageboardWrite',
			data: formData,
			success: function(data){
				alert("이미지 등록 완료");
				location.href = '/spring/imageboard/imageboardList';
			},
			error: function(err){
				console.log(err);
			}
		});
	}
});

/*
 * processData
 * - 기본값은 true
 * - 기본적으로 Query String으로 변환해서 보내진다('변수=값&변수=값')
 * - 파일 전송시에는 반드시 false로 해야 한다.(formData를 문자열로 변환하지 않는다)
 * 
 * contentType
 * - 기본적으로 "application/x-www-form-urlencoded; charset=UTF-8"
 * - 파일 전송시에는 'multipart/form-data'로 전송이 될 수 있도록 false로 설정한다
 */










