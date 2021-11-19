<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.SQLDataException"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join.jsp</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	//1. 전송된 사용자 정보 얻어오기
	String num = request.getParameter("num");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String addr = request.getParameter("addr");
	
	//2. 전송된 사용자 정보를 db에 저장하기
	Connection con = null;
	PreparedStatement pstmt=null;
	int n = 0;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(url,"scott","tiger");
		String sql = "insert into members values(?,?,?,?,sysdate)";
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1, num);
		pstmt.setString(2, name);
		pstmt.setString(3, phone);
		pstmt.setString(4, addr);
		n = pstmt.executeUpdate();
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException ea){
		ea.printStackTrace();
	}finally{
		try{
			if(pstmt!=null)pstmt.close();
			if(con!=null) con.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	
	//3. 결과 응답하기
	if(n>0){
%>
		<script type="text/javascript">
			alert('회원가입완료!');
			location.href="main.html";
		</script>
<% 
	}else{
%>
		<h1>오류로 인해 회원가입 실패!</h1>
<%
	}
%>
</body>
</html>