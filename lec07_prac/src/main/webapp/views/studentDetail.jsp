<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>학생 상세 정보</h1>
	<p>번호: ${student.studentNo}</p>
	<p>이름: ${student.studentName}</p>
	<p>나이: ${student.studentAge}</p>
	
	<a href="/student/list">목록으로 돌아가기</a>

</body>
</html>