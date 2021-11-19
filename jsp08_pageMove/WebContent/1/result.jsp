<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result.jsp</title>
</head>
<body>
<h1>결과</h1>
<%
	String id = (String)request.getAttribute("id");
	String pwd = (String)request.getAttribute("pwd");
%>
<h2>requestScope에 저장된 값</h2>
id: <%=id %><br>
pwd: <%=pwd %><br>
</body>
</html>