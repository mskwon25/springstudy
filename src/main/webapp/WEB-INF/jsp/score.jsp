<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html lang="en">
<body>
	<header>
		<table>
			<tr>
				<td>
					<form method="get" action="/">
						<button type="submit">학생</button>
					</form>
				</td>
				<td>
					<form method="get" action="/professor">
						<button type="submit">교수</button>
					</form>
				</td>
				<td>
					<form method="get" action="/subject">
						<button type="submit">과목</button>
					</form>
				</td>
				<td>
					<form method="get" action="/score">
						<button type="submit">성적</button>
					</form>
				</td>
			</tr>
		</table>
	</header>
	
	<form method="get" action="/score/add">
		<input type="number" name="id" placeholder="성적번호"/>
		<input type="number" name="studentId" placeholder="학생번호"/>
		<input type="number" name="subjectId" placeholder="과목번호"/>
		<input type="number" name="score" placeholder="점수"/>
		<button type="submit">등록</button>
	</form>

	<form method="get" action="/score/delete">
		<input type="number" name="id" placeholder="성적번호"/>
		<button type="submit">삭제</button>
	</form>
	
	<form method="get" action="/score/get/stid">
		<input type="number" name="studentId" placeholder="학생번호"/>
		<button type="submit">학생번호로 조회</button>
	</form>
	
	<form method="get" action="/score/get/sjid">
		<input type="number" name="subjectId" placeholder="과목번호"/>
		<button type="submit">과목번호로 조회</button>
	</form>
	
	<table>
		<tr>
			<th>성적번호</th>
			<th>학생번호</th>
			<th>과목번호</th>
			<th>점수</th>
		</tr>
		<c:forEach items="${scores }" var="score">
			<tr>
				<td>${score.id }</td>
				<td>${score.studentId }</td>
				<td>${score.subjectId }</td>
				<td>${score.score }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
