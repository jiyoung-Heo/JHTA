<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2_jstl.jsp</title>
</head>
<body>
<c:set var ="name" value="홍길동"/><br>
이름: <c:out value = "${name }"/><br>
<c:set var = "id" value="${param.id }"/>
<%--
	<c:if test="${조건절}">
		조건이 참일때 수행할 문장
	</c:if>
	
	if else는 없다.!
	choose구문 존재.
 --%>


<c:if test = "${id=='admin' }">
	당신은 관리자이군요!<br>
</c:if>
<c:if test = "${id!='admin' }">
	당신은 일반사용자이군요!<br>
</c:if>
<%-- http://localhost:8081/jsp12_jstl/2_jstl.jsp?id=admin --%>
<c:set var="grade" value="GOLD"/>
<!-- 선택조건이 여러개인 경우 -->
<c:choose>
	<c:when test="${grade=='GOLD' }">
		당신의 등급은 [GOLD]입니다.
	</c:when>
	<c:when test="${grade=='SILVER' }">
		당신의 등급은 [SILVER]입니다.
	</c:when>
	<c:otherwise>
		당신의 등급은 [일반회원]입니다.
	</c:otherwise>
</c:choose>
<br>
<!-- result.jsp에서 num1이 짝수인지 홀수인지 판별해보세요(jstl사용) -->
<form method = "post" action="result.jsp">
	정수입력<input type="text" name = "num1">
	<input type="submit" value="판별">
</form>
</body>
</html>