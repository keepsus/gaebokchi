<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- <form id="imageboardWriteForm" method="post" enctype="multipart/form-data" action="imageboardWrite"> -->
<form name="imageboardWriteForm">
<h3>상품 등록</h3>
<hr>
<table border="1">
<tr>
   <td align="center" width="70" >id</td>
   <td>
      <input type="text" id="goods_id" name="goods_id" size="30" placeholder="상품코드 입력 (1부터 정수순서대로, seq를대신함.임시)">
      <div id="goods_idDiv"></div>
   </td>
</tr>
<tr>
   <td align="center" width="70">title</td>
   <td>
      <input type="text" id="goods_title" name="goods_title" size="30" placeholder="상품명 입력">
   </td>
</tr>
<tr>
   <td align="center" width="70">country_of_origin</td>
   <td>
      <input type="text" id="goods_country_of_origin" name="goods_country_of_origin" size="30" placeholder="상품명 입력">
   </td>
</tr>
<tr>
   <td align="center" width="70">price</td>
   <td>
      <input type="text" id="goods_price" name="goods_price" size="30" placeholder="상품명 입력">
   </td>
</tr>
<tr>
   <td align="center" width="70">sales_price</td>
   <td>
      <input type="text" id="goods_sales_price" name="goods_sales_price" size="30" placeholder="상품명 입력">
   </td>
</tr>
<tr>
   <td align="center" width="70">point</td>
   <td>
      <input type="text" id="goods_point" name="goods_point" size="30" placeholder="상품명 입력">
   </td>
</tr>
<tr>
   <td align="center" width="70">status</td>
   <td>
      <input type="text" id="goods_status" name="goods_status" size="30" placeholder="상품명 입력">
   </td>
</tr>
<tr>
   <td align="center" width="70">deli_price</td>
   <td>
      <input type="text" id="goods_delivery_price" name="goods_delivery_price" size="30" placeholder="상품명 입력">
   </td>
</tr>
<tr>
   <td align="center" width="70">deli_date</td>
   <td>
      <input type="text" id="goods_delivery_date" name="goods_delivery_date" size="30" placeholder="상품명 입력">
   </td>
</tr>
<tr>
   <td align="center" width="70">deli_extra_charge</td>
   <td>
      <input type="text" id="goods_delivery_extra_charge" name="goods_delivery_extra_charge" size="30" placeholder="상품명 입력">
   </td>
</tr>
<tr>
   <td align="center" width="70">deli_free_condition</td>
   <td>
      <input type="text" id="goods_delivery_free_condition" name="goods_delivery_free_condition" size="30" placeholder="상품명 입력">
   </td>
</tr>
<!-- --> <tr>
   <td colspan="2">
      <input type="file" id="goods_filename" name="img" size="50">
   </td>
</tr>

<tr>
   <td colspan="2">
      <input type="file" id="goods_filename_detail" name="img" size="50">
   </td>
</tr> 
<!-- 
<tr>
   <td colspan="2">
      	타이틀 이미지<input type="file" id="goods_filename" name="img[]" size="50" multiple>
   </td>
</tr>
<tr>
   <td align="center">디테일이미지</td>
   <td>
      <textarea rows="10" cols="50" id="goods_filename_detail" name="goods_filename_detail" values="1"></textarea>
   </td>
</tr>
 -->
<tr>
   <td align="center">상품 설명 내용</td>
   <td>
      <textarea rows="10" cols="50" id="goods_context" name="goods_context" placeholder="내용입력"></textarea>
   </td>
</tr>
<tr>
   <td colspan="2" align="center">
      <input type="button" value="이미지 등록" id="imageboardWriteBtn">
      <input type="reset" value="다시작성">
   </td>
</tr>

</table>
</form>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="../js/imageboard.js"></script>
















