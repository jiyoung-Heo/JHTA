<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete.jsp</title>
</head>
<body>
<%
	String num = request.getParameter("num");
	//num에 해당하는 회원을 삭제하고 [삭제성공][삭제실패] 메시지가 출력되도록 해보세요
	Connection con = null;
	PreparedStatement pstmt= null;
	int a= 0;
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(url,"scott","tiger");
		String sql = "delete from members where num = ?";
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1, num);
		a = pstmt.executeUpdate();
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		try{
			if(pstmt!=null)pstmt.close();
			if(con!=null) con.close();
		}catch(SQLException ex){
			ex.printStackTrace();
		}
	}
	if (a>0){
%>
	<script type="text/javascript">
		alert('삭제완료!');
		location.href="list.jsp";
	</script>
<%		
	}else{
%>
	<h1>[삭제실패]</h1>
<%
	}
%>
</body>
</html>