<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Session Practice</h2>
<%
	String name = "Lee";
	
	//세션을 이용해 데이터를 유지
	session.setAttribute("name1", name);
	
	//세션 유지 시간
	session.setMaxInactiveInterval(10);	//10초 동안만 세션을 유지
%>

	<a href="SessionName.jsp">move to session name page</a>
	
	
</body>
</html>