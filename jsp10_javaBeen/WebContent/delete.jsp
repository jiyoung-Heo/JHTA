<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete.jsp</title>
</head>
<body>
<jsp:useBean id="dao" class="test.dao.MembersDAO"/>
<%--
	<jsp:useBen id = "vo" class="test.vo.MembersVo"/>
	<jsp:setProperty property = "num" name="vo"/>
	MemberDAO dao = new MembersDou();
	int n = dao.delete(vo.getNum());
 --%>
<%
	String del = request.getParameter("num");
	int num = Integer.parseInt(del);
	int n = dao.delete(num);
	if(n>0){
		//포워드불가. 포워드써서 list.jsp로 넘어가면 delete.jsp에서 url안바뀐상태이고 새로고침하면 오류나니까.
		//DML작업할때는 sendRedirect사용하는게 좋음.
		response.sendRedirect("list.jsp");
	}else{
%>
	<h1>삭제불가</h1>
<% 	
	}
%>
</body>
</html>