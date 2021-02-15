
//전체동의 체크
$('#all_agreement').click(function(){
	
	if($('#all_agreement').prop('checked')) {
		$('input[name=order_agreement_info]').prop('checked', true);
		$('input[name=order_agreement_order]').prop('checked', true);
	}else{
		$('input[name=order_agreement_info]').prop('checked', false);
		$('input[name=order_agreement_order]').prop('checked', false);
	}
});


//주문자 정보와 동일 체크
$('#orderer_reciver_same').click(function(){
	var name = $('#orderer_name').val();
	var hp = $('#orderer_hp').val();
	var zipcode = $('#orderer_zipcode').val();
	var addr1 = $('#orderer_addr1').val();
	var addr2 = $('#orderer_addr2').val();
	
	$('#receiver_name').val(name);
	$('#receiver_hp').val(hp);
	$('#postcode').val(zipcode);
	$('#address').val(addr1);
	$('#detailAddress').val(addr2);
	
	
});


//주문정보 DB에 저장하기
$('#order_payBtn').click(function(){
	
	var radioVal = $("input[name='pay_method']:checked").val();
	
	$('#orderer_nameDiv').empty();
	$('#orderer_name').css('border-color', '#cccccc');
	$('#orderer_hp').css('border-color', '#cccccc');
	$('#orderer_email').css('border-color', '#cccccc');
	$('#receiver_name').css('border-color', '#cccccc');
	$('#receiver_hp').css('border-color', '#cccccc');
	$('#delivery_zipcode').css('border-color', '#cccccc');
	$('#delivery_addr1').css('border-color', '#cccccc');
	$('#delivery_addr2').css('border-color', '#cccccc');
	
	$('#orderer_hpDiv').empty();
	$('#orderer_emailDiv').empty();
	
	$('#receiver_nameDiv').empty();
	$('#receiver_hpDiv').empty();
	$('#delivery_zipcodeDiv').empty();
	$('#delivery_addr1Div').empty();
	$('#delivery_addr2Div').empty();
	
	
	if($('#orderer_name').val() == ''){
		$('#orderer_nameDiv').text('주문자 이름을 입력하여 주십시오');
		$('#orderer_nameDiv').css('color','red');
		$('#orderer_nameDiv').css('font-size','8pt');
		$('#orderer_nameDiv').css('font-weight','bold');
		$('#orderer_name').css('border-color','red');
	}
	if($('#orderer_hp').val() == ''){
		$('#orderer_hpDiv').text('주문자 연락처를 입력하여 주십시오');
		$('#orderer_hpDiv').css('color','red');
		$('#orderer_hpDiv').css('font-size','8pt');
		$('#orderer_hpDiv').css('font-weight','bold');
		$('#orderer_hp').css('border-color','red');
	}
	if($('#orderer_email').val() == ''){
		$('#orderer_emailDiv').text('주문자 이메일을 입력하여 주십시오');
		$('#orderer_emailDiv').css('color','red');
		$('#orderer_emailDiv').css('font-size','8pt');
		$('#orderer_emailDiv').css('font-weight','bold');
		$('#orderer_email').css('border-color','red');
	}
	if($('#receiver_name').val() == ''){
		$('#receiver_nameDiv').text('수령인 이름을 입력하여 주십시오');
		$('#receiver_nameDiv').css('color','red');
		$('#receiver_nameDiv').css('font-size','8pt');
		$('#receiver_nameDiv').css('font-weight','bold');
		$('#receiver_name').css('border-color','red');
	}
	if($('#receiver_hp').val() == ''){
		$('#receiver_hpDiv').text('수령인 연락처를 입력하여 주십시오');
		$('#receiver_hpDiv').css('color','red');
		$('#receiver_hpDiv').css('font-size','8pt');
		$('#receiver_hpDiv').css('font-weight','bold');
		$('#receiver_hp').css('border-color','red');
	}
	if($('#postcode').val() == ''){
		$('#delivery_zipcodeDiv').text('우편번호를 입력하여 주십시오');
		$('#delivery_zipcodeDiv').css('color','red');
		$('#delivery_zipcodeDiv').css('font-size','8pt');
		$('#delivery_zipcodeDiv').css('font-weight','bold');
		$('#postcode').css('border-color','red');
	}
	if($('#address').val() == ''){
		$('#delivery_addr1Div').text('우편번호 찾기를 통해 주소를 입력하여 주십시오');
		$('#delivery_addr1Div').css('color','red');
		$('#delivery_addr1Div').css('font-size','8pt');
		$('#delivery_addr1Div').css('font-weight','bold');
		$('#address').css('border-color','red');
	}
	if($('#detailAddress').val() == ''){
		$('#delivery_addr2Div').text('상세주소를 입력하여 주십시오');
		$('#delivery_addr2Div').css('color','red');
		$('#delivery_addr2Div').css('font-size','8pt');
		$('#delivery_addr2Div').css('font-weight','bold');
		$('#detailAddress').css('border-color','red');
		
	}else if($('input[name=order_agreement_info]').prop('checked') == false){
		alert('개인정보 수집 및 이용 동의에 체크하여 주십시오');
	}else if($('input[name=order_agreement_order]').prop('checked') == false){
		alert('구매조건 확인 및 결제 진행 동의에 체크하여 주십시오');
	}else{
	
		if(radioVal == 'kakao'){
			$.ajax({
				type: 'post',
				url: '/slime/order/kakaoPay',
				data: $('#form_order').serialize(),
//				{
//					'goods_title':$('#goods_titleSpan').text(),
//					'order_goods_qty':$('input[name=numbox]').val(),
//					'goods_salse_price':$('#goods_sales_priceSpan').text(),	
//				},
				
				success: function(data){
					alert('카카오페이 결제창으로 넘어갑니다');
					alert(data);
					location.href=data;
					//var pg_token = location.href=data;
					//alert(pg_token);
					
				},
				error : function(err){
					console.log(err);
				}
				
			});//ajax(kakao)
			
//			$.ajax({
//				type:'get',
//				url: '/slime/order/kakaoPaySuccess',
//				data : pg_token,
//				dataType : 'json',
//				success: function(){
//
//					location.href='/slime/order/orderPayResult.jsp';
//				},
//				error : function(err){
//					console.log(err);
//				}
//			
//		});
		}else if(radioVal == 'cash'){
			$.ajax({
				type: 'post',
				url: '/slime/order/payToOrderGoods',
				data: $('#form_order').serialize(),
				dataType : 'json',
				success: function(){
					//alert('주문 완료');
					location.href='/slime/order/orderPayResult.jsp';
				},
				error : function(err){
					console.log(err);
				}
				
			});//ajax(else)
		}
		

		
	}
});//$('#order_payBtn').click


//orderPayResult.jsp
//홈버튼 누르면 메인으로 이동하기
$('#go_homeBtn').click(function(){
	location.href="/slime/index.jsp";
});

