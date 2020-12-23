<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

		ResponseRedirect.jsp 페이지 입니다.
<%

	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");

%>
		
		<h3> ID : <%=id %></h3>
</body>
</html>