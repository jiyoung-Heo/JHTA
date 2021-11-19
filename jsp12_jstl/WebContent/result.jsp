<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result.jsp</title>
</head>
<body>
<c:set var ="num1" value="${param.num1 }"/><br>
<c:if test="${param.num1 mod 2==0 }">
	${param.num1 }은 짝수입니다.
</c:if>
<c:otherwise >
	${param.num1 }은 홀수입니다.
</c:otherwise>
</body>
</html>