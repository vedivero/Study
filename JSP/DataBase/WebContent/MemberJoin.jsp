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
						<td width="150" align="center">PASSWORD 확인</td>
						<td width="350" align="center">
							<input type="password" name="pass2" size="40" placeholder="동일한 비밀번호를 한번 더 입력하세요.">
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
						<td width="150" align="center">What is your hobby?</td>
						<td width="350" align="center">
							<input type="checkbox" name="hobby" value="camping">camping &nbsp;&nbsp;
							<input type="checkbox" name="hobby" value="movie">movie &nbsp;&nbsp;
							<input type="checkbox" name="hobby" value="book">book &nbsp;&nbsp;
							<input type="checkbox" name="hobby" value="mounting">mounting &nbsp;&nbsp;
						</td>
					</tr>
					<tr height="50">
						<td width="150" align="center">What is your job?</td>
						<td width="350" align="center">
							<select name="job">
								<option value="teacher">teacher</option>
								<option value="doctor">doctor</option>
								<option value="lawyer">lawyer</option>
								<option value="judge">judge</option>
							</select>
						</td>
					</tr>
					<tr height="50">
						<td width="150" align="center">What is your age?</td>
						<td width="350" align="center">
							<input type="radio" name="age" value="ten">ten &nbsp;&nbsp;
							<input type="radio" name="age" value="twenty">twenty &nbsp;&nbsp;
							<input type="radio" name="age" value="thirty">thirty &nbsp;&nbsp;
							<input type="radio" name="age" value="forty">forty &nbsp;&nbsp;
					<tr height="50">
						<td width="150" align="center">COMMENT</td>
						<td width="350" align="center">
							<textarea rows="5" cols="40" name="comment"></textarea>
						</td>
					</tr>
					<tr height="50">
						<td align="center" colspan="2">
							<input type="submit" value="Join">
							<input type="reset" value="cancle">
						</td>
					</tr>
				</table>
			</form>
		
	</center>
</body>
</html>