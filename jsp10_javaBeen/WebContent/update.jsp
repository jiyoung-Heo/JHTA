<%@page import="java.sql.Date"%>
<%@page import="test.dao.MembersDAO"%>
<%@page import="test.vo.MembersVo"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UpdateForm.jsp</title>
</head>
<body>
<h1>수정하기</h1>
<table border="1" width="500"></table>
<%
		int num = Integer.parseInt(request.getParameter("num"));
		MembersDAO dao = new MembersDAO();
		MembersVo vo = dao.select(num);
		int num1 = vo.getNum();
		String name = vo.getName();
		String phone = vo.getPhone();
		String addr = vo.getAddr();
		Date regdate = vo.getRegdate();
%>
	<form action="checkedUpdate.jsp" >
	<tr>
		<th>
			<td>회원번호</td>
			<td><input type="text" value="<%=num1%>" name="num1" readonly="readonly"></td>
		</th><br>
		<th>
			<td>이름</td>
			<td><input type="text" value="<%=name%>" name="name"></td>
		</th><br>
		<th>
			<td>전화번호</td>
			<td><input type="text" value="<%=phone%>" name="phone"></td>
		</th><br>
		<th>
			<td>주소</td>
			<td><input type="text" value="<%=addr%>" name="addr"></td>
		</th><br>
		<th>
			<td>가입일</td>
			<td><input type="text" value="<%=regdate%>" readonly="readonly"></td>
		</th><br>
	</tr>
		<input type="submit" value="수정">
	</form>

</body>
</html>