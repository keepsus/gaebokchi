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



//주문정보 DB에 저장하기
$('#order_payBtn').click(function(){
	
	//결제가 카카오페이로 되어있는 경우 - 
	if($("input:radio[name='pay_method':radio[value='kakao']".prop('checked',true))){
		$.ajax({
			type: 'post',
			url: '/slime/order/kakaoPayReady',
			data: $('#form_order').serialize(),
			success: function(){
				alert('카카오 결제페이지로 이동합니다');
			},
			error : function(err){
				console.log(err);
			}
			
		});//ajax(kakao)
	}else{
		$.ajax({
			type: 'post',
			url: '/slime/order/payToOrderGoods',
			data: $('#form_order').serialize(),
			success: function(){
				alert('주문 완료');
				location.href='/slime/index.jsp';
				
			},
			error : function(err){
				console.log(err);
			}
			
		});//ajax(else)
	}
		
});//$('#order_payBtn').click
