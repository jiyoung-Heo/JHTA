<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join.html</title>
</head>
<body>
<h1>회원가입</h1>
<form method="post" action="join.jsp">
	회원번호<input type="text" name="num"><br>
	이름<input type="text" name="name"><br>
	전화번호<input type="text" name="phone"><br>
	주소<input type="text" name="addr"><br>
	<input type="submit" value="가입">
</form>
<br>
<!-- 상대경로 -->
<a href="../main.jsp">메인으로</a>
<!-- 절대경로 -->
<%
	String context = request.getContextPath();
%>
<a href="<%=context %>/main.jsp">메인으로</a>

<a href="../user/join">조인서블릿상대경로</a>
<a href="<%=context %>/user/join">조인서블릿절대경로</a>
</body>
</html>