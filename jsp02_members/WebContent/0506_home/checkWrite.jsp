<%@page import="home_0506.BoardDAO"%>
<%@page import="home_0506.vo.BoardVo"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write.jsp</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String writer = request.getParameter("writer");
	String email = request.getParameter("email");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	BoardVo vo = new BoardVo(writer,email,title,content);
	BoardDAO dao = new BoardDAO();
	int n = dao.insertList(vo);
	
	if (n>0){
%>
	<script type="text/javascript">
		alert('등록완료');
		location.href="list.jsp";
	</script>
<%
	}else{
%>
	<script type="text/javascript">
		alert('등록불가');
	</script>
<%
	}
%>
</body>
</html>
