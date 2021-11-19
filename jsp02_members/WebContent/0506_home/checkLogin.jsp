<%@page import="home_0506.MyusersDao"%>
<%@page import="home_0506.BoardDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkLogin.jsp</title>
</head>
<body>
<%
String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	MyusersDao dao = new MyusersDao();
	if(dao.insertId(id, pwd)){
		session.setAttribute("id", id);
		response.sendRedirect("main.jsp");
	}else{
%>
	<script type="text/javascript">
		alert('로그인 실패. 로그인창으로 되돌아갑니다.');
		history.go(-1);
	</script>
<%
	}
%>
</body>
</html>