package chap06.sec10.exam04_singleton;

public class Singleton {

	
	//private으로 static field를 선언, 자기 자신의 type으로 field를 선언
	private static Singleton singleton = new Singleton(); //자기 자신 내부에서는 생성자를 사용 가능
	
	
	
	//필요한 초기화 코드를 넣는 block
	private Singleton(){	//private이므로 외부에서 new연산자로 호출 불가
		
	
	}
	
	//외부에서 호출할 수 있는 static method를 생성
	//return이 아무리 많이 되어도 항상 'singleton'이 return = 한 개의 객체만 만들어서 사용
	static Singleton getInstance(){
		
		//자기 자신의 객체가 담긴 변수를 return해준다
		return singleton;	
		
		
	}
}
