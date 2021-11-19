<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<ul>
	<li><a href="fortune.do">오늘의운세보기</a>
	<li><a href="weather.do?day=1">오늘의 날씨</a></li>
	<li><a href="weather.do?day=2">내일의 날씨</a></li>
</ul>
<!-- mvc방식을 사용해서 두수 합을 뷰페이지에 출력해보세요. -->
<form method = "post" action="sum.do">
	정수1 <input type="text" name = "num1"><br>
	정수2 <input type="text" name = "num2"><br>
	<input type="submit" value="합 구하기">
</form>

</body>
</html>