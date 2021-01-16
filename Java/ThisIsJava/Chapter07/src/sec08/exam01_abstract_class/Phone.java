package sec08.exam01_abstract_class;

public abstract class Phone {

	//추상 클래스(Abstract Class) : 공통되는 특성을 추출한 것
	//							  개념적인 것으로 객체를 생성하지는 못함
	//								= Abstract class는 new class() = X
					
	//ex) 삼성,LG,현대   → 회사
	
	//				   Company.class
	
	//				↗		 ↑		   ↖
	//					   (상 속 )
	//	Samsung.class	  LG.class	   Hyundai.class
	
	
	//				※ 실체 클래스의 공통된 필드와 메소드의 이름을 통일할 목적
	//					실체 클래스마다 필드와 메소드가 제 각기 다른 이름을 가질 수 있다.
	//				※ 실체 클래스를 작성할 때 시간을 절약   
	//					실체 클래스는 추가적인 필드와 메소드만 선언하면 된다	

	//ex) Phone의 공통된 특성	= 	전원 (trunOn())
	
	//Field
	//소유자
	public String owner;
	
	//Constructor
	//소유자 정보를 외부에서 받아 초기화
	public Phone(String owner){
		this.owner = owner;
	}
	
	//method - phone의 공통된 특성 
	public void turnOn(){
		System.out.println("폰 전원을 켭니다");
	}
	
	//method - phone의 공통된 특성 
	public void turnOff(){
		System.out.println("폰 전원을 끕니다");
	}
	
}
