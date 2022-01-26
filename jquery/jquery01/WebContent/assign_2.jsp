<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>assign_2.jsp</title>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		$("#book").click(function(){
			$("#box").text("도서상품은...");
		})
		$("#film").click(function(){
			$("#box").text("영화상품은...");
		})
		$("#music").click(function(){
			$("#box").text("음악상품은...");
		})
	})
</script>
</head>
<body>
<span id="book" style="width:100px; height:30px; color:white; background-color:green; border:gray">도서</span>
<span id="film"  style="width:100px; height:30px; color:white; background-color:green; border:gray">영화</span>
<span id="music"  style="width:100px; height:30px; color:white; background-color:green; border:gray">음악</span>
<div id="box" style="width:300px; height:300px; background-color:orange;"></div>
</body>
</html>