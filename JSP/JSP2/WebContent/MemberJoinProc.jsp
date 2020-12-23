<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<center>
		<h2>회원 정보 보기</h2>
		
		<%
			request.setCharacterEncoding("utf-8");
			
		//Bean이 없을 경우 data를 추출하는 기존의 방식
			//String id = request.getParameter("id");
			//String pw = request.getParameter("pass1");
			//String email = request.getParameter("email");
			//String tel = request.getParameter("tel");
			//String address = request.getParameter("address");
			
		%>
		
		<!-- Request로 넘어온 data를 Java Beans랑 Mapping 시켜주는 useBean -->
		<jsp:useBean id="mbean" class="bean.MemberBean">
<%--		<jsp:setProperty name="mbean" property="id"/> --%>
			<jsp:setProperty name="mbean" property="*"/>
		</jsp:useBean> 
		<!-- MemberBean mbean = new MemberBean()과 동일한 동작-->
		
		<h2>Your ID is <jsp:getProperty property="id" name="mbean"/></h2>
		<h2>Your PassWord is <jsp:getProperty property="pass1" name="mbean"/></h2>
		<h2>Your Email is <jsp:getProperty property="email" name="mbean"/></h2>
		<%=mbean.getEmail() %>
	</center>
	
</body>
</html>