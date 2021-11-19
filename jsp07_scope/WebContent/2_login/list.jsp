<%@page import="javax.websocket.SendResult"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
<%
	if(session.getAttribute("id")==null){
		//로그인안한사용자는 로그인페이지로 이동할 수 있도록 해보세요
		response.sendRedirect("login.jsp");
	}else{
		//로그인한 사용자만 볼 수 있도록 해보세요
%>
	<table border="1">
		<th>회원번호</th>
		<th>이름</th>
		<th>전화번호</th>
		<th>주소</th>
		<th>가입일</th>
		<th>삭제</th>
		<th>상세보기</th>
<%
		Connection con = null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url,"scott","tiger");
			String sql = "select * from members";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String addr = rs.getString("addr");
				Date regdate = rs.getDate("regdate");
%>
			<tr>
				<td><%=num %></td>
				<td><%=name %></td>
				<td><%=phone %></td>
				<td><%=addr %></td>
				<td><%=regdate %></td>
				<td><a href="delete.jsp?num=<%=num %>">삭제</td>
				<!-- 상세보기를 누르면 회원의 모든 정보가 보여지도록  detail.jsp를 만들어보세요. -->
				<td><a href="detail.jsp?num=<%=num %>">상세보기</td>
			</tr>
<%
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
%>
		</table>
<%
	}
%>
	
</body>
</html>