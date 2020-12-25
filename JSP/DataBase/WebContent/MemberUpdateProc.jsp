<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<%
	request.setCharacterEncoding("UTF-8");
%>
	<jsp:useBean id="mbean" class="model.MemberBean">
		<jsp:setProperty name="mbean" property="*"/>
	</jsp:useBean>
	
<%
	// ↓ mbean에서 id값을 가져왔으므로 중복되는 코드
	// String id = request.getParameter("id");
	
	MemberDAO mdao = new MemberDAO();
	
	//DataBase에서 꺼내온 PassWord값이 저장
	String pass = mdao.getPass(mbean.getId());
	
	//입력받은 PassWord값과 DataBase에서 가져온 PassWord값이 같은지를 비교 후
	if(mbean.getPass1().equals(pass)){
		//같은 경우 정보 수정
		//수정하는 method 호출
		mdao.updateMember(mbean);
		
		//수정이 완료되면 페이지 전환
		response.sendRedirect("MemberList.jsp");
		
	}else{
		//틀릴 경우 정부 수정 불가
		%>
		<script type="text/javascript">
			alert("비밀번호가 일치하지 않습니다.");
			history.back();
		</script>
		<%
	}
%>
</body>
</html>