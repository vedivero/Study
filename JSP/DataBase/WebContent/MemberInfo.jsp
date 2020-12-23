<%@page import="model.MemberBean"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

	<!-- Data Table에서 한 회원의 정보를 가져온다 -->
<%
	//MemberList에서 넘긴 ID값을 받아주기
	String id = request.getParameter("id");

	MemberDAO mdao = new MemberDAO();
	
	//요청된 id값을 넘겨서 해당 메서드에서 해당 id에 해당하는 정보를 불러오도록
	MemberBean mbean = mdao.oneSelectMember(id); 
	
%>

	<center>
		<table width="400" border="1">
			<tr height="50">
				<td align="center">ID</td>
				<td width="250" align="center"><%=mbean.getId() %></td>
			</tr>
			<tr height="50">
				<td align="center">Email</td>
				<td width="250" align="center"><%=mbean.getEmail() %></td>
			</tr>
			<tr height="50">
				<td align="center">Tel</td>
				<td width="250" align="center"><%=mbean.getTel() %></td>
			</tr>
			<tr height="50">
				<td align="center">Hobby</td>
				<td width="250" align="center"><%=mbean.getHobby() %></td>
			</tr>
			<tr height="50">
				<td align="center">Job</td>
				<td width="250" align="center"><%=mbean.getJob() %> </td>
			</tr>
			<tr height="50">
				<td align="center">Age</td>
				<td width="250" align="center"><%=mbean.getAge() %></td>
			</tr>
			<tr height="50">
				<td align="center">Comment</td>
				<td width="250" align="center"><%=mbean.getComment() %></td>
			</tr>		
		</table>
	</center>
</body>
</html>