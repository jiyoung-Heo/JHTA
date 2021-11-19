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
	String id = (String)application.getAttribute("id");
	String pwd = (String)application.getAttribute("pwd");
%>
<h1>next.jsp......</h1>

<h1>어플리케이션스코프에 저장된값</h1>
아이디:<%=id %>
비밀번호:<%=pwd %>
</body>
</html>