<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<input type="hidden" id="seq" value="${seq }">

<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

/* 
1. DB 갔다왔을 때! 
window.onload=function(){
	alert("글 삭제 완료")
	location.href="boardList";	//pg값이 1이면 생략해도 된다.
}
*/

$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/goods/goodsDelete',
		data: 'seq='+$('#seq').val(),
		success: function(){
			alert('제품정보 삭제 완료');
			location.href='/slime/goods/goodsList';
		},
		error: function(err){
			console.log(err);
		}
	});
});
</script>
