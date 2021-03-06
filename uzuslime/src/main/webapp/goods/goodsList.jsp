<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    


<style>	
	#currentPaging{
		color:red;
		text-decoration: underline;
		cursor: pointer;
	}
	#paging{
		color:black;
		text-decoration: none;
		cursor: pointer;
	}
	
	.table-box{
		margin-top: 5%;
		margin-left: 19%;
		position: relative;
		bottom: 190px;
	}
	
	.table-sub-box{
		position: relative;
		bottom: 100px;
		}
	
 	#goodsPagingDiv{
		display: inline-block;
		margin-left: 25%;
		margin-top: 3%;
	}
	
	
</style>


    
<form id="goodsListForm" method="get" action="goodsCheckDelete">
	<div class="table-box">
		<table id="goodsListMypageTable" border="1" frame="hsides" rules="rows">
			<tr>
				<th width="100"><input type="checkbox" id="all">번호</th>
				<th width="150">이미지</th>
				<th width="150">상품명</th>
				<th width="100">정상가</th>
				<th width="100">세일가</th>
				<th width="100">재고</th>		
			</tr>	
		</table>
	</div>
	
	<div class="table-sub-box">
		<div style="margin-left: 52%; width: 90px;"> 
			<input type="button" value="선택삭제" id="choiceDeleteBtn">
		</div>
	
	
	
	<!-- 페이징 처리 -->
		<div id="goodsPagingDiv" style="float: left; width: 700px; text-align: center;"></div> 
	</div>
</form>



<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		type: 'post',
		url: '/slime/goods/getGoodsList',
		data: 'pg=${pg}',	//컨트롤러에서 보내온 pg 값을 바로 받는다.	//id 속성 : $('#id').val() or $('.id').val() //컨트롤러 : ${pg}
		dataType: 'json',
		success: function(data){			
			//console.log(data);
			
			
			$.each(data.list, function(index, items){
				$('<tr/>').append($('<td/>',{
					align: 'center',
					text: items.seq
					
					
					}).prepend($('<input/>', {	//checkbox 추가
						type: 'checkbox',
						name: 'check',
						value: items.seq
						
						}))				
				
				).append($('<td/>',{
					align: 'center',
					//text: items.image1 //table 에 img 띄었으면 필요없음
					
					}).append($('<img/>',{
						src: '/slime/storage/'+items.goods_image0,
						style: 'width: 100px; height: 100px; cursor: pointer;',
						class: items.seq+''
					}))
							
				
				).append($('<td/>',{
					align: 'center',
					text: items.goods_title
					
				})).append($('<td/>',{
					align: 'center',
					text: items.goods_price.toLocaleString()
										
				})).append($('<td/>',{
					align: 'center',
					text: (items.goods_sales_price).toLocaleString()
					
				})).append($('<td/>',{
					align: 'center',
					text: items.goods_qty
					
				})).appendTo($('#goodsListMypageTable'));
				
				
				//이미지 보기
				$('.'+items.seq).click(function(){
					location.href="/slime/goods/goodsView?seq="+items.seq+"&pg="+data.pg;
				});
				
			});//each
			
			//페이징 처리 
			$('#goodsPagingDiv').html(data.goodsPaging.pagingHTML);
			
			
		},//success
		error: function(err){
			console.log(err);
		}//error
		
	});//ajax
});//ready


//연결부분~~~~~~

function goodsPaging(pg){			
	location.href="goodsList?pg="+pg;	//.do 만 삭제	
}	

//전체선택 또는 해제
$('#all').click(function(){
	//$('#all').attr('checked'));	//undefine, checked="checked" 같이 checked 라는 속성이 없음
	//$('#all').prop('checked'));	//true or false	
	/*
	if($('#all').attr : attr 사용하면 아니됨
	아래 2개 모두 tag 안에 있는 속성을 가져오는 것
	.attr() : 문자열로 가져옴!
	.prop() : 자바스크립트 값을 가져옴!
	*/
	if($('#all').prop('checked'))	//miniproject 와 달리 for문이 필요가 없다.
		$('input[name=check]').prop('checked', true);	//true 라는 이름의 속성을 주라는 뜻!		
	else
		$('input[name=check]').prop('checked', false);			
});
	

//선택 삭제
$('#choiceDeleteBtn').click(function(){
	let count = $('input[name=check]:checked').length;	//table:gt(0) 하는거랑 같은 개념이다.
	
	if(count == 0)
		alert('먼저 삭제할 항목을 선택하세요!')
	else{
		if(confirm('정말로 삭제하시겠습니까?')){
			$('#goodsListForm').submit();	//get방식! -> ImageboardController.java 로 가서 코드 작성하자!
		}
	}
});
	


function choiceDelete(){
	let check = document.getElementsByName("check");
	let count = 0;
	
	for(var i=0; i<check.length; i++){
		if(check[i].checked) count++; 
	}//for
	
	console.log("count = "+count);
	
	if(count ==0)
		alert("삭제할 항목을 선택하세요.")
	else
		if(confirm("정말로 삭제 하시겠습니까?"))
			document.goodsListForm.submit();
}

</script>


<%--
attr()
- HTML에 작성된 속성값을 문자열로 받아온다.

prop()
- 자바스크립트의 프로퍼티를 가져온다.
- 자바스크립의 프로퍼티 값이 넘어오므로 boolean, date, function 등을 가져올 수 있다.

[형식] 
prop(key) : 속성값을 가져온다.
prop(key, value) : 속성값을 추가한다.

[실습]
example04.html
--%>




