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
<ul>
<c:choose>
	<%-- 
	empty: 비어있으면~(null)
	<c:when test="${empty sessionScope.id }"></c:when>
	--%>
	<c:when test="${sessionScope.id eq null }">
		<li><a href="login.jsp">로그인</a></li>
	</c:when>
	<c:otherwise>
		<li>${sessionScope.id}님 반갑습니다.<br>
		<a href="logout.jsp">로그아웃</a></li>
	</c:otherwise>
</c:choose>
	<li><a href="join">회원가입</a></li>
	<li><a href="list">회원목록</a></li>
</ul>
</body>
</html>