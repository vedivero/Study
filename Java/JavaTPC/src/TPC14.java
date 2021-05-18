import kr.tpc.*;

public class TPC14 {

	//Class,Object, instance 상호관계
	
	//Modeling
	//객체 속성들을 나열 후, 필요한 것을 분류하는 작업

	// 객체[BookDTO b1] = new BookDTO() <- 생성자에 의해 객체 생성
	// 		-> 메모리에 공간 할당 -> 더 이상 객체가 아닌 인스턴스
	// 	= 객체 생성 후에는 객체[Object]라고 부르지 않고 instance[인스턴스]라고 지칭
	// b1이 가리키는 주소의 데이터가 있지만 우리 눈에 보이는건 b1이기 때문에 b1이 책이 된다.
	// = Instance가 생성되야 데이터를 넣고 빼고 할 수 있다.
	
	// DTO : Data Transfer Object
	// VO : Value Object			//data를 넣고 다니는 서류 가방
	
	
	public static void main(String[] args) {
		
		//책을 설계하기 -> class(BookDTO) ->객체 -> 인스턴스
		
		String title="스프링";
		int price = 25000;
		String company = "가나다";
		int page = 890;
		
		//위 4개 속성을 한 곳에 담아 이동하기
		// 배열 X (동일한 데이터 타입이 아님)
		//  = 직접 설계 = 클래스 ( BookDTO or BookVO ) -> 한 곳에 담을 바구니를 설계
		
		BookDTO dto; //dto(Object:객체) = 구체적으로 데이터를 가리키고 있지 않으므로

					//생성자 메서드
		dto = new BookDTO(title,price,company,page); // dto(Instance:인스턴스)
		
		//BookDTO에서 생성자 생성
		// 자동 : 우클릭 Source탭 = Generate Constructor using field
	
		bookPrint(dto);
	
	}

	//인스턴스 이동
	public static void bookPrint(BookDTO dto){/*책으로 넘겼으니 책으로 받기*/
		  System.out.println(dto.title);
		  System.out.println(dto.price);
		  System.out.println(dto.company);
		  System.out.println(dto.page);
		  
		  
	}
	
	//결론 : DTO = 데이터를 한 곳에 담는 '바구니','가방'
	// 		-> 가방을 다른 메서드나 클래스로 옮기기 위해 편리하게 사용하는 것
}
