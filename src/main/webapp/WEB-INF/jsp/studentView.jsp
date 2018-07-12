<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
        
<!--  c:foreach�� jstl ���̺귯������ ����Ҷ� ���� -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html lang="en">
<body>
<h3> ��ü �л� ��� </h3>
	<table width="300" cellpadding="0" cellspacing="0" border="1" >
		<tr>
			<th>�л���ȣ</th>
			<th>�л��̸�</th>
			<th>�л�����</th>
		</tr>
		
		<!--  if,else�� -->
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
			studentList�� NULL�Դϴ�.
		</c:otherwise>
		</c:choose>
		
	</table>
	
	<form method="post" action="/studentView/add">
		<input type="number" name="student_id" placeholder="�л���ȣ"/>
		<input type="text" name="student_name" placeholder="�̸�"/>
		<input type="text" name="student_birthday" placeholder="�������"/>
		<button type="submit">���</button>
	</form>
	
	<form method="post" action="/studentView/deleteById">
	<input type="number" name="student_id" placeholder="�����ϰ���� �л���ȣ�� ������."/>
	<button type="submit">����</button>
	</form>
	
	<form method="get" action="/studentView/getById">
	<input type="number" name="student_id" placeholder="�˻��ϰ���� �л���ȣ�� ������."/>
	<button type="submit">ã��</button>
	</form>
	
	<h3> �˻� ���  </h3>
		<!--  if,else�� -->
		<c:choose>
		<c:when test="${studentGetById ne null}">
			�ش��ȣ�� �л��� �ֽ��ϴ�.
		</c:when>
		<c:otherwise>
			�ش��ȣ�� �л��� �����ϴ�.
		</c:otherwise>
		</c:choose>
<!--  http://localhost:8080/student?student_id=57&student_name=����&student_birthday=19910527 ���� -->
</body>
</html>