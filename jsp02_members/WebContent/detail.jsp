<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
	Connection con = null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(url,"scott","tiger");
		String sql = "select * from members where num =?";
		pstmt=con.prepareStatement(sql);
		//String으로 해도 상관없다. 어짜피 select에서 string으로 읽어가기때문에.
		pstmt.setInt(1, Integer.parseInt(num));
		rs=pstmt.executeQuery();
		if(rs.next()){
			int num1= rs.getInt("num");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String addr = rs.getString("addr");
			Date regdate = rs.getDate("regdate");
%>
			<table border="1">
				<tr>
					<th>회원번호</th>
						<td><%=num1 %></td>
				</tr>
				<tr>
					<th>회원이름</th>
						<td><%=name %></td>
				</tr>
				<tr>
					<th>전화번호</th>
						<td><%=phone %></td>
				</tr>
				<tr>
					<th>주소</th>
						<td><%=addr %></td>
				</tr>
				<tr>
					<th>가입일</th>
						<td><%=regdate %></td>
				</tr>
			</table>
<%
		}
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!=null) rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null) con.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
%>
	<a href="list.jsp">뒤로가기</a>
	<a href="main.html">메인으로</a>
</body>
</html>