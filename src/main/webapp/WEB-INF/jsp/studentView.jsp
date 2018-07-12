<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
        
<!--  c:foreach등 jstl 라이브러리관련 사용할때 붙임 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html lang="en">
<body>
<h3> 전체 학생 목록 </h3>
	<table width="300" cellpadding="0" cellspacing="0" border="1" >
		<tr>
			<th>학생번호</th>
			<th>학생이름</th>
			<th>학생생일</th>
		</tr>
		
		<!--  if,else문 -->
		<c:choose>
		<c:when test="${studentList ne null}">
			<c:forEach items="${studentList}" var="student">
				<tr>
					<td>${student.student_id }</td>
					<td>${student.student_name }</td>
					<td>${student.student_birthday }</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			studentList가 NULL입니다.
		</c:otherwise>
		</c:choose>
		
	</table>
	
	<form method="post" action="/studentView/add">
		<input type="number" name="student_id" placeholder="학생번호"/>
		<input type="text" name="student_name" placeholder="이름"/>
		<input type="text" name="student_birthday" placeholder="생년월일"/>
		<button type="submit">등록</button>
	</form>
	
	<form method="post" action="/studentView/deleteById">
	<input type="number" name="student_id" placeholder="삭제하고싶은 학생번호를 쓰세요."/>
	<button type="submit">삭제</button>
	</form>
	
	<form method="get" action="/studentView/getById">
	<input type="number" name="student_id" placeholder="검색하고싶은 학생번호를 쓰세요."/>
	<button type="submit">찾기</button>
	</form>
	
	<h3> 검색 결과  </h3>
		<!--  if,else문 -->
		<c:choose>
		<c:when test="${studentGetById ne null}">
			해당번호의 학생이 있습니다.
		</c:when>
		<c:otherwise>
			해당번호의 학생이 없습니다.
		</c:otherwise>
		</c:choose>
<!--  http://localhost:8080/student?student_id=57&student_name=진현&student_birthday=19910527 예제 -->
</body>
</html>