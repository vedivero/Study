package chap06.sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {

		// ↓ compile error = private으로 선언하여 접근하지 못하게 했음
		//Singleton obj1 = new Singleton();
		
		//얻을 수 있는 방법
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		//obj1과 obj2가 참조하는 객체가 같은지 확인
		if(obj1==obj2){
			System.out.println("같은 Singleton객체 입니다.");
		}else{
			System.out.println("다릅니다");
		}
		
	}

}
