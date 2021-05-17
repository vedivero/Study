package kr.tpc;

public class BookDTO {

	public String title;
	public int price;
	public String company;
	public int page;
	//배열처럼 보이나 배열은 동일한 데이터 타입이 들어가는 반면 사용자가 정의한 여러 타입의 데이터를 담을 수 있다.
	
	//디폴트 생성자 메서드가 생략되어 있다
	public BookDTO(){
		//객체를 생성하는 작업을 한다. (기계어 코드) -> 메모리에 기억공간을 생성하는 작업
		super();
	}
}
