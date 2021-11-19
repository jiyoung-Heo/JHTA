<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file1/list.jsp</title>
</head>
<body>
<img src = "${pageContext.request.contextPath }/images/1.png">
<h1>파일목록</h1>

<table border="1" width="500">
	<tr>
		<th>파일번호</th>
		<th>작성자</th>
		<th>제목</th>
		<th>파일명</th>
		<th>파일크기</th>	
		<th>삭제</th>
		<th>수정</th>
		<th>다운로드</th>
		<th>이미지</th>
	</tr>
	<c:forEach var="vo" items="${list }">
		<tr>
			<td>${vo.filenum }</td>
			<td>${vo.writer }</td>
			<td>${vo.title }</td>
			<td>${vo.orgfilename }</td>
			<td>${vo.filesize } bytes</td>
			<!-- 클라이언트브라우저에서는 상대경로 사용함. 절대경로 사용못한다. -->
			<td><a href="${pageContext.request.contextPath }/file/delete?filenum=${vo.filenum}">삭제</a></td>
			<td><a href="${pageContext.request.contextPath }/file/update?filenum=${vo.filenum}">수정</a></td>
			<td><a href="${pageContext.request.contextPath }/file/download?filenum=${vo.filenum}">다운</a></td>
			<td><img src = "${pageContext.request.contextPath }/upload/${vo.savefilename}" width="100" height="100"></td>
		</tr>
	</c:forEach>
</table>
<br>
<a href="${pageContext.request.contextPath }/file1/main.jsp">홈</a>
</body>
</html>








