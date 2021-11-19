<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3_jstl_FOR.jpg</title>
</head>
<body>
<%--
<c:forEach var = "변수명" begin="초기값" end="마지막값" step="증감값">
	반복실행문장
</c:forEach>
 --%>
<h1>1부터 100까지 출력</h1>
<c:forEach var = "i" begin="1" end="100"><%--step속성이 생략되면 1씩 증가 --%>
	<c:out value="${i }"/> &nbsp;
</c:forEach>
<h1>1부터 100까지의 홀수합구하기</h1>
<c:forEach var="i" begin="1" end ="100" step="2">
	<%-- jstl에서는 동일한 이름의 변수를 set으로 선언하면 기존의 변수값이 수정됨 --%>
	<c:set var ="sum" value= "${sum+i }"/>
</c:forEach>
1부터 100까지의 합: <c:out value="${sum}"></c:out>
<br>
<%--구구단 출력해보세요 --%>
구구단<br>
<c:forEach var="i" begin="2" end="9">
	<c:set var="dan" value="${i }"/>
	<c:out value="${dan }"/>단
	<c:forEach var = "j" begin="1" end="9">
		<c:set var="detail" value="${i }*${j }=${i*j }"/>
		<c:out value="${detail }"/>&nbsp;
	</c:forEach><br>
</c:forEach>
</body>  
</html>