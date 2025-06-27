<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String nick = (String)request.getAttribute("nick");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/saveNick" mehtod="post">
		<label for="user_name">닉네임 : </label>
		<input type="text" id="user_name" name="save_name"><br>
	<button type="submit">닉네임 입력</button>
	</form>
	
	<form action="/removeNick" mehtod="post">
	<button type="submit">닉네임 삭제</button>
	</form>
	
	닉네임 : <% if (nick == null) {
		out.print("_____");
	} else {
		out.print(nick);
	}
	%>


</body>
</html>