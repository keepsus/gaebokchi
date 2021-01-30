<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



	<form name="writeForm" method="post" action="/slime/member/write">
		<table border="1" cellpadding="3" cellspacing="0">
			<tr>
				<td width="100" align="center">이름</td>
				<td>
					<input type="text" name="member_name" placeholder="이름입력" >
					<div id="nameDiv"></div>	<!-- div 태그는 공백시 크기가 없지만, 객체가 입력되면 객체 크기만큼 입력됨 -->					
				</td>				
			</tr>

			<tr>
				<td align="center">아이디</td>
				<td>
					<input type="text" id="member_id" name="member_id" size="25" placeholder="아이디 입력" >					
					<input type="hidden" id="check" value=""> 
					<div id="idDiv"></div>														
				</td>
			</tr>

			<tr>
				<td align="center">비밀번호</td>
				<td>
					<input type="password" name="member_pw" size="30">
					<div id="pwdDiv"></div>	
				</td>
			</tr>
			
			<tr>
				<td align="center">재확인</td>
				<td>
					<input type="password" name="repw" size="30">
					<div id="repwdDiv"></div>	
				</td>
			</tr>
						
			<tr>
				<td align="center">이메일</td>
				<td>
					<input type="text" name="email1" size="30">
					@
					<input type="email" name="email2" list="email2" placeholder="직접 입력">
						<datalist id="email2">
							<option value="gmail.com"> </option>
							<option value="hanmail.com"> </option>
							<option value="naver.com"> </option>							
						</datalist>
				</td>
			</tr>

			<tr>
				<td align="center">핸드폰</td>
				<td>
					<select name="tel1" style=width:50px;>		
						<option value="010" selected>010</option>
						<option value="016">016</option>
						<option value="017">017</option>
						<option value="070">070</option>						
					</select>
					-
					<input type="text" name="tel2" size="8">
					-
					<input type="text" name="tel3" size="8">
				</td>
			</tr>

			<tr>
				<td align="center">주소</td>
				<td>
					<input type="text" id="postcode" name="zipcode" size="5"readonly>
					<input type ="button" value="우편번호검색" id="checkPostBtn"><br>															
					<input type="text" id="address" name="addr1" size="50" placeholder="주소" readonly><br>
					<input type="text" id="detailAddress" name="addr2" size="50" placeholder="상세주소">
				</td>
			</tr>

			<tr>
				<td colspan = "2" align="center">					
					<input type ="button" id="writeBtn" value="회원가입">					
				</td>				
			</tr>
			
			<input type="hidden" name="email_key" value="0">	<!-- 일단 0으로 처리 -->
			<input type="hidden" name="admin_yn" value="0">		<!-- 관리자는 1, 그 외는 0 -->	
											
								
		</table>
	</form>
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>	<!-- 위아래 순서가 바뀌면 안된다 -->
	<script type="text/javascript" src="/slime/js/member.js?ver=1"></script>	<!-- 위아래 순서가 바뀌면 안된다 -->
