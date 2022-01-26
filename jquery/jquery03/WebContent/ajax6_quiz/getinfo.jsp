<%@page import="test.db.DBConnection"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.Date"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String num=request.getParameter("num");
	JSONObject json=new JSONObject();
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try{
		con=DBConnection.getCon();
		String sql="select * from members where num=?";
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1,num);
		rs=pstmt.executeQuery();
		if(rs.next()){
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String addr=rs.getString("addr");
			Date regdate=rs.getDate("regdate");
			json.put("find",true);
			json.put("num",num);
			json.put("name",name);
			json.put("phone",phone);
			json.put("addr",addr);
			json.put("regdate",regdate);
		}else{
			json.put("find",false);
		}
	}catch(SQLException s){
		s.printStackTrace();
	}finally{
		DBConnection.close(con, pstmt, rs);
	}
	response.setContentType("text/plain;charset=utf-8");
	PrintWriter pw=response.getWriter();
	pw.print(json);
	
%>