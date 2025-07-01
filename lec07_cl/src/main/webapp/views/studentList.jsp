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

	<table>
	 	<tr>
	        <th>번호</th>
	        <th>이름</th>
	        <th>나이</th>
    	</tr>
	</table>
	
	<c:forEach var="s" items=${list}>
	
	</c:forEach>

</body>
</html>