<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>

<%
	request.setCharacterEncoding("utf-8");

	String [] hobby = request.getParameterValues("hobby");
	//배열에 있는 내용을 하나의 String으로 저장
	
	String texthobby="";
	
	for(int i = 0; i<hobby.length; i++){
		
		texthobby += hobby[i]+" ";
		//				캠핑
		//캠핑			등산
		//캠핑 등산		영화
		//캠핑 등산 영화
	}
%>

	<jsp:useBean id="mbean" class="model.MemberBean">
		<jsp:setProperty name="mbean" property="*"/>
		<%--hobby뺴고 bean객체에 저장됨, bean은 따로 배열로 저장 --%>
	</jsp:useBean>

<%
	//기존 취미는 주소 번지가 저장되므로 위 배열의 내용을 하나의 String으로 저장한 변수를 다시 입력
	mbean.setHobby(texthobby);

	//DB에 접속하는 source작성
	final String DRIVER = "com.mysql.jdbc.Driver";
	final String id = "root";
	final String pass = "1234";
	final String url = "jdbc:mysql://localhost:3306/jsp";
	
	try{
		//1.해당 data base를 사용한다고 선언 (Class등록 = Mysql사용)
		Class.forName("com.mysql.jdbc.Driver");
		
		//2.해당 data base에 접속
		Connection con = DriverManager.getConnection(url,id,pass);	
	
		//3.접속 후 Query준비
		String sql="insert into member values(?,?,?,?,?,?,?,?)";
		
		// Query를 사용하도록 설정
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		// ?에 들어갈 data를 mapping
		pstmt.setString(1, mbean.getId());
		pstmt.setString(2, mbean.getPass1());
		pstmt.setString(3, mbean.getEmail());
		pstmt.setString(4, mbean.getTel());
		pstmt.setString(5, mbean.getHobby());
		pstmt.setString(6, mbean.getJob());
		pstmt.setString(7, mbean.getAge());
		pstmt.setString(8, mbean.getComment());
		
		//4.준비한 Query를 실행
		pstmt.executeUpdate();	//insert, update, delete시 사용 ↔ select = executeQuery();
		
		//5.자원 반납
		con.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		
	}
	
	
%>
	
	DB 접속완료!!
	
	<h2> 당신의 ID는 = <%=mbean.getId() %></h2>
	<h2> 당신의 Hobby는 = <%=mbean.getHobby() %></h2>
	
</body>
</html>