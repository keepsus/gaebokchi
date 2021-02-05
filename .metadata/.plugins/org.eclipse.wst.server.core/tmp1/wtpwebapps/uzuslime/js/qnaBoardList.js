//목록
$(document).ready(function(){ //window.onload 와 같음
	$.ajax({
		type: 'post',
		url: '/slime/qna/getBoardList',
		data: {'pg': $('#pg').val()},
		dataType: 'json',
		success: function(data){//여기로 mv가 들어옴		
			$.each(data.list, function(index, items){
				$('<tr/>').append($('<td/>',{
					align: 'center',
					text: items.seq //글번호
				})).append($('<td/>',{//제목
					
					}).append($('<a/>',{
						href:'#',
						text: items.subject,
						id: 'subjectA',//이게 css속성값
						class: items.seq+''
					}))				
				).append($('<td/>',{
					align: 'center',
					text: items.member_id//items가 데이터를 하나씩 받아오는거
				})).append($('<td/>',{
					align: 'center',
					text: items.hit
				})).append($('<td/>',{
					align: 'center',
					text: items.logtime
				})).appendTo($('#boardListTable'));
				
//				//답글
				for(i=0; i<items.lev; i++){
					$('.'+items.seq).before('&emsp;');//$emsp가 세칸 공백 , &nbsp;
				}
				if(items.pseq!=0){
					$('.'+items.seq).before($('<img/>',{//이미지넣기
						src: '/slime/image/reply.jpg', width : '20px', height: '20px' 
					}));
				}
			
				//로그인 여부
				//각각 다른 이름의 class 속성을 지정하면 이벤트가 따로 불러진다
/*				$('.'+items.seq).click(function(){
					//alert($(this).prop('tagName'));
					
					if(data.memId == null){
						alert('먼저 로그인하세요');
					}else{
						//alert($(this).parent().prev().text());
						let seq = $(this).parent().prev().text();
					}
				});*/
				
				
			});//each
			
			//로그인 여부
			// a태그에 이벤트를 걸면 왼쪽메뉴에서도 이벤트가 걸려서 왼쪽메뉴를 클릭하면 "먼저 로그인하세요"가 뜬다
			//$('a').click(function(){
			
			//비동적 처리 - 목록 5줄이 id가 모두 'subjectA'라서 첫번째줄에만 이벤트가 걸린다
			//$('#subjectA').click(function(){
			
			//동적 처리 - 조상.on(이벤트, 자식, 함수(){});
			$('#boardListTable').on('click', '#subjectA', function(){
				//alert($(this).prop('tagName'));
				
				if(data.memId == null){
					alert('먼저 로그인하세요');
				}else{
					let seq = $(this).parent().prev().text();
					let pg = data.pg;
					location.href = '/slime/qna/qnaView?seq='+seq+"&pg="+pg;
				}
			});
			
			//----------------
			
			//페이징 처리
			$('#boardPagingDiv').html(data.boardPaging.pagingHTML);
		},
		error: function(err){
			console.log(err);
		}
	});
});

//검색
$('#boardSearchBtn').click(function(event, str){
	if(str != 'research') $('input[name=pg]').val(1); //직접 검색버튼을 눌렀을 때
	
	if($('#keyword').val() == ''){
		alert('검색어를 입력하세요');
	}else{
		$.ajax({
			type: 'post',
			url: '/slime/qna/getBoardSearch',
			data: $('#boardSearchForm').serialize(), //pg, searchType, keyword
			dataType: 'json',
			success: function(data){
				//alert(JSON.stringify(data));
				
				$('#boardListTable tr:gt(0)').remove();
				
				$.each(data.list, function(index, items){
					$('<tr/>').append($('<td/>',{
						align: 'center',
						text: items.seq
					})).append($('<td/>',{
						
						}).append($('<a/>',{
							href: '#',
							text: items.subject,
							id: 'subjectA',
							class: items.seq+''
						}))
					
					).append($('<td/>',{
						align: 'center',
						text: items.member_id
					})).append($('<td/>',{
						align: 'center',
						text: items.hit
					})).append($('<td/>',{
						align: 'center',
						text: items.logtime
					})).appendTo($('#boardListTable'));
					
					//답글
					for(i=0; i<items.lev; i++){
						$('.'+items.seq).before('&emsp;');
					}
					if(items.pseq!=0){
						$('.'+items.seq).before($('<img/>',{
							src: '../image/reply.gif'
						}));
					}
				});//each
				
				//페이징 처리
				$('#boardPagingDiv').html(data.boardPaging.pagingHTML);
			},
			error: function(err){
				console.log(err);
			}			
		});
	}
});
