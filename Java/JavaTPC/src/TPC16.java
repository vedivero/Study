import kr.tpc.*;

public class TPC16 {

	public static void main(String[] args) {

		MemberVO m = new MemberVO("홍길동",40,"010-1222-3333","부산");
		//setter method가 필요없다 - 생성자 메서드를 통해 data를 받았기 때문
		
		//MemberVO에 들어있는 data출력
		System.out.println(m.toString());	//data가 들어있는지 없는지 확인하기 좋다


		//--------------------------------------------------------------
		
		//data입력
		MemberVO m1 = new MemberVO();
		m1.setName("홍길순");
		m1.setAge(23);
		m1.setTel("010-0000-0000");
		m1.setAddr("수원");
		
		System.out.println(m1.getAddr());
		System.out.println(m1.getAge());
		System.out.println(m1.getTel());
		System.out.println(m1.getName());
		
		System.out.println(m1);
	}

}
