<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>4_FOR.jsp</title>
</head>
<body>
<%
	int[] a = {1,1,2,3,4,5};
	ArrayList<String> list = new ArrayList<>();
	list.add("진달래");
	list.add("개나리");
	list.add("무궁화");
	request.setAttribute("a", a);
	session.setAttribute("list", list);
%>
<!-- items속성에는 배열이나 컬랙션 객체가 들어갈 수 있음 -->
<c:forEach var = "n" items="${requestScope.a }">
	<c:out value="${n }"/>
</c:forEach>
<br>
<c:forEach var = "s" items="${sessionScope.list }">
	<c:out value="${s }"/><br>
</c:forEach>
</body>
</html>