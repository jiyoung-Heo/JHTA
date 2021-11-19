<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update.jsp</title>
</head>
<body>
	<form action="update" method="post">
		<h1>SONG's GUESTBOOK 수정</h1>
		<table border="1" bordercolor="#00FF00">
			<!-- hidden: 사용자 화면에서 안보이지만 서버로 전송됨 -->
			<input type="hidden" name="num" value="${vo.num }">
			<tr>
				<th>회원번호</th>
				<!-- disabled="disabled"속성이 설정되면 서버로 전송이 안된다. -->
				<td><input type="text" name="num" value="${vo.num }" readonly="readonly"></td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td><input type="text" name="writer" value="${vo.writer }"></td>
			</tr>
			<tr>
				<th>email</th>
				<td><input type="text" name="email" value="${vo.email }"></td>
			</tr>
			<tr>
				<th>title</th>
				<td><input type="text" name="title" value="${vo.title}"></td>
			</tr>
			<tr>
				<th>content</th>
				<td><input type="text" name="content" value="${vo.content}"></td>
			</tr>
			<tr>
				<th>가입일</th>
				<td><input type="text" value="${vo.w_date }" readonly="readonly" ></td>
			</tr>
		</table>
		<input type="submit" value="수정">
	</form>
</body>
</html>