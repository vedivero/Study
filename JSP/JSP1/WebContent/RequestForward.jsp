<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	ReqeustForward페이지 입니다.
<%
	String id = request.getParameter("id");	//String type으로 저장 됨
	String pw = request.getParameter("pass");
%>
	당신의 아이디는 <%=id %>이고, 패스워드는 <%=pw %>입니다.
	
<!-- 	Request범위 = form으로 넘겨준 page까지만 가능 → session은 가능 -->
</body>
</html>