<%@page import="test.vo.MembersVo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="test.dao.MembersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinOk.jsp</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8");%>
<jsp:useBean id="vo" class="test.vo.MembersVo"/>
<!-- * 쓰면 한거번에 파라미터로 받은 값을 property값에 setting할 수 있다. -->
<jsp:setProperty property="*" name="vo"/>
<jsp:useBean id="dao" class="test.dao.MembersDAO"/>
<h1>전송된 사용자 정보</h1>
회원번호: <jsp:getProperty property="num" name="vo"/><br>
이름: <jsp:getProperty property="name" name="vo"/><br>
전화번호: <jsp:getProperty property="phone" name="vo"/><br>
주소: <jsp:getProperty property="addr" name="vo"/><br>
<%
	int n = dao.insert(vo);
	if(n>0){
%>
	<h1>회원가입성공</h1>
<%
	}else{
%>
	<h1>회원가입실패</h1>
<%
	}
%>
<a href="main.jsp">메인으로</a>
</body>
</html>