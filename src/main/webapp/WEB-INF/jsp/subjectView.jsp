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
			<th>�����ȣ</th>
			<th>�����̸�</th>
		</tr>
		
		<!--  if,else�� -->
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
			subjectList�� NULL�Դϴ�.
		</c:otherwise>
		</c:choose>
		
	</table>
	
	<form method="post" action="/subjectView/add">
		<input type="number" name="sub_id" placeholder="�����ȣ"/>
		<input type="text" name="sub_name" placeholder="�̸�"/>
		<button type="submit">���</button>
	</form>
	
	<form method="post" action="/subjectView/deleteById">
	<input type="number" name="sub_id" placeholder="�����ϰ���� �����ȣ�� ������."/>
	<button type="submit">����</button>
	</form>
	
	<form method="get" action="/subjectView/getById">
	<input type="number" name="sub_id" placeholder="�˻��ϰ���� �����ȣ�� ������."/>
	<button type="submit">ã��</button>
	</form>
	
	<h3> �˻� ���  </h3>
		<!--  if,else�� -->
		<c:choose>
		<c:when test="${subjectGetById ne null}">
			�ش��ȣ�� ���� �ֽ��ϴ�.
		</c:when>
		<c:otherwise>
			�ش��ȣ�� ���� �����ϴ�.
		</c:otherwise>
		</c:choose>
</body>
</html>