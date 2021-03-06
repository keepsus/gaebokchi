<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>
.box{
	margin:0 auto;
	margin-left: 20%;
	position: relative;
	bottom: 130px;
	}
</style>

<form id="goodsWriteForm">
<div class="box">
	<h3>제품등록</h3>	
		<table border="1">
			<tr>
				<td align="center">상품코드</td>
				<td>
					<input type="text" name="goods_id" id="goods_id" value="img_" size="60" placeholder="상품코드 입력">
					<div id="goods_idDiv"></div>			
				</td>
			</tr>
			
			<tr>
				<td align="center">상품명</td>
				<td>
					<input type="text" name="goods_title" id="goods_title" cols="50" rows="15" placeholder="상품명 입력">	
					<div id="goods_titleDiv"></div>							
				</td>
			</tr>
							
			<tr>
				<td align="center">상품정가</td>
				<td>
					<input type="text" name="goods_price" id="goods_price" cols="50" rows="15" placeholder="상품정가 입력">	
					<div id="goods_priceDiv"></div>							
				</td>
			</tr>
			
			<tr>
				<td align="center">상품판매가</td>
				<td>
					<input type="text" name="goods_sales_price" id="goods_sales_price" cols="50" rows="15" placeholder="상품판매가 입력">	
					<div id="goods_sales_priceDiv"></div>							
				</td>
			</tr>
			
			<tr>
				<td align="center">개수</td>
				<td>
					<input type="text" name="goods_qty" id="goods_qty" cols="50" rows="15" placeholder="개수 입력">	
					<div id="goods_qtyDiv"></div>							
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
			<!-- 이미지 두개 올릴 때, id는 다르고, name="img" 은 같아야 한다.왜? 배열 써야 하니까. -->
			<tr>
				<td colspan="2">
					<input type="file" id="goods_image2" name="img" size="50">				
				</td>
			</tr>
			
			
			<tr>
				<td align="center">내용</td>
				<td>
					<textarea name="goods_content" id="goods_content" cols="50" rows="15" placeholder="내용 입력"></textarea>	
					<div id="goods_contentDiv"></div>							
				</td>
			</tr>
			
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="이미지 등록" id="goodsWriteBtn">
					<input type="reset" value="다시 작성">
				</td>
			</tr>		
		</table>	
</div>
</form>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src= "../js/goods.js"></script>


	
