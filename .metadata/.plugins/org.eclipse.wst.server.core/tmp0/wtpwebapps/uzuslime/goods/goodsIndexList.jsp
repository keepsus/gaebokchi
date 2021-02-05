<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    


    
<form id="goodsIndexListForm">
	<div id="goodsIndexList">asdf</div>	 
	
</form>



<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/goods/getGoodsIndexList',
		dataType: 'json',
		success: function(data){			
			//alert(JSON.stringify(data)); 
 			console.log(data);
 			
 			$.each(data.list, function(index, items){
 				$('<div/>').append($('<img/>',{
 					src: '/slime/storage/'+items.goods_image0,
 					style: 'width: 70px; height: 70px; cursor: pointer;',
 					class: items.seq+'' 					
 				})).appendTo($('#goodsIndexList'));
 				
 				//이미지 보기
				$('.'+items.seq).click(function(){
					location.href="/slime/goods/goodsIndexView?seq="+items.seq+"&pg="+data.pg;
				});
 				
 			});//each
 			
		},//success
		error: function(err){
			console.log(err);
		}
		
	});//ajax
});//ready


</script>



