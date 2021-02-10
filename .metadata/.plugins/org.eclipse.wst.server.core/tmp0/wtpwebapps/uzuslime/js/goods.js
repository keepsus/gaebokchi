//제품등록 - goodsWireForm 의 value="이미지등록" id="goodsWriteBtn"
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
		let formData = new FormData($('#goodsWriteForm')[0]);	                     
		$.ajax({	
			type: 'post',
			enctype: 'multipart/form-data',
			processData: false,
			contentType: false,
			url: '/slime/goods/goodsWrite',
			data: formData,			
			success: function(data){
				alert("이미지 등록 완료");
				location.href='/slime/goods/goodsList';				
			},//success
			error: function(err){
				console.log(err);
			}//error
		});//ajax
	}//else		
});//click



//제품정보 수정 - goodsView 의 value="제품정보 수정" id="goodsModifyBtn"
$('#goodsModifyBtn').click(function(){
	$('#goods_titleSpanDiv').empty();
	$('#goods_contentSpanDiv').empty();

	if($('#goods_titleSpan').val()==''){
		$('#goods_titleSpanDivDiv').text('제목을 입력하세요');
		$('#goods_titleSpanDivDiv').css('color','red');
		$('#goods_titleSpanDivDiv').css('font-size','8pt');
		$('#goods_titleSpanDivDiv').css('font-weight','bold');
		
	}else if($('#goods_contentSpan').val()==''){
		$('#goods_contentSpanDivDiv').text('내용을 입력하세요')
		$('#goods_contentSpanDivDiv').css('color','red')
		$('#goods_contentSpanDivDiv').css('font-size','8pt')
		$('#goods_contentSpanDivDiv').css('font-weight','bold');
		
	}else {
		$.ajax({
			type: 'post',
			url: '/slime/goods/goodsModify',
			data: $('#goodsModifyForm').serialize(),
			success: function(){
				alert('제품정보 수정 완료');
				location.href='/slime/goods/goodsList?pg='+$('#pg').val();
			},//success
			error: function(err){
				console.log(err);
			}//error
		});//ajax
	}//else		
});//click