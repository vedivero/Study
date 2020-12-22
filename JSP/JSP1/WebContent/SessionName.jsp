<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Session name page</h2>
	
	
<%
// 	String name1 = request.getParameter("name");
	String name1 = (String)session.getAttribute("name1");
%>
<%=name1 %>님 반갑습니다.

<!-- 위와 같이 이전 페이지에서 저장된 값은 불러올 수 없다.-->
<!-- 불러오는 방법 -->
<!-- 1. 주소줄에 Prameter값(name값) 넘겨주기  -->
<!-- 	ex) href="SessionName.jsp?id=" -->

<!-- 2.session을 이용하여 데이터를 유지 -->


</body>
</html>