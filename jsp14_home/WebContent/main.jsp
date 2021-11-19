<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<h1>메인페이지</h1>
<a href="list">목록</a><br>
<c:choose>
	<c:when test="${sessionScope.id eq null }">
		<a href="login.jsp">로그인</a>
	</c:when>
	<c:otherwise>
		<a href="write.jsp">추가</a>
		${sessionScope.id}님 반갑습니다.
		<a href="logout">로그아웃</a><br>
	</c:otherwise>
</c:choose>
</body>
</html>
</body>
</html>