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
<h1>목록</h1>
<table border="1" width="500">
	<tr>
		<th>글번호</th>
		<th>작성자</th>
		<th>제목</th>
	</tr>
	<c:forEach var="vo" items="${requestScope.list }">
		<tr>
			<td>${vo.num }</td>
			<td>${vo.writer }</td>
			<td>
			<c:if test="${ vo.lev>0}">
				<%--답글인 경우 들여쓰기하기 --%>
				<c:forEach var="i" begin="1" end ="${vo.lev }">
					&nbsp;&nbsp;				
				</c:forEach>
				[re]
			</c:if>
			<a href = "detail?num=${vo.num }">${vo.title }</a></td>
		</tr>
	</c:forEach>
</table>
<!-- 페이징 처리 -->
<div>
	<c:if test="${pageNum>10 }">
		<a href="list?pageNum=${startPageNum-1 }">이전페이지</a>
	</c:if>
	<c:forEach var="i" begin="${startPageNum }" end="${endPageNum }">
		<c:choose>
			<c:when test="${pageNum==i }"><%--현재페이지인경우 --%>
				<a href="list?pageNum=${i }"><span style="color:blue">[${i }]</span></a>
			</c:when>
			<c:otherwise>
				<a href="list?pageNum=${i }"><span style="color:gray">[${i }]</span></a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:if test="${pageCount>endPageNum }">
		<a href="$list?pageNum=${endPageNum+1 }">다음페이지</a>
	</c:if>
</div>
</body>
</html>