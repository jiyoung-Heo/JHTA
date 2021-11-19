<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<h1>로그인</h1>
<form action="loginOk" method="post">
<label>아이디: <input type="text" name = "id" value="${param.id }"></label>
<label>비밀번호: <input type="password" name = "pwd" value="${param.pwd }"></label>
<div>${requestScope.errMsg }</div>
<input type="submit" value="로그인">
</form>
</body>
</html>