package model;

//import java.sql.*;로 써도 되지만 메모리 낭비가 되니 필요한 것만 명시
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberDAO {

	//Data Access Object
	//DataBase에 연결하여 select, insert, update, delete작업을 통해 data조작을 실행해주는 Class
	
	final String DRIVER = "com.mysql.jdbc.Driver";
 	final String id = "root";
 	final String pw = "1234";
 	final String url = "jdbc:mysql://localhost:3306/jsp";
	
	//Data Base에 접근할 수 있도록 설정
	Connection con;
	
	//Data Base에서 Query를 실행해주는 객체
	String sql ="";
	PreparedStatement pstmt;
	
	//Data Base에서 처리한 결과를 Java에 저장해주는 객체
	ResultSet rs;
		
	public void getCon(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, id, pw);
				
				
			}catch(Exception e){
			
		}
		
	}
	
	//회원가입 method
	public void insertMember(MemberBean mbean){
		
		try{
			
//			//1.해당 data base를 사용한다고 선언 (Class등록 = Mysql사용)
//			Class.forName("com.mysql.jdbc.Driver");
			
//			//2.해당 data base에 접속
//			Connection con = DriverManager.getConnection(url,id,pw);	
			
			//1, 2번에 해당하는 동작을 getCon() method 호출로 처리
			getCon();
			System.out.println("insertMember() : DB연결 완료");
			//3.접속 후 Query준비
			String sql = "insert into member values(?,?,?,?,?,?,?,?)";
			
			// Query를 사용하도록 설정
			PreparedStatement pstmt = con.prepareStatement(sql);
			System.out.println("Query실행할 PreparedStatement객체 준비 완료");
			
			// ?에 들어갈 data를 mapping
			pstmt.setString(1, mbean.getId());
			pstmt.setString(2, mbean.getPass1());
			pstmt.setString(3, mbean.getEmail());
			pstmt.setString(4, mbean.getTel());
			pstmt.setString(5, mbean.getHobby());
			pstmt.setString(6, mbean.getJob());
			pstmt.setString(7, mbean.getAge());
			pstmt.setString(8, mbean.getComment());
			System.out.println("Bean 객체에 정보 저장 완료");
			
			//4.준비한 Query를 실행
			pstmt.executeUpdate();	//insert, update, delete시 사용 ↔ select = executeQuery();
			System.out.println("Query실행하여 정보 insert완료");
			
			//5.자원 반납
			con.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	//모든 회원 정보를 return해주는 method
	public Vector<MemberBean> allSelectMember(){
		
		Vector<MemberBean> v = new Vector<>(); 
				
		try {
			getCon();
			
			sql = "select * from member";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			//resultSet에 저장된 data를 꺼내와야 한다.
			while(rs.next()){  //rs.next = 저장된 data만큼만 while문을 돌리겠다.
				MemberBean bean = new MemberBean(); //한 컬럼의 값은 하나에 가방에만 저장
				
				//DB에서 꺼내온 data를 한 가방의 여러 칸에 각각 setting해주기
				bean.setId(rs.getString(1));
				bean.setPass1(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setJob(rs.getString(6));
				bean.setAge(rs.getString(7));
				bean.setComment(rs.getString(8));
				
				//알맞게 저장된 data 즉, 패키징 된 memberBean Class를 Vector에 저장
				v.add(bean);	//index 0부터 순서대로 data가 저장
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return v;
	}
	
	//한 사람에 대한 정보를 return
	public MemberBean oneSelectMember(String id){
		
		MemberBean bean = new MemberBean();
		
		try {
			getCon();
			
			sql = "select * from member where id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){	//record가 있다면
				
				//data저장소, bean에 전달받은 id에 해당하는 모든 컬럼값을 넘겨주시 위해 setting
				bean.setId(rs.getString(1));
				bean.setPass1(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setJob(rs.getString(6));
				bean.setAge(rs.getString(7));
				bean.setComment(rs.getString(8));
				
				System.out.println("Bean : "+bean);
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}
	
}
