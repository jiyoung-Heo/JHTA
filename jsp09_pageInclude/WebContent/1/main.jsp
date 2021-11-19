<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<div>
	<div class="header">
		<!-- jsp: action태그 정의 , 네ㅐ용 더 찾아보기 -->
		<jsp:include page="header.jsp"/>
	</div>
	<div class="content">
		<h1>우리학원을 소개합니다.</h1>
		<p>좋은 학원입니다...</p>
		<img src = "../images/2.png">
	</div>
	<div class="footer">
		<jsp:include page="footer.jsp"/>
	</div>
</div>
</body>
</html>