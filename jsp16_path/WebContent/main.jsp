<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<%
	String contextPath = request.getContextPath();//컨텍스트명 얻어오기
%>
<body>

<h1><%=contextPath %></h1>
<!-- 상대경로:내위치기준 -->
<a href="1/join.jsp">회원가입1</a><br>
<!-- 절대경로:contextPath위치부터 -->
<!-- 
<a href=/jsp16_path/1/join.jsp">회원가입</a>
 -->
<a href="<%=contextPath %>/1/join.jsp">회원가입2</a><br>

<!-- servlet 상대경로 -->
<a href="member/join">회원가입3(서블릿 상대경로)</a><br>
<!-- servlet 절대경로 -->
<a href="<%=contextPath %>/member/join">회원가입4(서블릿 절대경로)</a><br>

<a href = "user/join">회원가입5(joinservlet1)</a><br>
<a href = "<%=contextPath%>/user/join">회원가입6(joinservlet1)</a><br>

<a href="<%=contextPath%>/board/list">게시글목록1</a><br>
</body>
</html>

