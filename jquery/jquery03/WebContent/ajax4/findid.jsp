<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 	//http://localhost:8081/ajax01/2/findid.jsp?email=test@
	//findid.jsp
	String email=request.getParameter("email");
	String id=null;
	if(email!=null && email.equals("test@")){
		id="abcd***";
%>
	<h1>아이디 : <%=id %></h1>
<%		
	}else{
%>
	<h1>조회된 정보가 없습니다.</h1>
<%		
	}
%>
<img src="../images/1.png">