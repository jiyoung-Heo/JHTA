<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function solution(n) {
    var answer = -1;
    let array = [];
    for(let i=1; i<=n; i++){
        array.push(i);
    }
    var str=array.join('');
    var arr=[];
    arr = str.split("");
    for(let i=1; i<=n; i++){
        answer=arr[i+1];
    }
    return answer;
}
</script>
</head>
<body>
document.write(solution(15))
</body>
</html>