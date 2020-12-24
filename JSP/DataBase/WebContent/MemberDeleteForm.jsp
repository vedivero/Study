<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	
	<center>
		<h2>회원 삭제하기</h2>
		<table width="400" border="1">
			<form action="MemberDeleteProc.jsp" method="post">
				<tr height="50">
					<td align="center" width="150">ID</td>
					<td width="250" align="center"><%=request.getParameter("id") %></td>
				</tr>
				<tr height="50">
					<td align="center" width="150">PassWord</td>
					<td width="250" align="center">
						<input type="password" name="pass1">
					</td>
				</tr>

				<tr height="50">
					<td align="center" colspan="2">
						<input type="submit" value="Delete"> &nbsp; &nbsp;
						<input type="hidden" name="id" value=<%=request.getParameter("id") %>>
		</form>
						<button onclick="location.href='MemberList.jsp'">회원 전체 보기</button>
					</td>
				</tr>
			</table>
	</center>
</body>
</html>