<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete.jsp</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	Cookie cookid = new Cookie("id",id);
	Cookie cookpwd = new Cookie("pwd",pwd);
	cookid.setMaxAge(0);
	cookpwd.setMaxAge(0);
	response.addCookie(cookid);
	response.addCookie(cookpwd);
	response.sendRedirect("login.jsp");
%>
</body>
</html>