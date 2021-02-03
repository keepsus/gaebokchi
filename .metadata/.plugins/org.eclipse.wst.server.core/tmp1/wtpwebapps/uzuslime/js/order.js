
//주문정보 DB에 저장하기
$('#order_payBtn').click(function(){
	$.ajax({
		type: 'POST',
		url: '/slime/order/orderOneGoods',
		data: $('#form_order').serialize(),
		dataType : 'json',
		success: function(data){
			alert('주문 완료');
			location.href='/slime/index';
		},
		error : function(err){
			console.log(err);
		}
		
	});
	
});


