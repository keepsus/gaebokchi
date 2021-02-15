<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/slime/css/memberList.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,200;0,300;0,400;0,500;1,300;1,400&display=swap" rel="stylesheet">
<title>회원 목록</title>
</head>
<body>
	<h2>회원 목록</h2>
	<table border="1" width="700px">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>이메일</th>
			<th>번호</th>
			<th>주소</th>
		</tr>
			<c:forEach var="row" items="${list}">
		<tr>
				<td>${row.member_id }</td>
				<td>${row.member_name }</td>
				<td>${row.email1 }@${row.email2 } </td>
				<td>${row.tel1 }-${row.tel2 }-${row.tel3 }</td>
				<td>${row.addr1} ${row.addr2 }</td>
		</tr>
			</c:forEach>
	</table>
</body>
</html>