<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
<div>
	<jsp:include page="${top }"/> <!-- requestScope.top인데 생략 -->
</div>
<div>
	<jsp:include page="${content }"/>
</div>
</body>
</html>