package Part_3;

public class Java100_method_ExamStatic2 {

	public void helloWorld() {
		System.out.println( "Hello, World~" );
	}
	
	public static void main(String[] args) {
		
		// [1] : 메서드 호출
		// helloWorld();  //--- 메인 메서드는 static 메서드만 호출할 수 있기 때문에 에러 --;;
		
		// [2] : 객체 생성 후 메서드 호출   <-> static은 객체 생성없이 접근해서 사용 가능 ( 클래스명.메서드명();)
		Java100_method_ExamStatic2 jes = new Java100_method_ExamStatic2();
		jes.helloWorld();
		
	}
	
}
