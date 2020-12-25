<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	
	<h2>Session Login Process1</h2>
<%-- <% --%>
<!--  	request.setCharacterEncoding("utf-8"); -->

<!-- 	String id = request.getParameter("id"); -->
<!--  	String pass = request.getParameter("pass"); -->
<!-- 	URL(주소줄을 통해 넘어온 data가 아니므로 필요없는 code가 된다.) -->
<!-- %> -->

<%
	//Object형태로 return되기 때문에 Down Casting필요
	String id = (String)session.getAttribute("id");
	String pass = (String)session.getAttribute("pass");
	
	System.out.println(id);	
	System.out.println(pass);	
%>
	<h2>Your ID is <%=id%></h2><hr>
	<h2>Your Password is <%=pass %></h2><hr>
</body>
</html>