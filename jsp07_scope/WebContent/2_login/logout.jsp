<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout.jsp</title>
</head>
<body>
<%
	//아이디세션 비우기
	//session.removeAttribute("id");
	//세션영역 무효화하기(세션에 담긴 값 모두 비우기)
	session.invalidate();
%>
<script type="text/javascript">
	alert('로그아웃되었습니다.');
	//location.href="main.jsp";
</script>
<%-- 이걸 쓰게 되면 위에꺼는 출력안된다. 
	response.sendRedirect("main.jsp");
--%>
</body>
</html>