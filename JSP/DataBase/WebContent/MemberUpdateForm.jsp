<%@page import="model.MemberBean"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");

	MemberDAO mdao = new MemberDAO();
	MemberBean mbean = mdao.oneSelectMember(id);

%>


	<center>
		<table width="400" border="1">
			<form action="MemberUpdateProc.jsp" method="post">
				<tr height="50">
					<td align="center" width="150">ID</td>
					<td width="250" align="center"><%=mbean.getId() %></td>
				</tr>
				<tr height="50">
					<td align="center" width="150">Email</td>
					<td width="250" align="center">
						<input type="text" name="email" value="<%=mbean.getEmail() %>">
					</td>
				</tr>
				<tr height="50">
					<td align="center" width="150">Tel</td>
					<td width="250" align="center">
						<input type="text" name="tel" value="<%=mbean.getTel() %>">
					</td>
				</tr>
				<tr height="50">
					<td align="center" width="150">PassWord</td>
					<td width="250" align="center">
						<input type="password" name="pass1">
					</td>
				</tr>

				<tr height="50">
					<td align="center" colspan="2">
						<input type="submit" value="modify"> &nbsp; &nbsp;
						<input type="hidden" name="id" value=<%=mbean.getId() %>>
		</form>
						<button onclick="location.href='MemberList.jsp'">회원 전체 보기</button>
					</td>
				</tr>
			</table>
	</center>
	
	
</body>
</html>