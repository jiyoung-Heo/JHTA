<%@page import="home_0506.vo.BoardVo"%>
<%@page import="home_0506.BoardDAO"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update.jsp</title>
</head>
<body>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	BoardDAO dao = new BoardDAO();
	BoardVo vo = dao.selectList(num);
%>
			<form action="okey.jsp">
				<h1>SONG's GUESTBOOK 수정</h1>
				<table border="1" bordercolor="#00FF00">
					<!-- hidden: 사용자 화면에서 안보이지만 서버로 전송됨 -->
					<input type="hidden" name="num" value="<%=vo.getNum() %>">
					<tr>
						<th>회원번호</th>
						<!-- disabled="disabled"속성이 설정되면 서버로 전송이 안된다. -->
						<td><input type="text" name="num" value="<%=vo.getNum() %>" disabled="disabled"></td>
					</tr>
					<tr>
						<th>글쓴이</th>
						<td><input type="text" name="writer" value="<%=vo.getWriter() %>"></td>
					</tr>
					<tr>
						<th>email</th>
						<td><input type="text" name="email" value="<%=vo.getEmail()%>"></td>
					</tr>
					<tr>
						<th>title</th>
						<td><input type="text" name="title" value="<%=vo.getTitle() %>"></td>
					</tr>
					<tr>
						<th>content</th>
						<td><input type="text" name="content" value="<%=vo.getContent() %>"></td>
					</tr>
					<tr>
						<th>가입일</th>
						<td><input type="text" value=<%=vo.getW_date() %> readonly="readonly" ></td>
					</tr>
				</table>
				<input type="submit" value="수정">
			
			</form>
</body>
</html>