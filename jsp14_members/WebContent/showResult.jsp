<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showResult.jsp</title>
</head>
<body>
<c:choose>
	<c:when test="${requestScope.result=='success' }">
		<h1>요청작업성공~!!</h1>
	</c:when>
	<c:otherwise>
		<h1>요청작업실패...</h1>
	</c:otherwise>
</c:choose>
<a href="main.jsp">메인으로</a>
</body>
</html>