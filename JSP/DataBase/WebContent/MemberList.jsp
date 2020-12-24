<%@page import="model.MemberBean"%>
<%@page import="java.util.Vector"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	
	
	<!-- 1.Data Base에 저장된 모든 회원의 정보를 가져옴 -->
	<!-- 2.table Tag를 사용해 화면에 모든 회원 정보 출력 -->
	
<%
	MemberDAO mdao = new MemberDAO();

	//mdao가 DB에 연결해서 data를 가져온다.
	//문제는 한 사람의 정보는 MemberBean에 담을 수 있지만, 여러 사람의 data를 담아야 한다.
	//배열을 사용하면 되지만, 배열은 사전에 배열의 길이를 설정 → 계속해서 늘어나는 data
	//고정길이x / 가변길이를 사용 = 배열처럼 생겼고 index를 가지고 있다.
	
	
	//List InterFace를 상속받은 [ArrayList],[vector]을 사용 = default =10, 자동으로 저장공간 증가 / data가 줄어들면 감소
	Vector<MemberBean> vec = mdao.allSelectMember();
	
	//<Extension(확장이 가능)> ← MemberBean type으로만 받겠다. 
	//data가 들어갈때도 나올떄도 MemberBean으로 처리 → Object Castion이 필요없어짐
	//<Extension(확장이 가능)>를 하지 않으면 Object형태가 된다.
	//Object형태로 Data를 집어넣는건 크게 불편하지 않지만, 꺼내올 때는 down Casting을 해줘야 하는 번거로움 발생

%>

<!-- 	Vector에 저장된 data들을 table tag를 사용해 출력 -->

	<center>
		<h1>모든 회원목록 보기</h1>
		<table width="800" border="1">
			<tr height="60">
				<td align="center" width="150"><b>ID</b></td>
				<td align="center" width="250"><b>EMAIL</b></td>
				<td align="center" width="200"><b>TEL</b></td>
				<td align="center" width="200"><b>HOBBY</b></td>
			</tr>
			<%
				for(int i=0; i<vec.size(); i++){
					//data 추출
					MemberBean bean = vec.get(i);
					//vector에 담긴 bean class를 하나씩 추출
			%>
			<tr height="60">
				<td align="center" width="150"><a href="MemberInfo.jsp?id=<%=bean.getId()%>"><%=bean.getId() %></a></td>
				<td align="center" width="250"><%=bean.getEmail() %></td>
				<td align="center" width="200"><%=bean.getTel() %></td>
				<td align="center" width="200"><%=bean.getHobby() %></td>
			</tr>
			
			<%
				}
			%>
		</table>
	</center>





</body>
</html>