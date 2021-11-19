<%@page import="home_0506.vo.BoardVo"%>
<%@page import="home_0506.BoardDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>okey.jsp</title>
</head>
<body>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	String writer = request.getParameter("writer");
	String email = request.getParameter("email");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	BoardDAO dao = new BoardDAO();
	BoardVo vo = new BoardVo(num,writer,email,title,content,null);
	if(dao.update(vo)>0){
%>
	<script type="text/javascript">
		alert('수정완료')
		location.href='list.jsp';	
	</script>
<%
	}else{
%>
	<script type="text/javascript">
		alert('수정불가')
		history.back();	
	</script>
<%
	}
%>
</body>
</html>