<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>

	<h2>방명록</h2>
	
	<%@ page import="com.gn.dto.Log" %>
	
  <textarea id="name" placeholder="이름을 입력하세요"></textarea><br>
  <textarea id="message" placeholder="메시지를 입력하세요"></textarea><br>
  <button id="send">전송</button>

  <hr>
  <div id="text_box"></div>

  <script>

      $("#send").click(function () {
    	  
        const name = $("#name").val().trim();
        const message = $("#message").val().trim();

        $("#text_box").after("<div>" + "이름 : " + name + "내용 : " + message + "</div>" +
        		<%= new Date().getHours() %>);

        $("#name").val("");
        $("#message").val("");
        
      });

  </script>







</body>
</html>