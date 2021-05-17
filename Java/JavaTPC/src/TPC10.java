import kr.tpc.*;

//사용자 정의 자료형
//기본 자료형 외 사용자가 필요하여 생성하는 type
public class TPC10 {

	public static void main(String[] args) {
		
		//int a = 정수형 변수
		//BookDTO b = 새로운 자료형을 생성(객체 생성) -> 사용자가 정의
		
		//'책' 이라는 객체를 class로 생성한다. -> public class BookDTO
		
		//'책'을 구성하고 있는 속성들을 선언
		// public String title;
		// public int price;
		// public String company;
		// public int page;
		
		// new BookDTO(); = new 생성자 메서드에 의해 -> [Heap Area]에 load
		
		// 기본생성자 = 객체를 생성해준다.
		// BookDTO b 가 new BookDTO를 가리킨다.
		//----------------------------------------------------------
		
		//책(BooK)이라는 자료형을 생성 -> class생성 -> 객체 생성
		BookDTO b; //책이라는 객체의 이름 / 그 책을 주소를 가리키는 변수 b
		b = new BookDTO(); //메모리에 객체 생성 ( BookDTO class에 기본 생성자에 의해 생성)
		
		//price,page,company,price 책을 구성하는 속성 : 가격, 페이지,출판사,가격
		
		b.title = "java";
		b.company = "java lee";
		b.page = 453;
		b.price = 15000;
		
		System.out.println(b.title+"\t");
		System.out.println(b.company+"\t");
		System.out.println(b.page+"\t");
		System.out.println(b.price+"\t");
		
	}

}
