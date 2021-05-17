import kr.tpc.*;

public class TPC12 {

	//생성자 메서드
	
	/*
		1.객체를 생성할 때 사용되는 메서드
		2.객체 생성 후 객체의 초기화를 하는 역할 수행
		3. 특징 
			-클래시 이름과 동일한 메서드
			-메서드의 return type이 없다(void가 아니다)
			-public 접근 권한을 가진다.(단, private생성자도 있음)
			-생성자가 없을 때는 기본 생성자가 만들어진다.
	*/
	
	
	public static void main(String[] args) {

		//생성자 -> 생성+초기화 -> 메서드 중복정의(오버로딩)
		//책1권을 저장하는 객체
		BookVO b1 = new BookVO();	//공간이 생성되었으니 초기화 가능
		
		System.out.print(b1.title+"\t");
		System.out.print(b1.price+"\t");
		System.out.print(b1.company+"\t");
		System.out.println(b1.page+"\t");
	
		
		//초기화되어 있는 BookVO이므로 같은 값으로 초기화 되어 생성
		BookVO b2 = new BookVO();	
		
		System.out.print(b2.title+"\t");
		System.out.print(b2.price+"\t");
		System.out.print(b2.company+"\t");
		System.out.println(b2.page+"\t");
	
		//내가 원하는 데이터로 초기화하기
		BookVO b3 = new BookVO("Python",19000,"영진",402);	
		
		System.out.print(b3.title+"\t");
		System.out.print(b3.price+"\t");
		System.out.print(b3.company+"\t");
		System.out.println(b3.page+"\t");
	
		
	}

	
}
