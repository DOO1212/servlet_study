<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userName = (String)request.getAttribute("userName");
	int userPhone = (int)request.getAttribute("userPhone");
	String userEmail = (String)request.getAttribute("userEmail");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>주문내역</h1>
<h4>[고객정보]</h4>
<ul>
	<li>성함 : <%= userName %></li>
	<li>전화번호 : <%= userPhone %></li>
	<li>이메일 : <%= userEmail %></li>
</ul>
<h4>[주문정보]</h4>
<ul>
	<li>
		사이즈 : OOO
	</li>
	<li>
		토핑 : 
		<ul>
			<li>OOO</li>
			<li>OOO</li>
		</ul>
	</li>
</ul>
<h4>위와 같이 주문하셨습니다.</h4>
<h3>총 가격 : OOO원</h3>
<h4>즐거운 식사 시간되세요~</h4>

</body>
</html>