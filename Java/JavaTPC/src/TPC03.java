import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] agrs){
		
		//관계 이해 PDT(Primitive Data Type) vs UDDT (User Define Data Type)
		//정수 1개를 저장하기 위한 변수
		
		int a;
		
		//책 1권을 저장하기 위한 변수 선언
		//Book Class생성
		Book b;
		b = new Book();
		
		b.title="자바";
		b.company="한빛미디어";
		b.price=15000;
		b.page=700;
		
		System.out.print(b.title+"\t");
		System.out.print(b.company+"\t");
		System.out.print(b.page+"\t");
		System.out.println(b.price);
		
		PersonVO p;
		p = new PersonVO();
		
		p.name = "홍길동";
		p.age = 20;
		p.weight = 76.2f;
		p.height = 178.5f;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.print(p.height+"\t");
		
	}
}
