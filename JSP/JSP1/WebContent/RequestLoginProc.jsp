<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 사용자로부터 넘어온 데이터를 처리하는 페이지-->
<!-- RequestLogin에서 전달된 ID와 pw값을 읽어들임 -->
<!-- Request안에 들어있는 데이터를 꺼내 옴 -->

<%
	//사용자의 정보가 저장되어 있는 객체인, reqeust객체를 getParameter()를 통해 사용자의 정보를 추출
	String id = request.getParameter("id");	//String type으로 저장 됨
	String pw = request.getParameter("pass");
%>
	당신의 아이디는 <%=id %>이고, 패스워드는 <%=pw %>입니다.

	<a href="RequestForward.jsp">다음페이지</a>
</body>
</html>