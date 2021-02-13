//제품등록 - goodsWireForm 의 value="이미지등록" id="goodsWriteBtn"
$('#goodsWriteBtn').click(function(){
   $('#goods_idDiv').empty();
   $('#goods_titleDiv').empty();
   $('#goods_priceDiv').empty();
   $('#goods_qtyDiv').empty();
   $('#goods_contentDiv').empty();
   
   if($('#goods_id').val() == 'img_' || $('#goods_id').val() == ''){
      $('#goods_idDiv').text('상품번호를 입력하세요');
      $('#goods_idDiv').css('color','red');
      $('#goods_idDiv').css('font-size','8pt');
      $('#goods_idDiv').css('font-weight','bold');
      
   }else if($('#goods_title').val() == ''){
      $('#goods_titleDiv').text('상품명을 입력하세요');
      $('#goods_titleDiv').css('color','red');
      $('#goods_titleDiv').css('font-size','8pt');
      $('#goods_titleDiv').css('font-weight','bold');
      
   }else if($('#goods_price').val() == ''){
      $('#goods_priceDiv').text('상품 가격을 입력하세요');
      $('#goods_priceDiv').css('color','red');
      $('#goods_priceDiv').css('font-size','8pt');
      $('#goods_priceDiv').css('font-weight','bold');
      
   }else if($('#goods_qty').val() == ''){
      $('#goods_qtyDiv').text('상품 수량을 입력하세요');
      $('#goods_qtyDiv').css('color','red');
      $('#goods_qtyDiv').css('font-size','8pt');
      $('#goods_qtyDiv').css('font-weight','bold');
      
   }else if($('#goods_content').val() == ''){
      $('#goods_contentDiv').text('내용을 입력하세요');
      $('#goods_contentDiv').css('color','red');
      $('#goods_contentDiv').css('font-size','8pt');
      $('#goods_contentDiv').css('font-weight','bold');
               
   }else{
      let formData = new FormData($('#goodsWriteForm')[0]);                        
      $.ajax({   
         type: 'post',
         enctype: 'multipart/form-data',
         processData: false,
         contentType: false,
         url: '/slime/goods/goodsWrite',
         data: formData,         
         success: function(data){
            alert("이미지 등록 완료");
            location.href='/slime/goods/goodsList';            
         },//success
         error: function(err){
            console.log(err);
         }//error
      });//ajax
   }//else      
});//click



//제품정보 수정 - goodsView 의 value="제품정보 수정" id="goodsModifyBtn"
$('#goodsModifyBtn').click(function(){
   $('#goods_titleSpanDiv').empty();
   $('#goods_contentSpanDiv').empty();

   if($('#goods_titleSpan').val()==''){
      $('#goods_titleSpanDivDiv').text('제목을 입력하세요');
      $('#goods_titleSpanDivDiv').css('color','red');
      $('#goods_titleSpanDivDiv').css('font-size','8pt');
      $('#goods_titleSpanDivDiv').css('font-weight','bold');
      
   }else if($('#goods_contentSpan').val()==''){
      $('#goods_contentSpanDivDiv').text('내용을 입력하세요')
      $('#goods_contentSpanDivDiv').css('color','red')
      $('#goods_contentSpanDivDiv').css('font-size','8pt')
      $('#goods_contentSpanDivDiv').css('font-weight','bold');
      
   }else {
      $.ajax({
         type: 'post',
         url: '/slime/goods/goodsModify',
         data: $('#goodsModifyForm').serialize(),
         success: function(){
            alert('제품정보 수정 완료');
            location.href='/slime/goods/goodsList?pg='+$('#pg').val();
         },//success
         error: function(err){
            console.log(err);
         }//error
      });//ajax
   }//else      
});//click


//주문수량 버튼
//+ 버튼을 누르면 수량이 증가하되, 상품의 전체 수량보다 커지지 않음
$(".plus").click(function(){
   //alert($('.numbox').val());
   var num = $('.numbox').val();
   var plusNum = Number(num) + 1;
   var stock = $('#stock').val();
   
   if(plusNum > stock) {
      $(".numbox").val(num);
   } else {
      $(".numbox").val(plusNum);                              
   }
});//plus clickBtn


// - 버튼을 누르면 수량이 감소하되, 1보다 밑으로 감소하지 않음
$(".minus").click(function(){
   //alert($('.numbox').val());
   var num = $(".numbox").val();
   var minusNum = Number(num) - 1; 
   
   if(minusNum <= 0) {
      $(".numbox").val(num);
   } else {
      $(".numbox").val(minusNum);                              
   }
});//minus clickBtn



//주문하기 버튼
$('#goodsOrderBtn').click(function(){   
   //alert($('.numbox').val());   //input tag 안에 id 속성의 값
   //alert($('input[name=numbox]').val());   //input tag 의 name 속성의 값, 만능
   $.ajax({
      type: 'post',
      url: '/slime/order/orderOneGoodsForm',
      //data: 'kkk='+$('#goods_titleSpan').text(), //여기세 적으면 map 으로 들어감, 이렇게 적어도 되지만, 아래처점 json 표기법으로 사용하자!
      data: {'goods_id':$('#goods_idSpan').text(),
    	     'goods_title':$('#goods_titleSpan').text(),
             'order_goods_qty':$('input[name=numbox]').val(),
             'goods_sales_price':$('#goods_sales_priceSpan').text(),
             'goods_deli_price':$('#goods_deli_priceSpan').text()
           },
      dataType: 'json',
      success: function(data){
          alert(JSON.stringify(data));
          console.log(data);
    	  const encoded = encodeURI('/slime/order/orderForm.jsp');
    	  location.href= encoded;
      },//success
   });//aJax
});//click