import kr.tpc.*;

public class TPC13 {

	//private 생성자 메서드(Constructor)
	
	/*
	객채생성에 관여하는 생성자 메서드가 private접근제어를 가지면
	객체를 생성할 수 없다
	-> 객체를 생성하지 않고도 사용가능 해야 된다.
	(모든 클래스의 멤버가 ststic멤버가 되어야 한다)
	*/
	
	//static 
	//  = 객체를 생성하지 전, method area static zone에 자동으로 로드
	
	//인스턴스 메서드 = 객체 생성 후 접근 가능한 메서드(static이 없는 메서드)
	//			-> 기본 생성자가 private일 때 접근 불가
	
	//클래스 메서드 = static이 있는 메서드
	//			-> 객체 생성 없이 접근 가능 ( 클래스 이름으로 접근)

	//			클래스이름.클래스메서드(static 메서드)
	//			-> 자주 사용하는 객체나 동작은 static 멤버로 만든다 ( System )
	
	//모든 멤버가 static멤버이면 인위적으로 private 생성자를 만들어 객체 생성을 막을 수 있다.
	public static void main(String[] args){
		
		//private 생성자에 의해 접근 불가
		//Inflearn inf = new Inflearn(); //The constructor Inflearn() is not visible
		
		//inf.tpc();
		 
		//The static method java() from the type Inflearn should be accessed in a static way
	    //접근 방법이 불완전하다 
		//inf.java();	
		 
		 //클래스 이름으로 접근
		 Inflearn.java();	//객체생성이 불필요
		 
		 
		 
	}
	
}
