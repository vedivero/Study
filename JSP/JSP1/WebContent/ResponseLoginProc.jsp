<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h2>로그인 처리 페이지</h2>
<%
		request.setCharacterEncoding("UTF-8");
	
		String dbid = "aaaa";
		String dbpass = "1234";

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		//id와 pw가 일치하므로 main페이지 보여주기
		if(dbid.equals(id) && dbpass.equals(pass)){
			
			response.sendRedirect("ResponseMain.jsp?id="+id);
			
		}else{
%>
			<script type="text/javascript">
				alert("아이디, 비밀번호가 일치하지 않습니다.");
				history.back();
			</script>
<%
		}
%>
</body>
</html>