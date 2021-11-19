<%@page import="home_0506.BoardDAO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
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
	String num = request.getParameter("num");
	BoardDAO dao = new BoardDAO();
	if(dao.delete(num)>0){
%>
	<script type="text/javascript">
		alert('삭제완료!');
		location.href='list.jsp';
	</script>		
<%
	}else{
%>
	<script type="text/javascript">
		alert('삭제불가!');
	</script>
<%
	}
%>
</body>
</html>