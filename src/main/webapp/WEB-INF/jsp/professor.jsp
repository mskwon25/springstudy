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
	
	<form method="get" action="/professor/add">
		<input type="number" name="id" placeholder="교수번호"/>
		<input type="text" name="name" placeholder="이름"/>
		<input type="text" name="dateOfBirth" placeholder="생년월일"/>
		<input type="text" name="nameOfSubject" placeholder="과목이름"/>
		<button type="submit">등록</button>
	</form>

	<form method="get" action="/professor/delete">
		<input type="number" name="id" placeholder="교수번호"/>
		<button type="submit">삭제</button>
	</form>
	
	<form method="get" action="/professor/get">
		<input type="number" name="id" placeholder="교수번호"/>
		<button type="submit">조회</button>
	</form>
	
	<table>
		<tr>
			<th>교수번호</th>
			<th>이름</th>
			<th>생년월일</th>
			<th>과목이름</th>
		</tr>
		<c:choose>
		<c:when test="${professors ne null}">
			<c:forEach items="${professors }" var="professor">
				<tr>
					<td>${professor.id }</td>
					<td>${professor.name }</td>
					<td>${professor.dateOfBirth }</td>
					<td>${professor.nameOfSubject }</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<tr>
					<td>${professor.id }</td>
					<td>${professor.name }</td>
					<td>${professor.dateOfBirth }</td>
					<td>${professor.nameOfSubject }</td>
				</tr>
		</c:otherwise>
		</c:choose>
	</table>
</body>
</html>
