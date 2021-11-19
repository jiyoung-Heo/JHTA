<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<h1>메인페이지</h1>
<a href="list.jsp">목록</a>
<%
	if(session.getAttribute("id")==null){
%>
		<a href="login.jsp">로그인</a>
		
<%
	}else{
%>
		<a href="write.jsp">추가</a>
		<a href="logout.jsp">로그아웃</a>
<%
	}
%>
</body>
</html>
</body>
</html>