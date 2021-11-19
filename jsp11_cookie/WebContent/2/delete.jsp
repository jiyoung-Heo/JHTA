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
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("id");
	Cookie cook = new Cookie(name,"");
	cook.setMaxAge(0);
	response.addCookie(cook);
	response.sendRedirect("list.jsp");
%>
</body>
</html>