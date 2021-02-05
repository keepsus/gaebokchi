
//주문정보 DB에 저장하기
$('#order_payBtn').click(function(){
	$.ajax({
		type: 'post',
		url: '/spring/order/orderOneGoods',
		data: $('#form_order').serialize(),
		success: function(){
			alert('주문 완료');
			location.href='/slime/index.jsp';
			
		},
		error : function(err){
			console.log(err);
		}
		
	});
	
});