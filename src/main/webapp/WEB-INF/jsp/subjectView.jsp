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
<h3> 전체 과목 목록 </h3>
	<table width="300" cellpadding="0" cellspacing="0" border="1" >
		<tr>
			<th>과목번호</th>
			<th>과목이름</th>
		</tr>
		
		<!--  if,else문 -->
		<c:choose>
		<c:when test="${subjectList ne null}">
			<c:forEach items="${subjectList}" var="subject">
				<tr>
					<td>${subject.sub_id}</td>
					<td>${subject.sub_name }</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			subjectList가 NULL입니다.
		</c:otherwise>
		</c:choose>
		
	</table>
	
	<form method="post" action="/subjectView/add">
		<input type="number" name="sub_id" placeholder="과목번호"/>
		<input type="text" name="sub_name" placeholder="이름"/>
		<button type="submit">등록</button>
	</form>
	
	<form method="post" action="/subjectView/deleteById">
	<input type="number" name="sub_id" placeholder="삭제하고싶은 과목번호를 쓰세요."/>
	<button type="submit">삭제</button>
	</form>
	
	<form method="get" action="/subjectView/getById">
	<input type="number" name="sub_id" placeholder="검색하고싶은 과목번호를 쓰세요."/>
	<button type="submit">찾기</button>
	</form>
	
	<h3> 검색 결과  </h3>
		<!--  if,else문 -->
		<c:choose>
		<c:when test="${subjectGetById ne null}">
			해당번호의 과목가 있습니다.
		</c:when>
		<c:otherwise>
			해당번호의 과목가 없습니다.
		</c:otherwise>
		</c:choose>
</body>
</html>