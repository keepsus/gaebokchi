//로그인
$('#loginBtn').click(function(){
	$('#loginIdDiv').empty();
	$('#loginPwdDiv').empty();
	
	if($('#loginId').val()==''){
		$('#loginIdDiv').text('아이디를 입력')
						.css('color','red')
						.css('font-size','8pt')
						.css('font-weight','bold');
		
	}else if($('#loginPwd').val()==''){
		$('#loginPwdDiv').text('비밀번호를 입력')
						 .css('color','red')
						 .css('font-size','8pt')
						 .css('font-weight','bold');
	}else{
		$.ajax({
			type : 'post',
			url: '/slime/member/login',
			data: {'member_id': $('#loginId').val(), 'pwpwpw': $('#loginPwd').val()},
		        	
			dataType: 'text',			
			success: function(data){
				if(data == 'success'){
					location.href = '/slime/index.jsp';
					
				}else if(data == 'fail'){
					
					alert('로그인 실패');
				}
			},
			error: function(err){
				console.log(err);
			}
			
		});
	}
});

//회원가입
$('#writeBtn').click(function(){
	$('#nameDiv').empty();
	$('#idDiv').empty();
	$('#pwdDiv').empty();
	$('#repwdDiv').empty();
	$('#emailDiv').empty();
	
	//if($('#name').val()==''){ -> 방법 1
	//if($('input[id=member_name]').val()==''){ -> 방법 2
	//id 속성이용은 2가지 방법 모두 가능
	if($('input[id=member_name]').val()==''){	
		$('#nameDiv').text('이름을 입력하세요');
		$('#nameDiv').css('color','red');
		$('#nameDiv').css('font-size','8pt');
		$('#nameDiv').css('font-weight','bold');
		
	}else if($('#member_id').val()==''){	//id 속성이용
		$('#idDiv').text('아이디를 입력하세요')
		$('#idDiv').css('color','red')
		$('#idDiv').css('font-size','8pt')
		$('#idDiv').css('font-weight','bold');
		
	}else if($('input[name=member_pw]').val()==''){
		$('#pwdDiv').text('비밀번호를 입력하세요')
		$('#pwdDiv').css('color','red')
		$('#pwdDiv').css('font-size','8pt')
		$('#pwdDiv').css('font-weight','bold');
		
	}else if($('input[name=repw]').val() != $('input[name=member_pw]').val()){
		$('#repwdDiv').text('비밀번호가 맞지 않습니다')
		$('#repwdDiv').css('color','red')
		$('#repwdDiv').css('font-size','8pt')
		$('#repwdDiv').css('font-weight','bold');
		
	}else if($('#member_id').val() != $('#check').val()){
		$('#idDiv').text('중복체크 하세요')
		$('#idDiv').css('color','red')
		$('#idDiv').css('font-size','8pt')
		$('#idDiv').css('font-weight','bold');
	
	}else if($('input[name=email1]').val()==''||$('input[name=email2]').val()==''){
		$('#emailDiv').text('이메일을 입력하세요')
		$('#emailDiv').css('color','red')
		$('#emailDiv').css('font-size','8pt')
		$('#emailDiv').css('font-weight','bold');
		
	}else{
		$('form[name=memberWriteForm]').submit();		
	}
});

//중복 아이디 체크
$('#member_id').focusout(function(){
	if($('#member_id').val()==''){
		$('#idDiv').text('먼저 아이디를 입력하세요')
		$('#idDiv').css('color','magenta')
		$('#idDiv').css('font-size','8pt')
		$('#idDiv').css('font-weight','bold');
	
	}else{
		$.ajax({
			type: 'post',
			url: '/slime/member/checkId',
			data: 'member_id='+$('#member_id').val(),
			dataType: 'text',
			success: function(data){
				if(data == 'exist'){
					$('#idDiv').text('사용 불가능')
					$('#idDiv').css('color','magenta')
					$('#idDiv').css('font-size','8pt')
					$('#idDiv').css('font-weight','bold');
					
				}else if(data == 'non_exist'){
					$('#check').val($('#member_id').val());					
					
					$('#idDiv').text('사용 가능')
					$('#idDiv').css('color','blue')
					$('#idDiv').css('font-size','8pt')
					$('#idDiv').css('font-weight','bold');
				}
			}
		});
	}
});

//우편번호
$('#checkPostBtn').click(function(){
	window.open("/slime/member/memberCheckPost", "zipcode", "width=700 height=500 scrollbars=yes");
});

$('#checkPostSearchBtn').click(function(){
	$.ajax({
		type: 'post',
		url: '/slime/member/checkPostSearch',
		data: $('#memberCheckPostForm').serialize(),	//serialize : '변수=값&변수=값'
		dataType: 'json',
		success: function(data){
			//alert(JSON.stringify(data));
			
			$('#checkPostTable tr:gt(2)').remove();
			
			$.each(data.list, function(index, items){
				var address = items.sido+' '
							+ items.sigungu+' '
							+ items.yubmyundong+' '
							+ items.ri+' '
							+ items.roadname+' '
							+ items.buildingname;
				
				address = address.replace(/null/g, '');
				
				$('<tr/>').append($('<td/>',{
					align: 'center',
					text: items.zipcode
					
				})).append($('<td/>',{
					colspan: '3',
					}).append($('<a/>',{
						href: '#',
						id: 'addressA',
						text: address
					}))
				).appendTo($('#checkPostTable'));
			});//each
			
			$('a').click(function(){
				//alert($(this).prop('tagName'));
				//alert($(this).parent().prev().text());
				
				$('#postcode', opener.document).val($(this).parent().prev().text());
				$('#address', opener.document).val($(this).text());
				$('#detailAddress', opener.document).focus();
				window.close();
			});
		},
		error: function(err){
			console.log(err);
		}
	});	
});

//회원정보수정
$('#modifyBtn').click(function(){
	$('#nameDiv').empty();
	$('#pwdDiv').empty();
	$('#repwdDiv').empty();
	
	if($('#member_name').val()==''){
		$('#nameDiv').text('이름을 입력하세요');
		$('#nameDiv').css('color','red');
		$('#nameDiv').css('font-size','8pt');
		$('#nameDiv').css('font-weight','bold');
		
	}else if($('input[name=member_pw]').val()==''){
		$('#pwdDiv').text('비밀번호를 입력하세요')
		$('#pwdDiv').css('color','red')
		$('#pwdDiv').css('font-size','8pt')
		$('#pwdDiv').css('font-weight','bold');
		
	}else if($('input[name=repw]').val() != $('input[name=member_pw]').val()){
		$('#repwdDiv').text('비밀번호가 맞지 않습니다')
		$('#repwdDiv').css('color','red')
		$('#repwdDiv').css('font-size','8pt')
		$('#repwdDiv').css('font-weight','bold');
		
	}else{
		$.ajax({
			type: 'post',
			url: '/slime/member/modify',
			data: $('#memberModifyForm').serialize(),	//serialize : '변수=값&변수=값'
			success: function(){
				alert('회원정보수정 완료');
				location.href='/slime/mypage/myPageOrder.jsp';
			},
			error: function(err){
				console.log(err);
			}
		});
	}
});


//이메일 인증 보내기
$('#emailBtn').click(function(){
	$('#emailDiv').empty();
	if($('input[name=email1]').val()==''||$('input[name=email2]').val()==''){
		$('#emailDiv').text('이메일을 입력하세요');
		$('#emailDiv').css('color','red');
		$('#emailDiv').css('font-size','8pt');
		$('#emailDiv').css('font-weight','bold');
		$('#emailDiv').css('border', '1px solid red');
		
	}else{
		$.ajax({
			type: 'post',
			url: '/slime/member/sendEmail',
			data: 'e_mail='+$('#email1').val()+'@'+$('#email2').val(),
			dataType: 'json',
			success: function(data){
				console.log('이메일 data ='+ JSON.stringify(data));//data가 들어오는것인가?이상한게 찍힌다.
				$('#checkEmailR').val(data.dice);//받은 인증번호를 jsp에 있는 hidden 속성에 넣어주기
			},
			error: function(err){
				console.log(err);
			}
		});
	}
	
});


//이메일 인증번호 확인
$('#emailCheckBtn').click(function(){
	$('#emailDiv').empty();
	
	if($('input[id=checkEmail]').val()==''){
		$('#emailDiv').text('이메일 인증번호를 입력해주세요 ')
		$('#emailDiv').css('color','magenta')
		$('#emailDiv').css('font-size','8pt')
		$('#emailDiv').css('font-weight','bold');
		
	}else{
		if
		(document.getElementById('checkEmail').value == document.getElementById('checkEmailR').value){
			$('#emailDiv').text('인증되었습니다.')
			$('#emailDiv').css('color','magenta')
			$('#emailDiv').css('font-size','8pt')
			$('#emailDiv').css('font-weight','bold');
		}else if
		(document.getElementById('checkEmail').value != document.getElementById('checkEmailR').value){
			$('#emailDiv').text('인증번호가 맞지 않습니다.')
			$('#emailDiv').css('color','magenta')
			$('#emailDiv').css('font-size','8pt')
			$('#emailDiv').css('font-weight','bold');
		}
	}
	
});



