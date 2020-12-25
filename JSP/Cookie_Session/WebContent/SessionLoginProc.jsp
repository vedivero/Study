<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	
	<h2>Session Login Process1</h2>
<%
	request.setCharacterEncoding("utf-8");
	
	//사용자에게 전달받은 data를 변수에 저장
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	//Cookie는 객체를 생성해서 사용했지만 session 내장 객체이므로 바로 사용가능
	
	//ID와 Password저장
	session.setAttribute("id", id);
	session.setAttribute("pass", pass);
	
	//Session의 유지시간 설정
	session.setMaxInactiveInterval(3600);
	
	response.sendRedirect("SessionMain.jsp");
%>
	<h2>Your ID is <%=id%></h2><hr>
	<h2>Your Password is <%=pass %></h2><hr>
	<a href="SessionLoginProc2.jsp">Next Page</a>
	<!-- request객체는 다음 한 페이지까지만 -->
	<!-- 주소줄에 ID값을 보내면(?id=) data가 넘어간다 -->
</body>
</html>