<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginOk.jsp</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	try{
		Class.forName("oracle.jdbc.OracleDriver");
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String sql = "select id from myusers where id = ? and pwd = ?";
	try(Connection con = DriverManager.getConnection(url,"scott","tiger");
		PreparedStatement pstmt = con.prepareStatement(sql);){
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		try(ResultSet rs = pstmt.executeQuery();){
			if(rs.next()){
				session.setAttribute("id", id);
				pageContext.forward("layout.jsp?spage=home.jsp");
			}else{
				request.setAttribute("errMsg", "아이디, 비밀번호가 맞지 않아요");
				pageContext.forward("layout.jsp?spage=login.jsp");
			}
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
%>
</body>
</html>