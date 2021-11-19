<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delCookie.jsp</title>
</head>
<body>
<%
	Cookie cook1 = new Cookie("id","");
	cook1.setMaxAge(0);//유지시간을 0으로 지정-쿠키삭제
	response.addCookie(cook1);
%>
<h1>쿠키 삭제 완료!</h1>
<a href="getCookie.jsp">쿠키보러가기</a>
</body>
</html>