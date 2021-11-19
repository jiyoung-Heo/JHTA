<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>layout.jsp</title>
<style>
	*{margin:0px;padding:0px;}
	#wrap{width:1000px; height: 1000px}
	#header{width:100%;height:20%; background-color: orange;}
	#header div{padding:50px;}
	#content{width:100%;height:70%; background-color: pink;}
	#footer{width:100%;height:10%; background-color: yellow;}
</style>
<%
	String spage = request.getParameter("spage");
	if(spage==null){
		spage= "home.jsp";
	}
%>
</head>
<body>
<div id = "wrap">
<div id="header">
	<jsp:include page="header.jsp"/>
</div>
<div id="content">
	<jsp:include page="<%=spage%>"/>
</div>
<div id="footer">
	<jsp:include page="footer.jsp"/>
</div>
</div>

</body>
</html>