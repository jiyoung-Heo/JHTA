<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>next.jsp</title>
</head>
<body>
<%
	//세션에 저장된값 꺼내오기
	//리턴타입 Object이기 때문에 형변환 해줘야한다.
	String sid = (String)session.getAttribute("id");
	String spwd = (String)session.getAttribute("pwd");
%>
<h1>세션에 저장된 정보</h1>
아이디: <%=sid %><br>
비밀번호: <%=spwd %><br>
</body>
</html>