$('#goodsWriteBtn').click(function(){
	$('#goods_idDiv').empty();
	$('#goods_titleDiv').empty();
	$('#goods_priceDiv').empty();
	$('#goods_qtyDiv').empty();
	$('#goods_contentDiv').empty();
	
	if($('#goods_id').val() == 'img_' || $('#goods_id').val() == ''){
		$('#goods_idDiv').text('상품번호를 입력하세요');
		$('#goods_idDiv').css('color','red');
		$('#goods_idDiv').css('font-size','8pt');
		$('#goods_idDiv').css('font-weight','bold');
		
	}else if($('#goods_title').val() == ''){
		$('#goods_titleDiv').text('상품명을 입력하세요');
		$('#goods_titleDiv').css('color','red');
		$('#goods_titleDiv').css('font-size','8pt');
		$('#goods_titleDiv').css('font-weight','bold');
		
	}else if($('#goods_price').val() == ''){
		$('#goods_priceDiv').text('상품 가격을 입력하세요');
		$('#goods_priceDiv').css('color','red');
		$('#goods_priceDiv').css('font-size','8pt');
		$('#goods_priceDiv').css('font-weight','bold');
		
	}else if($('#goods_qty').val() == ''){
		$('#goods_qtyDiv').text('상품 수량을 입력하세요');
		$('#goods_qtyDiv').css('color','red');
		$('#goods_qtyDiv').css('font-size','8pt');
		$('#goods_qtyDiv').css('font-weight','bold');
		
	}else if($('#goods_content').val() == ''){
		$('#goods_contentDiv').text('내용을 입력하세요');
		$('#goods_contentDiv').css('color','red');
		$('#goods_contentDiv').css('font-size','8pt');
		$('#goods_contentDiv').css('font-weight','bold');
					
	}else{
		//1/2번
		//goodsForm 에서 method='post', enctype='multipart/form-data' 추가
		//servlet-context.xml 에서 resolver 추가
		//$('#goodsWriteForm').submit();
		
		//2/2번
		let formData = new FormData($('#goodsWriteForm')[0]);	//form 안에 있는모든 data 를 읽어라
		$.ajax({
			type: 'post',
			enctype: 'multipart/form-data',
			processData: false,	//데이터를 컨텐트 타입에 맞게 변환 여부
			contentType: false, //요청 컨텐트 타입	//multipart 이용할수 있도록 contentType을 무시하라는 뜻.
			url: '/slime/goods/goodsWrite',	//controller 를 거치겠지~!
			//form들이 여러개 있을 때, forms 사용.
			//제일위에 있는 form 은 forms의 0번째방처럼 배열로 인식됨.
			//forms[0], forms[1], forms[2]....
			data: formData,			
			success: function(data){
				alert("이미지 등록 완료");
				location.href='/slime/goods/goodsList';				
			},
			error: function(err){
				console.log(err);
			}
		});
	}		
});

/*
* processData
- 기본값은 true
- 기본적으로 query String 으로 변환해서 보내진다.('변수=값&변수=값' : processData 가 true 인 형식)
그런데 파일전송은 이런식으로 보내지면 안된다.
파일전송시에는 반드시 processData 값을 false 로 바꿔주어야 한다.(formData 가 문자열로 변환되지 않아야 한다.)

* contentType
- 기본적으로 "application/x-www-from-urlencode; charset=UTF-8
- 파일전송시에는 'multipart/form-data' 로 전송이 될 수 있도록 contectType을 false 로 설정한다.

이 두 설정이 안되면 ajax 통신이 안된다.

*/
