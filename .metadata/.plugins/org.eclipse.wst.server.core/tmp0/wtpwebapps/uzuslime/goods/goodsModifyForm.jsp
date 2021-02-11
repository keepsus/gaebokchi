<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!-- <style>
.fileBox .fileName {display:inline-block;width:190px;height:30px;padding-left:10px;margin-right:5px;line-height:30px;border:1px solid #aaa;background-color:#fff;vertical-align:middle}
.fileBox .btn_file {display:inline-block;border:1px solid #000;width:100px;height:30px;font-size:0.8em;line-height:30px;text-align:center;vertical-align:middle}
.fileBox input[type="file"] {position:absolute;width:1px;height:1px;padding:0;margin:-1px;overflow:hidden;clip:rect(0,0,0,0);border:0}
</style>  -->
   
   
   
<form id="goodsModifyForm" name="goodsModifyForm">

<input type="hidden" name="seq" id="seq" value="${seq }">
<input type="hidden" name="pg" id="pg" value="${pg }">

<h3>상품정보 수정</h3>
<hr>	
	<table border="1">
		<tr>
			<td align="center">상품코드</td>
			<td>
				<input type="text" name="goods_id" id="goods_id" size="60" placeholder="상품코드 입력">
				<div id="goods_idDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>			
			</td>
		</tr>
		
		<tr>
			<td align="center">상품명</td>
			<td>
				<input type="text" name="goods_title" id="goods_title" cols="50" rows="15" placeholder="상품명 입력">	
				<div id="goods_titleDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>							
			</td>
		</tr>
		
		<tr>
			<td align="center">원산지</td>
			<td>
				<input type="text" name="goods_country" id="goods_country" cols="50" rows="15" placeholder="원산지 입력">	
				<div id="goods_countryDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>							
			</td>
		</tr>
		
		
		<tr>
			<td align="center">상품정가</td>
			<td>
				<input type="text" name="goods_price" id="goods_price" cols="50" rows="15" placeholder="상품정가 입력">	
				<div id="goods_priceDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>							
			</td>
		</tr>
		
		<tr>
			<td align="center">상품판매가</td>
			<td>
				<input type="text" name="goods_sales_price" id="goods_sales_price" cols="50" rows="15" placeholder="상품판매가 입력">	
				<div id="goods_sales_priceDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>							
			</td>
		</tr>
		
		<tr>
			<td align="center">개수</td>
			<td>
				<input type="text" name="goods_qty" id="goods_qty" cols="50" rows="15" placeholder="개수 입력">	
				<div id="goods_qtyDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>							
			</td>
		</tr>
		
		<tr>
			<td align="center">상품분류</td>
			<td>
				<input type="text" name="goods_status" id="goods_status" cols="50" rows="15" placeholder="상품분류 입력">	
				<div id="goods_statusDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>							
			</td>
		</tr>
		
		<tr>
			<td align="center">배송비</td>
			<td>
				<input type="text" name="goods_deli_price" id="goods_deli_price" cols="50" rows="15" placeholder="배송비 입력">	
				<div id="goods_deli_priceDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>							
			</td>
		</tr>

		<tr>
			<td align="center">산간도서 배송비</td>
			<td>
				<input type="text" name="goods_deli_extra" id="goods_deli_extra" cols="50" rows="15" placeholder="산간도 배송비 입력">	
				<div id="goods_deli_extraDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>							
			</td>
		</tr>		
		
		<tr>
			<td align="center">조건 무료 배송</td>
			<td>
				<input type="text" name="goods_deli_free" id="goods_deli_free" cols="50" rows="15" placeholder="무료 배송 조건 입력">	
				<div id="goods_deli_freeDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>							
			</td>
		</tr>		
		
		<tr>
			<td colspan="2">
				<input type="file" id="goods_image0" name="img" size="50">				
			</td>
		</tr>
		<!-- 이미지 두개 올릴 때, id는 다르고, name="img" 은 같아야 한다.왜? 배열 써야 하니까. -->
		<tr>
			<td colspan="2">
				<input type="file" id="goods_image1" name="img" size="50">				
			</td>
		</tr>
		
		<tr>
			<td align="center">내용</td>
			<td>
				<textarea name="goods_content" id="goods_content" cols="50" rows="15" placeholder="내용 입력"></textarea>	
				<div id="goods_contentDiv" style="color: red; font-size:8pt; font-weigth:bold;"></div>							
			</td>
		</tr>
		
		
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="목록" onclick="location.href='goodsList?pg=${pg }'">
				<input type="button" value="제품정보 수정" id="goodsModifyBtn">
				<input type="reset" value="다시작성">
				
				
				<br><br><br><br>
				<div class="fileBox">
					<input type="text" class="fileName" readonly="readonly">
					<label for="uploadBtn" class="btn_file">찾아보기</label>
					<input type="file" id="uploadBtn" class="uploadBtn">
				</div>
				
			</td>
		</tr>		
	</table>	
</form>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type = "text/javascript">
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/goods/getGoods',
		data: 'seq='+$('#seq').val(),
		dataType: 'json',
		success: function(data){
			alert(JSON.stringify(data)); //확인완료!!!
			
			$('#goods_id').val(data.goodsDTO.goods_id);
			$('#goods_title').val(data.goodsDTO.goods_title);
			$('#goods_country').val(data.goodsDTO.goods_country);
			$('#goods_price').val(data.goodsDTO.goods_price);
			$('#goods_sales_price').val(data.goodsDTO.goods_sales_price);
			$('#goods_qty').val(data.goodsDTO.goods_qty);
			$('#goods_point').val(data.goodsDTO.goods_point);
			$('#goods_status').val(data.goodsDTO.goods_status);
			$('#goods_deli_price').val(data.goodsDTO.goods_deli_price);
			$('#goods_deli_extra').val(data.goodsDTO.goods_deli_extra);
			$('#goods_deli_free').val(data.goodsDTO.goods_deli_free);
			//수정버튼 누르면, 무조건 사진을 다시 넣어야함...
			$('#goods_image0').val(data.goodsDTO.goods_image0);
			$('#goods_image1').val(data.goodsDTO.goods_image1);
			$('#goods_image2').val(data.goodsDTO.goods_image2);
			$('#goods_content').val(data.goodsDTO.goods_content);
			
			
			var uploadFile = $('.fileBox .uploadBtn');
			uploadFile.on('change', function(){
				if(window.FileReader){
					var filename = $(this)[0].files[0].name;
				} else {
					var filename = $(this).val().split('/').pop().split('\\').pop();
				}
				$(this).siblings('.fileName').val(filename);
			});
				
			
		},//success
		error: function(err){
			console.log(err);
		}//error
	});//ajax		
});//ready


</script>


	
