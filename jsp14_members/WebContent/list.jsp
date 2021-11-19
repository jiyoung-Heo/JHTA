<%@page import="test.vo.MembersVo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="test.dao.MembersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
<h1>전체회원목록</h1>

<table border="1" width="500">
	<tr>
		<th>회원번호</th>
		<th>이름</th>
		<th>전화번호</th>
		<th>주소</th>
		<th>가입일</th>
	</tr>
	<!-- item에 배열을 넣어주면 자동으로 배열을 분리해서 vo에 넣어준다. -->
	<c:forEach var ="vo" items="${requestScope.list }">
		<tr>
			<!-- .num만 해줘도 자동으로 getter메소드가 호출된다. -->
			<td>${vo.num }</td>
			<td>${vo.name }</td>
			<td>${vo.phone }</td>
			<td>${vo.addr }</td>
			<td>${vo.regdate }</td>
			<td><a href="delMember?num=${vo.num }">삭제</a>
			<!-- 회원정보를 수정하기 위한 수정페이지로 이동하기 -->
			<td><a href="update?num=${vo.num }">수정</a>
		</tr>
	</c:forEach>
</table>
<a href="main.jsp">메인...</a>
</body>
</html>