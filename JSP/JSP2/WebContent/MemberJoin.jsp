<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<center>
		<h2>Join us</h2>
			<form action="MemberJoinProc.jsp" method="post">
				<table width="500" border="1">
					<tr height="50">
						<td width="150" align="center">ID</td>
						<td width="350" align="center">
							<input type="text" name="id" size="40" placeholder="ID를 입력하세요.">
						</td>
					</tr>
					<tr height="50">
						<td width="150" align="center">PASSWORD</td>
						<td width="350" align="center">
							<input type="password" name="pass1" size="40" placeholder="6~14자리의 비밀번호를 입력하세요.">
						</td>
					</tr>
					<tr height="50">
						<td width="150" align="center">EMAIL</td>
						<td width="350" align="center">
							<input type="email" name="email" size="40">
						</td>
					</tr>
					<tr height="50">
						<td width="150" align="center">TEL</td>
						<td width="350" align="center">
							<input type="tel" name="tel" size="40">
						</td>
					</tr>
					<tr height="50">
						<td width="150" align="center">Address</td>
						<td width="350" align="center">
							<input type="text" name="address" size="40">
						</td>
					</tr>
					<tr height="50">
						<td align="center" colspan="2">
							<input type="submit" value="Join">
						</td>
					</tr>
				</table>
			</form>
		</center>
</body>
</html>