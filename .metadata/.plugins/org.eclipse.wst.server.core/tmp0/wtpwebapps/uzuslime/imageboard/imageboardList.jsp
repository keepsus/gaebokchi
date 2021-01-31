<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<style>
#currentPaging {
	color: red;
	text-decoration: underline;
	cursor: pointer;
}
#paging {
	color: black;
	text-decoration: none;
	cursor: pointer;
}
</style>

<div id="imageboardListTable" border="1" frame="hsides" rules="rows">
</div>


<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/imageboard/getImageboardList',
		data: 'pg=${pg}',
		dataType: 'json',
		success : function(data){
			console.log(data);
			
			$.each(data.list, function(index, items){
				$('<tr/>').append($('<td/>',{
					align: 'center',
					
					}).append($('<img/>',{
						src: '/slime/storage/'+items.goods_filename,
						style: 'width: 70px; height: 70px; cursor: pointer;',
						class: items.goods_id+''
					}))
				).append($('<td/>',{
					align: 'center',
					text: items.goods_title
					
				})).appendTo($('#imageboardListTable'));  
				
				//이미지 보기
				$('.'+items.goods_id).click(function(){
					location.href = '/slime/imageboard/imageboardView?goods_id='+items.goods_id;            
				});
			});//each
			
		},
		error: function(err){
			console.log(err);
		}
	});
});
</script>











