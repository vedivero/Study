import kr.tpc.*;

public class TPC15 {

	//객체 설계 = 메모리에 기억 공간 할당, 해당 기억 공간의 데이터를 넣고 빼는 것이 주 목적
	//   	     제약이 없으면 잘못된 데이터를 넣어도 문제가 되지 않는 현상이 발생 -> 보호 필요
	//		-> 정보 은닉 = 다른 객체(class)로 부터 접근을 막는 것(private) = 상태정보 보호
	
	//private멤버 변수를 접근하려면, setter/getter method가 필요
	
	public static void main(String[] args){
		
		MemberVO m = new MemberVO();
		
		//데이터를 넣는 것보다 설계가 잘못됐다 (public)
		/*
		//바람직하지 않은 접근 방법 
		m.name="홍길동";
		m.age=20;
		m.tel="010-1234-1234";
		m.addr="서울";
		
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.tel);
		System.out.println(m.addr);
		*/
		
		m.setName("임꺽정");
		m.setAge(25);
		m.setTel("010-1231-1111");
		m.setAddr("부산");
		
		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println(m.getTel());
		System.out.println(m.getAddr());
		
	}
	
}
