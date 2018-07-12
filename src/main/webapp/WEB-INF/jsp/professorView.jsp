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
	<h3> 전체 교수 목록 </h3>
	<table width="300" cellpadding="0" cellspacing="0" border="1" >
		<tr>
			<th>교수번호</th>
			<th>교수이름</th>
			<th>교수과목</th>
			<th>교수생일</th>
		</tr>
		
		<!--  if,else문 -->
		<c:choose>
		<c:when test="${professorList ne null}">
			<c:forEach items="${professorList}" var="professor">
				<tr>
					<td>${professor.prof_num }</td>
					<td>${professor.prof_name }</td>
					<td>${professor.prof_sub }</td>
					<td>${professor.prof_birthday }</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			professorList가 NULL입니다.
		</c:otherwise>
		</c:choose>
		
	</table>
	
	<form method="post" action="/professorView/add">
		<input type="number" name="prof_num" placeholder="교수번호"/>
		<input type="text" name="prof_name" placeholder="이름"/>
		<input type="text" name="prof_sub" placeholder="과목이름"/>
		<input type="text" name="prof_birthday" placeholder="생년월일"/>
		<button type="submit">등록</button>
	</form>
	
	<form method="post" action="/professorView/deleteByNum">
	<input type="number" name="prof_num" placeholder="삭제하고싶은 교수번호를 쓰세요."/>
	<button type="submit">삭제</button>
	</form>
	
	<form method="get" action="/professorView/getById">
	<input type="number" name="prof_num" placeholder="검색하고싶은 교수번호를 쓰세요."/>
	<button type="submit">찾기</button>
	</form>
	
	<h3> 검색 결과  </h3>
		<!--  if,else문 -->
		<c:choose>
		<c:when test="${professorGetById ne null}">
			해당번호의 교수가 있습니다.
		</c:when>
		<c:otherwise>
			해당번호의 교수가 없습니다.
		</c:otherwise>
		</c:choose>
</body>
</html>