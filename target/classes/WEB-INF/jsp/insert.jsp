<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert Form</title>
</head>
<body>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />  
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>  
<%@ include file="common.jsp" %>
<%
	String param = (String) request.getAttribute("param");
	String strTitle = "";
	if(param.equals("insertUser")){
		strTitle = "학생 입력";
	}else if(param.equals("insertProfessor")){
		strTitle = "교수 입력";
	}else if(param.equals("insertSubject")){
		strTitle = "과목 입력";
	}else if(param.equals("insertGrade")){
		strTitle = "성적 입력";
	}
%>
<div class="container">
	<h2> <%=strTitle%> </h2>
</div>
 
<div class="container">
    <form action="/<%=param%>" method="post">
      <%if(!param.equals("insertGrade")){ %>
	      <div class="form-group">
	        <label for="id">번호</label>
	        <input type="text" class="form-control" id="id" name="id" placeholder="번호를 입력하세요.">
	      </div>
	      <div class="form-group">
	        <label for="name">이름</label>
	        <input type="text" class="form-control" id="name" name="name" placeholder="이름을 입력하세요.">
	      </div>
      <%}
      if(param.equals("insertUser")||param.equals("insertProfessor")){ %>
	      <div class="form-group">
	        <label for=birth">생일</label>
	        <input type="text" name="birth" id="birth" size="12" />
	      </div>
      <%} 
      if(param.equals("insertSubject")){ %>
	      <div class="form-group">
	        <label for="professor_id">교수번호</label>
	        <input type="text" class="form-control" id="professor_id" name="professor_id" placeholder="교수번호를 입력하세요.">
     	 </div>
      <%
      }
      if(param.equals("insertGrade")){ %>
	      <div class="form-group">
	        <label for="student_id">학생번호</label>
	        <input type="text" class="form-control" id="student_id" name="student_id" placeholder="학생번호를 입력하세요.">
     	 </div>
     	 <div class="form-group">
	        <label for="subject_id">과목번호</label>
	        <input type="text" class="form-control" id="subject_id" name="subject_id" placeholder="과목번호를 입력하세요.">
     	 </div>
     	 <div class="form-group">
	        <label for=""score"">성적</label>
	        <input type="text" class="form-control" id="score" name="score" placeholder="성적을 입력하세요.">
     	 </div>
      <%
      }
      %>
      <button type="submit" class="btn btn-primary">작성</button>
    </form>
</div>

</body>
</html>



<script type="text/javascript">
	$(function(){
	    $("#birth").datepicker({dateFormat:'ymmdd'});
	});

</script>
