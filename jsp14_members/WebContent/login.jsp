<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<h1>회원로그인</h1>
<form method = "post" action="login">
	아이디<input type="text" name = "id" value = "${param.id }"><br>
	비밀번호<input type="password" name = "pwd" value = "${param.pwd }"><br>
	<div>${requestScope.errMsg }</div>
	<input type="submit" value="로그인"> 
</form>
</body>
</html>