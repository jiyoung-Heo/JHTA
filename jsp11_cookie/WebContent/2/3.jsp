<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3.jsp</title>
</head>
<body>
<h1>컴퓨터 상세페이지</h1>
<ul>
	<li>모델명: xxxx</li>
	<li>가격: xxxx</li>
	<li>제조사: 삼성</li>
</ul>
<input type = "button" value="구매"><br>
<%
	Cookie cook= new Cookie("item3","컴퓨터");
	cook.setMaxAge(60*60);// 쿠키유지시간 1시간
	response.addCookie(cook);
%>
<a href="list.jsp">상품등록페이지</a>
</body>
</html>