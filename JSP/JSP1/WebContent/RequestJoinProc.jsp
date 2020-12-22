<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<center>
		<h2>회원 정보 보기</h2>
			
			<%
				request.setCharacterEncoding("UTF-8");
			
				//넘어온 data들을 변수에 저장
				String id = request.getParameter("id");
				String pass1 = request.getParameter("pass1");
				String pass2 = request.getParameter("pass2");
				String email = request.getParameter("email");
				String tel = request.getParameter("tel");
				
				//checkbox : 한 번에 여러 개 체크(String으로 받지 못함)
				//	[]배열타입으로 리턴
				String [] hobby = request.getParameterValues("hobby");
				
				String job = request.getParameter("job");
				String age = request.getParameter("age");
				String comment = request.getParameter("comment");
				
			%>
	</center>
</body>
</html>