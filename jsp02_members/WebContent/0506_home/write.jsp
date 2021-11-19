<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write.jsp</title>
</head>
<body>
<form action="checkWrite.jsp" method="post">
	<h1>SONG's GUESTBOOK 추가</h1>
	<table border="1" bordercolor="#00FF00">
		<tr>
			<th>글쓴이</th>
			<td><input type="text" name="writer"></td>
		</tr>
		<tr>
			<th>email</th>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<th>title</th>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<th>content</th>
			<td><input type="text" name="content"></td>
		</tr>
	</table>
	<input type="submit" value="추가">
</form>
</body>
</html>