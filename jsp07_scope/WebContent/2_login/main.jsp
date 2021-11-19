<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<h1>메인페이지...</h1>
<ul>
<!-- 로그인한상태이면 로그아웃이 보이고 로그인한상태면 회원로그인이 보이도록 해보세요 -->
<%
	if(session.getAttribute("id")==null){//로그인안한상태
%>
		<li><a href="login.jsp"  id ="login">회원로그인</a></li>
<%	
	}else{
%>
		<li><a href="logout.jsp"  id="logout">로그아웃</a></li>
<%
	}
%>
	<li><a href="list.jsp">회원목록</a></li>
</ul>
</body>
</html>