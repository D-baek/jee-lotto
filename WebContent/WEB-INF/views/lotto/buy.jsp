<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또 프로그램</title>
</head>
<body>
<div>
	<form id = "Lotto" action="<%=request.getContextPath() %>/lotto.do">
	입금액 : <input type="text"  value="1000"/>
	<input type="submit"  value = "로또 번호 생성"/>
	</form>
</div>

</body>
</html>