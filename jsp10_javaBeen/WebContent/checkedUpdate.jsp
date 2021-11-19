<%@page import="test.dao.MembersDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="test.vo.MembersVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		int num =Integer.parseInt(request.getParameter("num1"));
		String name =request.getParameter("name");
		String phone =request.getParameter("phone");
		String addr =request.getParameter("addr");
		MembersVo vo = new MembersVo();
		vo.setNum(num);
		vo.setName(name);
		vo.setPhone(phone);
		vo.setAddr(addr);
		MembersDAO dao = new MembersDAO();
		int n = dao.update(vo);
		if(n>0){
			response.sendRedirect("list.jsp");
		}else{
%>
			<h1>수정불가</h1>
<%			
		}
%>
</body>
</html>