<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<center>
		<h2>Session Login</h2>
			<form action="SessionLoginProc.jsp" method="post">
				<table width="400" border="1">
					<tr height="50">
						<td width="150">ID</td>
						<td>
							<input type="text" name="id" ">
						</td>
					</tr>
					<tr height="50">
						<td width="150">Password</td>
						<td>
							<input type="password" name="pass">
						</td>
					</tr>
					<tr height="50">
						<td colspan="2" align="center">
							<input type="submit" value="Login">						
						</td>
					</tr>
				</table>
			</form>
	</center>
	
</body>
</html>