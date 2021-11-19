<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join.jsp</title>
</head>
<body>
<!-- 
	myusers테이블과연동해서회원가입기능을구현해보세요
	기존에사용중인아이디면 span태그에 [사용중인아이디입니다]라고 출력되도록 합니다. 
-->
<!-- 유효성검사 아이디/비밀번호/이메일이 모두 입력되어야 submit될 수 있도록 
코드 추가해보세요 -->
<h1>회원가입</h1>
<form action="joinOk.jsp" method="post" onsubmit="return isNull();">
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String email = request.getParameter("email");
	String errMsg = (String)request.getAttribute("errMsg");
	if(id == null){
		id="";
	}
	if(pwd == null){
		pwd="";
	}
	if(email == null){
		email="";
	}
	if(errMsg == null){
		errMsg="";
	}
%>
	아이디<input type="text" name="id" value="<%=id%>"><br>
	<span style="color:red; font-size:12px"><%=errMsg%></span>
	<br>
	비밀번호<input type="password" name="pwd" value="<%=pwd%>"><br>
	이메일<input type="email" name="email" value="<%=email%>"><br>
	<input type="submit" value="가입">
</form>
</body>
<script type="text/javascript">
	function isNull(){
		var id = document.getElementsByName("id")[0].value;
		var pwd = document.getElementsByName("pwd")[0].value;
		var email = document.getElementsByName("email")[0].value;
		if(id.trim()==""){
			alert('아이디 필수입력사항');
			return false;
		}
		if(pwd.length==0){
			alert('비밀번호 필수입력사항');
			return false;
		}
		if(email.length==0){
			alert('이메일 필수입력사항');
			return false;
		}else{
			return true;
		}
	}
</script>
</html>