<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="/professorView/add">
		<input type="number" name="prof_num" placeholder="������ȣ"/>
		<input type="text" name="prof_name" placeholder="�̸�"/>
		<input type="text" name="prof_sub" placeholder="�����̸�"/>
		<input type="text" name="prof_birthday" placeholder="�������"/>
		<button type="submit">���</button>
	</form>
</body>
</html>