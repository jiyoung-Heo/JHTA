<%@page import="java.util.ArrayList"%>
<%@page import="home_0506.vo.BoardVo"%>
<%@page import="home_0506.BoardDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>SONG's GUESTBOOK 목록</h1>
<%
	if(session.getAttribute("id")==null){
		
	}else{
%>
	<a href="write.jsp" style="margin:130px">글쓰기</a>
<%		
	}
%>
	<table border="1" bordercolor="#00FF00" style="margin-top:20px">
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>이메일</th>
			<th>글제목</th>
			<th>날짜</th>
		</tr>
<%
	BoardDAO dao = new BoardDAO();
	ArrayList<BoardVo> arrList = dao.list();
	for(BoardVo vo : arrList){
%>
		<tr>
			<td><%=vo.getNum() %></td>
			<td><%=vo.getWriter() %></td>
			<td><%=vo.getEmail() %></td>
			<td><a href="detail.jsp?num=<%=vo.getNum() %>"><%=vo.getTitle() %></td>
			<td><%=vo.getW_date() %></td>
		</tr>
<%
	}
%>
	</table>
</body>
</html>