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
</style>


<form name="goodsIndexViewForm">
<table id="goodsIndexViewTable" cellpadding="5" frame="hsides" rules="rows">
    <tr>
        <td rowspan="4">
            <img id="goods_image0" width="200" height="200">
        </td>
        <td width = "250">
                        상품명: <span id="goods_titleSpan"></span>
        </td>
    <tr> 
        <td width="250">
                        단가 : <span id="goods_priceSpan"></span>
        </td>
    </tr>
    <tr>
        <td width="250">
                         개수 : <span id="goods_qtySpan"></span>
        </td>
    </tr>
    <tr>
        <td width="250">
                         합계 : <span id="totalSpan"></span>
        </td>
    </tr>
    <tr>
        <td colspan="3" height="200" valign="top">
            <pre class="contents"><span id="goods_content"></span></pre>
        </td>
    </tr>
</table>
<input type="button" value="목록" onclick="location.href='goodsIndexList?pg=${pg }'">
</form>



<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/goods/getGoodsView',
		data: 'seq=${seq}',
		dataType: 'json',
		success: function(data){			
			console.log(data);
			
			let total = data.goodsDTO.goods_price * data.goodsDTO.goods_qty;
			$('#goods_image0').attr('src', '../storage/'+data.goodsDTO.goods_image0);
			$('#goods_titleSpan').text(data.goodsDTO.goods_title);			
			$('#goods_priceSpan').text(data.goodsDTO.goods_price.toLocaleString());
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

