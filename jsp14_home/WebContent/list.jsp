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
	<h1>SONG's GUESTBOOK 목록</h1>
	<c:choose>
		<c:when test="${sessionScope.id ne null}">
			<a href="write.jsp" style="margin:130px">글쓰기</a>
		</c:when>
	</c:choose>
	<table border="1" bordercolor="#00FF00" style="margin-top:20px">
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>이메일</th>
			<th>글제목</th>
			<th>날짜</th>
		</tr>
		<c:forEach var = "vo" items="${requestScope.list }">
				<tr>
					<td>${vo.num}</td>
					<td>${vo.writer }</td>
					<td>${vo.email }</td>
					<td><a href="detail?num=${vo.num }">${vo.title }</a></td>
					<td>${vo.w_date }</td>
				</tr>
		</c:forEach>
	</table>
</body>
</html>