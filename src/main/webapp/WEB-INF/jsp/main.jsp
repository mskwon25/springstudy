<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<p> Jinhyun's 학생부 웹사이트  main </p>
	<table>
		<tr> 메뉴선택
			<td>
				<form method="get" action="/studentView">
				<button type="submit">학생</button>
			</form>
			</td>
			<td>
				<form method="get" action="/professorView">
				<button type="submit">교수</button>
			</form>
			</td>
		</tr>
		</tr>
			<td>
				<form method="get" action="/subjectView">
				<button type="submit">과목</button>
			</form>
			</td>
			<td>
				<form method="get" action="/gradeView">
				<button type="submit">성적</button>
			</form>
            </td>
         </tr>
	</table>       
</body>
</html>