<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
<h1>list.jsp</h1>
<ul>
	<li>게시글1</li>
	<li>게시글2</li>
	<li>게시글3</li>
	<li>게시글4</li>
</ul>
<!-- 상대경로로 링크주기 -->
<a href="../main.jsp">main.jsp</a>
<a href="<%=request.getContextPath() %>/main.jsp">main.jsp</a>
</body>
</html>