<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
<h1>게시판</h1>
<a href="${cp }/board/list">전체글목록</a>
<a href="${cp }/home">홈으로</a>
<table border="1" width="500">
	<tr>
		<th>글번호</th>
		<th>작성자</th>
		<th>제목 </th>
	</tr>
	<c:forEach var="vo" items="${list }">
	<tr>
		<th>${vo.num }</th>
		<th>${vo.writer }</th>
		<th>${vo.title }</th>
	</tr>
	</c:forEach>
</table>
<div>
		<c:if test="${startPageNum>10 }">
		<a href="${cp}/board/list?pageNum=${startPageNum-1 }&field=${field}&keyword=${keyword}">[이전]</a> <!-- 현재페이지 보이기 -->
		</c:if>
		
		<c:forEach var="i" begin="${startPageNum }" end="${endPageNum }">
		<c:choose>
			<c:when test="${pageNum==i }">
				<a href="${cp}/board/list?pageNum=${i }&field=${field}&keyword=${keyword}"><span style="color:blue">[${i }]</span></a>
				<!-- <a href="${cp}/board/list?pageNum=${i}" 로 줘도 됨 -->
			</c:when>
			<c:otherwise>
				<a href="${cp}/board/list?pageNum=${i }&field=${field}&keyword=${keyword}"><span style="color:gray">[${i }]</span></a>
			</c:otherwise>
		</c:choose>
		</c:forEach>
		<c:if test="${endPageNum<pageCount }">
			<a href="${cp}/board/list?pageNum=${endPageNum+1 }&field=${field}&keyword=${keyword}">[다음]</a>
		</c:if>
</div>
<div>
	<form method="post" action="${cp }/board/list">
		<select name="field">
			<option value="writer"
				<c:if test="${field=='writer' }">selected="selected"</c:if>
			>작성자</option>
			<option value="title"<c:if test="${field=='title' }">selected="selected"</c:if>>제목</option>
			<option value="content"<c:if test="${field=='content' }">selected="selected"</c:if>>내용</option>
		</select>
		<input type="text" name="keyword">
		<input type="submit" value="검색">
	</form>
</div>
</body>
</html>