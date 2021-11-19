<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
	<h1>main.jsp</h1>
	<ul>
	<!-- 로그아웃기능 구현해보세요 -->
<%
	if(session.getAttribute("id")==null){
%>
	<li><a href="login.jsp">로그인</a></li>
<%
	}else{
%>
	<li><a href="logout.jsp">로그아웃</a></li>
<%		
	}
%>
	</ul>
</body>
</html>