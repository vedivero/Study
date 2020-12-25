<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<%
	request.setCharacterEncoding("utf-8");

	//id값 저장
	String id = request.getParameter("id");

	//ID저장 checkbox가 체크 되었는지 판단
	String save = request.getParameter("save");
	
	if(save != null){
		
	}
	
	//Cookie를 사용하기 위해 Cookie객체를 생성
	Cookie cookie = new Cookie("id" , id);	//생성자가 defualt인 cookie는 불가능 
									// "key", "value" 
									// ex) new cookie("a","1234")
									// "a"를 호출하면 "1234"값이 return

	//cookie 유효시간 설정
	cookie.setMaxAge(60*10);
									
	//사용자에게 Cookie값을 넘겨줌				
	response.addCookie(cookie);

	out.write("쿠키 생성완료");
%>
	
</body>
</html>