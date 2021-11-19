<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file1/main.jsp</title>
</head>
<body>
<ul>
	<li><a href="${pageContext.request.contextPath }/file1/insert.jsp">파일업로드</a></li>
	<!-- list.jsp에서 파일목록이 출력되도록 해보세요.
	파일번호,제목,작성자,전송된 파일명,파일크기 출력
	 -->
	<li><a href="${pageContext.request.contextPath }/file/list">파일목록</a></li>
</ul>
</body>
</html>