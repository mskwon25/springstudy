<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Grade List</title>
</head>
<body>
<%@ include file="common.jsp" %>
<div class="container">
	<input type="submit" value="데이터삽입" class="btn btn-primary" onclick="location.href='/insertGradeForm'">
</div>
<div class="container">
    <table class="table table-hover">
        <tr>
            <th>Student Id</th>
            <th>Subject Id</th>
            <th>Score</th>
            <th>삭제</th>
        </tr>
        <c:forEach var="l" items="${list}">
            <tr>
                <td>${l.student_id}</td>
                <td>${l.subject_id}</td>
                <td>${l.score}</td>
                <td><button class="btn btn-warning" onclick="location.href='/deleteGrade/${l.student_id}/${l.subject_id}'">삭제</button></td>
            </tr>
        </c:forEach>
          
    </table>
</div>

</body>
</html>


