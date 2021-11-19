<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<h1>로그인</h1>
<form action="checkLogin.jsp">
<label>아이디: <input type="text" name = "id"></label>
<label>비밀번호: <input type="password" name = "pwd"></label>
<input type="submit" value="로그인">
</form>
</body>
</html>