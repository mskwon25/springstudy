<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
        
<!--  c:foreach등 jstl 라이브러리관련 사용할때 붙임 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h3> 전체 성적 목록 </h3>
	<table width="300" cellpadding="0" cellspacing="0" border="1" >
		<tr>
			<th>성적번호</th>
			<th>학생번호</th>
			<th>과목번호</th>
			<th>점수</th>
		</tr>
		
		<!--  if,else문 -->
		<c:choose>
		<c:when test="${gradeList ne null}">
			<c:forEach items="${gradeList}" var="grade">
				<tr>
					<td>${grade.grade_num }</td>
					<td>${grade.grade_student_id }</td>
					<td>${grade.grade_sub_id }</td>
					<td>${grade.grade_score }</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			gradeList가 NULL입니다.
		</c:otherwise>
		</c:choose>
		
	</table>
	
	<form method="post" action="/gradeView/add">
		<input type="number" name="grade_num" placeholder="성적번호"/>
		<input type="text" name="grade_student_id" placeholder="학생번호"/>
		<input type="text" name="grade_sub_id" placeholder="과목번호"/>
		<input type="text" name="grade_score" placeholder="점수"/>
		<button type="submit">등록</button>
	</form>
	
	<form method="post" action="/gradeView/deleteById">
	<input type="number" name="grade_num" placeholder="삭제하고싶은 성적번호를 쓰세요."/>
	<button type="submit">삭제</button>
	</form>
	
	<br />
	<br />
	
	<form method="get" action="/gradeView/getGradeByStudentId">
	<input type="number" name="grade_student_id" placeholder="검색하고싶은 학생번호를 쓰세요."/>
	<button type="submit">찾기</button>
	</form>
	<h3> 학생번호로 검색 결과  </h3>
		<!--  if,else문 -->
		<c:choose>
		<c:when test="${gradeByStudentId ne null}">
			해당번호의 성적가 있습니다.<br />
		</c:when>
		<c:otherwise>
			해당번호의 성적가 없습니다.<br />
		</c:otherwise>
		</c:choose>
	
	<form method="get" action="/gradeView/getGradeBySubjectId">
	<input type="number" name="grade_sub_id" placeholder="검색하고싶은 과목번호를 쓰세요."/>
	<button type="submit">찾기</button>
	</form>
	<h3> 과목번호로 검색 결과  </h3>
		<!--  if,else문 -->
		<c:choose>
		<c:when test="${gradeBySubjectId ne null}">
			해당번호의 성적가 있습니다.
		</c:when>
		<c:otherwise>
			해당번호의 성적가 없습니다.
		</c:otherwise>
		</c:choose>
	
</body>
</html>