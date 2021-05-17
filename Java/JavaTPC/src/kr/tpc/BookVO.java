package kr.tpc;

public class BookVO {

	public String title;
	public int price;
	public String company;
	public int page;
	
	//디폴트 생성자 메서드가 생략되어 있다.
	public BookVO(){
		//초기화 작업
		this.title ="자바";
		this.price = 15000;
		this.company = "이지스";
		this.page = 500;
		
	}
	
	//생성자 메서드의 중복 정의(OverLoading)
	//위 메서드와 매개변수의 수가 다르다
	public BookVO(String title,int price,String company,int page){
		
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
		
	}
}
