<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file1/insert.jsp</title>
</head>
<body>
<h1>파일수정하기</h1>

<form method="post" action="${pageContext.request.contextPath }/file/update" enctype="multipart/form-data">
	<input type="hidden" name="filenum" value="${vo.filenum }">
	작성자<br>
	<input type="text" name="writer" value="${vo.writer }"><br>
	제목<br>
	<input type="text" name="title" value="${vo.title}"><br>
	내용<br>
	<textarea rows="5" cols="50" name="content">${vo.content }</textarea><br>
	첨부파일 [기존파일명 ${vo.orgfilename }] <br> 
	<input type="file" name="file1" ><br>
	<input type="submit" value="전송">
</form>
</body>
</html>