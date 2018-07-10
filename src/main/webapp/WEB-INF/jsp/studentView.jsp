<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<body>
student_id = ${student.student_id } <br />
student_name = ${student.student_name } <br />
student_birthday = ${student.student_birthday } <br />

<form action="student" method="get">
	student_id : <input type="text" name="id"> <br />
	<input type= "submit" value="전송">
</form>
<!--  http://localhost:8080/student?student_id=57&student_name=진현&student_birthday=19910527 예제 -->
</body>
</html>