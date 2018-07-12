<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
        
<!--  c:foreach�� jstl ���̺귯������ ����Ҷ� ���� -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h3> ��ü ���� ��� </h3>
	<table width="300" cellpadding="0" cellspacing="0" border="1" >
		<tr>
			<th>������ȣ</th>
			<th>�л���ȣ</th>
			<th>�����ȣ</th>
			<th>����</th>
		</tr>
		
		<!--  if,else�� -->
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
			gradeList�� NULL�Դϴ�.
		</c:otherwise>
		</c:choose>
		
	</table>
	
	<form method="post" action="/gradeView/add">
		<input type="number" name="grade_num" placeholder="������ȣ"/>
		<input type="text" name="grade_student_id" placeholder="�л���ȣ"/>
		<input type="text" name="grade_sub_id" placeholder="�����ȣ"/>
		<input type="text" name="grade_score" placeholder="����"/>
		<button type="submit">���</button>
	</form>
	
	<form method="post" action="/gradeView/deleteById">
	<input type="number" name="grade_num" placeholder="�����ϰ���� ������ȣ�� ������."/>
	<button type="submit">����</button>
	</form>
	
	<br />
	<br />
	
	<form method="get" action="/gradeView/getGradeByStudentId">
	<input type="number" name="grade_student_id" placeholder="�˻��ϰ���� �л���ȣ�� ������."/>
	<button type="submit">ã��</button>
	</form>
	<h3> �л���ȣ�� �˻� ���  </h3>
		<!--  if,else�� -->
		<c:choose>
		<c:when test="${gradeByStudentId ne null}">
			�ش��ȣ�� ������ �ֽ��ϴ�.<br />
		</c:when>
		<c:otherwise>
			�ش��ȣ�� ������ �����ϴ�.<br />
		</c:otherwise>
		</c:choose>
	
	<form method="get" action="/gradeView/getGradeBySubjectId">
	<input type="number" name="grade_sub_id" placeholder="�˻��ϰ���� �����ȣ�� ������."/>
	<button type="submit">ã��</button>
	</form>
	<h3> �����ȣ�� �˻� ���  </h3>
		<!--  if,else�� -->
		<c:choose>
		<c:when test="${gradeBySubjectId ne null}">
			�ش��ȣ�� ������ �ֽ��ϴ�.
		</c:when>
		<c:otherwise>
			�ش��ȣ�� ������ �����ϴ�.
		</c:otherwise>
		</c:choose>
	
</body>
</html>