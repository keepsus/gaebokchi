<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<style type="text/css">
.contents {
    white-space: pre-line;
    word-break: break-all;
    width: 450px;
}

.goods-item-box{
	margin-left: 20%;
	position: relative;
	bottom: 130px;
}
</style>

<div class="goods-item-box">

	<form name="goodsViewForm">
		<input type="hidden" name="seq" id="seq" value="${seq }">
		<input type="hidden" name="pg" id="pg" value="${pg }">
			
		<table id="goodsViewTable" cellpadding="5" frame="hsides" rules="rows">
		    <tr>
		        <td rowspan="4">
		            <img id="goods_image0" width="200" height="200">
		        </td>
		        <td rowspan="4">
		            <img id="goods_image1" width="200" height="200">
		        </td>	
		        <td width = "250">
		        	상품명: <span id="goods_titleSpan"></span>
		        	<div id="goods_titleSpanDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>
		        </td>
			</tr>
			
		    <tr> 
		        <td width="250">
					정상가 : <span id="goods_priceSpan"></span>
		        </td>
		    </tr>
		    
		    <tr>
		        <td width="250">
					세일가 : <span id="goods_sales_priceSpan"></span>
		        </td>
		    </tr>
		    
		    <tr>
		        <td width="250">
					재고 : <span id="goods_qtySpan"></span>
		        </td>
		    </tr>
		    
		    <tr>
		        <td colspan="3" height="200" valign="top">
		            <pre class="contents"><span id="goods_contentSpan"></span></pre>
		            <div id="goods_contentSpanDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>
		        </td>
		    </tr>
		    
		</table>
		
		<input type="button" value="목록" onclick="location.href='goodsList?pg=${pg }'">
		<span id="goodsViewSpan">
			<input type="button" value="제품정보 수정" onclick="mode(1)">
			<input type="button" value="제품정보 삭제" onclick="mode(2)">
		</span>
	</form>
</div>



<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src= "../js/goods.js"></script>
<script type="text/javascript">
function mode(num){
	if(num==1){//제품정보 수정
		document.goodsViewForm.method="post";
		document.goodsViewForm.action="goodsModifyForm";
		document.goodsViewForm.submit();
		
	}else if(num==2){//제품정보 삭제
		if(confirm("정말로 삭제하시겠습니까?")){
			document.goodsViewForm.method="post";
			document.goodsViewForm.action="goodsViewDeleteForm";
			document.goodsViewForm.submit();
		}		
	}
}//mode
</script>


<script>
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/goods/getGoodsView',
		data: 'seq=${seq}',
		dataType: 'json',
		success: function(data){
			//console.log(data);
			
			let total = data.goodsDTO.goods_price * data.goodsDTO.goods_qty;
			$('#goods_image0').attr('src', '../storage/'+data.goodsDTO.goods_image0);
			$('#goods_image1').attr('src', '../storage/'+data.goodsDTO.goods_image1);
			$('#goods_image2').attr('src', '../storage/'+data.goodsDTO.goods_image2);
			$('#goods_image3').attr('src', '../storage/'+data.goodsDTO.goods_image3);
			$('#goods_titleSpan').text(data.goodsDTO.goods_title);			
			$('#goods_priceSpan').text(data.goodsDTO.goods_price.toLocaleString());
			$('#goods_sales_priceSpan').text(data.goodsDTO.goods_sales_price.toLocaleString());
			$('#goods_qtySpan').text(data.goodsDTO.goods_qty);
			$('#totalSpan').text(total.toLocaleString());
			$('#goods_contentSpan').text(data.goodsDTO.goods_content);
			
		},
		error: function(err){
			console.log(err);
		}
	});
});
</script>

