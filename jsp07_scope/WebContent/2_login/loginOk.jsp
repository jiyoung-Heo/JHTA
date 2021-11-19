<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="test.db.DBConnection"%>
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
	//입력된아이디와 비밀번호 읽어오기
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//입력된정보가 db에 존재하는지 검사하기
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	con = DBConnection.getCon();
	
	try{
	String sql = "select * from myusers where id=? and pwd=?";
    pstmt=con.prepareStatement(sql);
	pstmt.setString(1, id);
    pstmt.setString(2, pwd);
	rs = pstmt.executeQuery();
		if(rs.next()){
			//존재하면세션에 아이디담기
			session.setAttribute("id",id);
			response.sendRedirect("main.jsp");
		}else{
			//존재하지않으면 로그인페이지로 이동하기
%>
			<script type="text/javascript">
				alert('아이디 또는 비밀번호가 맞지 않습니다.');
				//이전페이지로 이동
				history.go(-1);
			</script>
<%
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		 DBConnection.close(con, pstmt, rs);
	}
%>
</body>
</html>