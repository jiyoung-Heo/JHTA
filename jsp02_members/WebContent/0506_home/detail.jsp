<%@page import="home_0506.vo.BoardVo"%>
<%@page import="home_0506.BoardDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail.jsp</title>
</head>
<body>
<%
	String num = request.getParameter("num");
	BoardDAO dao = new BoardDAO();
	BoardVo vo = dao.selectList(Integer.parseInt(num));
%>
				<h1>SONG's GUESTBOOK 내용</h1>
				<table border="1" bordercolor="#00FF00">
					<tr>
						<th>글번호</th>
						<td><%=vo.getNum() %></td>
					</tr>
					<tr>
						<th>글쓴이</th>
						<td><%=vo.getWriter() %></td>
					</tr>
					<tr>
						<th>email</th>
						<td><%=vo.getEmail() %></td>
					</tr>
					<tr>
						<th>title</th>
						<td><%=vo.getTitle() %></td>
					</tr>
					<tr>
						<th>content</th>
						<td><%=vo.getContent() %></td>
					</tr>
				</table>
	<a href="delete.jsp?num=<%=num %>">삭제</a>
	<a href="update.jsp?num=<%=num %>">수정</a>
	<a href="list.jsp">목록</a>
	<a href="main.jsp">메인으로</a>
</body>
</html>
