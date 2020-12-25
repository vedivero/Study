<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<!-- Cookie를 통한 Login -->
	
	<%
	
		//사용자(Client) 컴퓨터의 Cookie값을 읽음, 몇개인지 모르기에 배열을 이용해 Cookie값을 저장
		
		Cookie[] cookies = request.getCookies();
		String id ="";
		//Cookie값이 없을수도 있으니 Null처리
		
		if(cookies!=null){	//cookie가 있을 때만 처리하도록
			
			for (int i=0; i<cookies.length; i++){
				if(cookies[i].getName().equals("id")){
					id = cookies[i].getValue();
					break;
				}
			}
		}
	%>

	<!-- Cookie : Client측에 저장되는 정보 -->

	<center>
		<h2>Cookie Login</h2>
			<form action="CookieLoginProc.jsp" method="post">
				<table width="400" border="1">
					<tr height="50">
						<td width="150">ID</td>
						<td>
							<input type="text" name="id" value="<%=id%>">
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
							<input type="checkbox" name="save" value="1">Save ID
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