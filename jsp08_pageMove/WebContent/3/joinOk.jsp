<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinOk.jsp</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String email = request.getParameter("email");
		try{
			Class.forName("oracle.jdbc.OracleDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = "select id from myusers where id = ?";
		String sqlInsert = "insert into myusers values(?,?,?)";
		try(Connection con = DriverManager.getConnection(url,"scott","tiger");
		PreparedStatement pstmt = con.prepareStatement(sql);
				PreparedStatement pstmtInsert = con.prepareStatement(sqlInsert);){
			pstmt.setString(1, id);
			try(ResultSet rs = pstmt.executeQuery();){
				if(rs.next()){
					request.setAttribute("errMsg","존재하는아이디입니다.");
					pageContext.forward("join.jsp");
				}else{
					pstmtInsert.setString(1, id);
					pstmtInsert.setString(2, pwd);
					pstmtInsert.setString(3, email);
					int n = pstmtInsert.executeUpdate();
					pageContext.forward("next.jsp");
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
%>
</body>
</html>