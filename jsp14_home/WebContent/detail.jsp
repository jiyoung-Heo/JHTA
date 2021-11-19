<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail.jsp</title>
</head>
<body>
	<h1>SONG's GUESTBOOK 내용</h1>
	<table border="1" bordercolor="#00FF00">
		<tr>
			<th>글번호</th>
			<td>${vo.num}</td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td>${vo.writer}</td>
		</tr>
		<tr>
			<th>email</th>
			<td>${vo.email }</td>
		</tr>
		<tr>
			<th>title</th>
			<td>${vo.title }</td>
		</tr>
		<tr>
			<th>content</th>
			<td>${vo.content }</td>
		</tr>
	</table>
	<a href="delete?num=${vo.num }">삭제</a>
	<a href="update?num=${vo.num }">수정</a>
	<a href="list">목록</a>
	<a href="main.jsp">메인으로</a>
</body>
</html>
