<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
	    <tr>
	        <th>번호</th>
	        <th>이름</th>
	        <th>나이</th>
	    </tr>
	    <!-- 각 학생의 tr에 클릭 이벤트 부여 -->
	    <!-- 해당 학생의 studentNo를 파라미터로 상세조회 요청 -->
	    <c:forEach var="s" items="${list}">
	        <tr onclick="location.href='/student/detail?no=${s.studentNo}'" style="cursor:pointer;">
	            <td>${s.studentNo}</td>
	            <td>${s.studentName}</td>
	            <td>${s.studentAge}</td>
	        </tr>
	    </c:forEach>
	</table>

</body>
</html>