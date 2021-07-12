package Part_3;

class TestNumber {
	int num;
	TestNumber(int num) { this.num = num; }
}

public class Java100_method_MethodCall3 {

	public static void sum( TestNumber a ) {
		System.out.println( "sum() 메서드안에서의 a 값 --> "+a );  //--- a 값(TestNumber 주소)을 출력해보면 주소가 들어있음을 알 수 있다 --;;
		System.out.println( a.num );  // 100
		a.num = a.num + 400;
		System.out.println( a.num );  // 500
	}
	
	public static void main(String[] args) {
		
		// [1] : 객체 변수 선언
		TestNumber a = new TestNumber(100);
		sum( a );
		System.out.println( "-----------------------------" );
		System.out.println( a.num );  // 100 --> 500
		
	}
}