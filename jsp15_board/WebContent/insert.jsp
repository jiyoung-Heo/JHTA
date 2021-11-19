<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert.jsp</title>
</head>
<body>
<h1>글등록하기</h1>
<form action="insert" method="post">
	<input type="hidden" name = "num" value = "${param.num}">
	<input type="hidden" name = "ref" value = "${param.ref}">
	<input type="hidden" name = "lev" value = "${param.lev}">
	<input type="hidden" name = "step" value = "${param.step}">
	작성자<br>
	<input type="text" name ="writer"><br>
	제목<br>
	<input type="text" name ="title"><br>
	내용<br>
	<textarea rows="5" cols="50" name = "content"></textarea>
	<input type="submit" value="등록"> 
</form>
</body>
</html>