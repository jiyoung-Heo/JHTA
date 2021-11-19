<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edu.jsp</title>
</head>
<body>
<div>
	<div class="header">
		<!-- jsp: action태그 정의 , 네ㅐ용 더 찾아보기 -->
		<jsp:include page="header.jsp"/>
	</div>
	<div class="content">
		<h1>교육과정을 소개합니다.</h1>
		<p>웹 개발자 양성교육</p>
		<ol>
			<li>자바프로그래밍</li>
			<li>서블릿/jsp</li>
			<li>스프링 프레임워크</li>
		</ol>
		<img src = "../images/3.png">
	</div>
	<div class="footer">
		<jsp:include page="footer.jsp"/>
	</div>
</div>
</body>
</html>