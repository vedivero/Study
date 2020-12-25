<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<!-- Session을 통해 value받아오기 -->
<%
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
			<td colspan="2" align="center" width="260">
				<img alt="" src="img/logo.PNG" width="200" height="70">
			</td>
			<td colspan="4" align="center">
				<font size="10">낭만 캠핑</font>
			</td>
		</tr>
		<tr height="50">
			<td width="130" align="center">텐트</td>
			<td width="130" align="center">의자</td>
			<td width="130" align="center">식기류</td>
			<td width="130" align="center">침낭</td>
			<td width="130" align="center">테이블</td>
			<td width="130" align="center">화롯대</td>
			<td width="130" align="center"><%=id %>님</td>
		</tr>
		
	</table>
</body>
</html>