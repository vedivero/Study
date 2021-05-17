import kr.tpc.*;

//객체생성과정
public class TPC11 {

	//모델링
	//객체의 속성 : 제목,출판사,저자,가격,페이지수,이미지,두께,무게,재질
	//			(모델링) = 필요한 속성만 추출
	//			-> 제목,가격,출판사,페이지 수
	
	//객체생성
	//메모리에 기억공간을 할당
	
	public static void main(String[] args) {
		
		//책 1권을 저장하기 위한 [객체 생성]
		BookVO b = new BookVO();
		
		b.title="스프링";
		b.price=20000;
		b.company="토비";
		b.page=500;
		
		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
		
	}

}
