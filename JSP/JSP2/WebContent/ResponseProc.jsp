<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	
	이 페이는 로그인 정보가 넘어오는 페이지 입니다.
	
<%

	request.setCharacterEncoding("utf-8");	//post 방식의 한글처리

	String id = request.getParameter("id");

	//response.sendRedirect("ResponseRedirect.jsp");	//흐름 제어
%>

	<!-- response.sendRedirect("")와 차이 -->		
	<jsp:forward page="ResponseRedirect.jsp">	<!-- 흐름 제어 -->
		<jsp:param value="mmmm" name="id"/>
	</jsp:forward>
	<!-- forward객체 = Request안에 값이 전달됨 -->
	<!-- Reqeust의 값을 유지시키거나, 해당 값을 임의로 변경할 때 사용 -->
		
		
	<!-- 결론 : 실무에서는 response도 안쓰고, forward도 안쓰고 session을 사용-->
		<h3> ID : <%=id %></h3>
</body>
</html>