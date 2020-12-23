<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<center>
		<form action="ResponseProc.jsp" method="post">
			<table width="400">
				<tr height="50">
					<td align="center" width="150">ID</td>
					<td width="250">
						<input type="text" name="id">
					</td>
				</tr>
				<tr height="50">
					<td align="center" width="150">PassWord</td>
					<td width="250">
						<input type="password" name="pass">
					</td>
				</tr>
				<tr height="50">
					<td align="center" colspan="2">
						<input type="submit" value="Login"> &nbsp; &nbsp;
						<input type="reset" value="Cancle">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>