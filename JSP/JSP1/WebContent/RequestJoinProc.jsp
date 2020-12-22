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

				//pass1과 pass2가 같지 않을 경우 처리
				if(!pass1.equals(pass2)){
			%>
				<script type="text/javascript">
					alert("비밀번호가 일치하지 않습니다.");
					history.back();
				</script>
			<%
				}
			%>
			
			<table width="400" border="1">
				<tr height="50" align="center">
					<td width="150" align="center">ID</td>
					<td width="350" align="center">
						<%=id %>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">EMAIL</td>
					<td width="350" align="center">
						<%=email %>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">TEL</td>
					<td width="350" align="center">
						<%=tel %>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">What is your hobby?</td>
					<td width="350" align="center">
						<%
							for(int i=0; i<hobby.length; i++){
								out.write(hobby[i]+" ");
							}
								
						%>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">What is your job?</td>
					<td width="350" align="center">
						<%=job %>
					</td>
				<tr height="50">
					<td width="150" align="center">What is your age?</td>
					<td width="350" align="center">
						<%=age %>
					</td>
				</tr>
				<tr height="50">
					<td width="150" align="center">COMMENT</td>
					<td width="350" align="center">
						<%=comment %>
					</td>
				</tr>
			</table>
	</center>
</body>
</html>