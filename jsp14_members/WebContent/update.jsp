<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update.jsp</title>
</head>
<body>
<h1>수정하기</h1>
<table border="1" width="500">
<form action="update" method="post">
	<tr>
		<th>회원번호</th>
			<td><input type="text" name = "num" value="${vo.num }" readonly="readonly"></td>
	</tr>
	<tr>
		<th>이름</th>
			<td><input type="text" name = "name" value="${vo.name }"></td>
	</tr>
	<tr>
		<th>전화번호</th>
			<td><input type="text" name = "phone" value="${vo.phone }"></td>
	</tr>
	<tr>
		<th>주소</th>
			<td><input type="text" name = "addr" value="${vo.addr }"></td>
	</tr>
	<tr>
		<th>가입일</th>
		<td><input type="text" value="${vo.regdate }" disabled="disabled"></td>
	</tr>
</table>
	<input type="submit" value="수정하기">
</form>
<a href="main.jsp">메인...</a>
</body>
</html>