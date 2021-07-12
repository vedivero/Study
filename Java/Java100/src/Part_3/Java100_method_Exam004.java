package Part_3;

//메서드는 ("korea") 입력시 대문자로 출력되도록 구현
public class Java100_method_Exam004 {

	public static String capitalMethod( String str ) {
		// 문자열 변수 선언
		String ret = str.toUpperCase();
		return ret;
	}
	
	public static void main(String[] args) {
		
		// [1] : 반환값 --> O 		받는 인자값 --> O 
		// 반환값이 있다는 것은 메서드(함수) 호출에 따른 리턴되는 값이 '있다'는 것이므로 호출시 리턴값을 받는 변수를 정의한다.
		// 문자열 변수 선언
		String rst;
		rst = capitalMethod( "korea" );
		
		// [2] : 출력
		System.out.println( "입력한 소문자의 대  문자는 = "+ rst );		
		
	}
	
}
