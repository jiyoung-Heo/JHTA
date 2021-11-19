<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<ul>
	<li><a href="join.html">회원가입</a></li>
	<li><a href="list.do">회원목록</a></li>
</ul>
<!-- 
회원이름을 파라미터로 전송받아 회원을 조회하는 서블릿을 만들고 해당 기능을 실행해보세요
이름은 like연산자를 사용합니다. 
-->
<form method="post" action="find.do">
	조회할 회원이름:<input type="text" name = "name"><br>
	<input type="submit" value="조회">
</form>
</body>
</html>