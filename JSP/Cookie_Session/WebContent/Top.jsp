<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<!-- Session을 통해 value받아오기 -->
<%
	//Logout버튼 클릭 시 Parameter값으로 Logout인지 여부를 파악
	String logout = request.getParameter("logout");
	
	if(logout != null){
		//ID에 null값 부여
		session.setAttribute("id", null);
		
		//Session 유지 시간 = 0초 = 세션 해제
			//session.setMaxInactiveInterval(0);
		session.setMaxInactiveInterval(0);
	}

	String id = (String)session.getAttribute("id");

	//Login이 되어 있지 않은 경우(Session = null)처리
	if(id ==null){
		id="Guest";
	}
%>

	<!-- Top -->
	<table width="800"  align="center">
		<tr height="100">
		
			<!-- Logo -->
			<td colspan="2" align="center" width="200">
				<img alt="" src="img/logo.PNG" width="200" height="70">
			</td>
			<td colspan="4" align="center">
				<font size="10">낭만 캠핑</font>
			</td>
		</tr>
		<tr height="50">
			<td width="100" align="center">텐트</td>
			<td width="100" align="center">의자</td>
			<td width="100" align="center">식기류</td>
			<td width="100" align="center">침낭</td>
			<td width="100" align="center">테이블</td>
			<td width="100" align="center">화롯대</td>
			
			<td width="200" align="center">
			<%
				if(id.equals("Guest")){
			%>
				<%=id %>님										
				<button onclick="location.href='SessionMain.jsp?center=SessionLoginForm.jsp'">로그인</button>
			<%					
				}else{
			%>
				<%=id %>님										
				<button onclick="location.href='SessionMain.jsp?logout=1'">로그아웃</button>
			<%
				}
			%>
			
			</td>
		</tr>
		
	</table>
</body>
</html>