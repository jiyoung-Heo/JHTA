<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="test.db.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginOk.jsp</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	application.setAttribute("id", id);
	application.setAttribute("pwd", pwd);
	
	//application스코프에 담긴값 꺼내오기
	String aid = (String)application.getAttribute("id");
	String apwd = (String)application.getAttribute("pwd");
%>
<h1>어플리케이션 스코프에 저장된 값</h1>
아이디: <%=aid %><br>
비밀번호: <%=apwd %><br>
<a href="next.jsp">다음페이지로 이동</a>
</body>
</html>