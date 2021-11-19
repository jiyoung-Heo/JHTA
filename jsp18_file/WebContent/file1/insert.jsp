<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file1/insert.jsp</title>
</head>
<body>
<h1>파일업로드하기</h1>
<!-- 
파일을 업로드할때는  
1. enctype="multipart/form-data" 지정
2. method="post" 로 지정
 -->
<form method="post" action="${pageContext.request.contextPath }/file/upload" enctype="multipart/form-data">
	작성자<br>
	<input type="text" name="writer" ><br>
	제목<br>
	<input type="text" name="title"><br>
	내용<br>
	<textarea rows="5" cols="50" name="content"></textarea><br>
	첨부파일<br>
	<input type="file" name="file1" ><br>
	<input type="submit" value="전송">
</form>
</body>
</html>