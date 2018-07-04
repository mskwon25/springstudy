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
	
	<form method="get" action="/subject/add">
		<input type="number" name="id" placeholder="과목번호"/>
		<input type="text" name="name" placeholder="이름"/>
		<button type="submit">등록</button>
	</form>

	<form method="get" action="/subject/delete">
		<input type="number" name="id" placeholder="과목번호"/>
		<button type="submit">삭제</button>
	</form>
	
	<form method="get" action="/subject/get">
		<input type="number" name="id" placeholder="과목번호"/>
		<button type="submit">조회</button>
	</form>
	
	<table>
		<tr>
			<th>과목번호</th>
			<th>이름</th>
		</tr>
		<c:choose>
		<c:when test="${subjects ne null}">
			<c:forEach items="${subjects }" var="subject">
				<tr>
					<td>${subject.id }</td>
					<td>${subject.name }</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<tr>
					<td>${subject.id }</td>
					<td>${subject.name }</td>
				</tr>
		</c:otherwise>
		</c:choose>
	</table>
</body>
</html>
