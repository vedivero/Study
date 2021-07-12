package Part_3;

import java.util.*;

public class Java100_method_TwoReturn2 {
	
	public static String[] capitalMethod( String a, String b ) {
		String a_ = a.toUpperCase();
		String b_ = b.toLowerCase();
		
		// 리턴값 2개를 저장할 배열 변수 선언
		String[] ret = { a_, b_ };
		return ret;
	}
	
	public static void main(String[] args) {
		
		// [1] : 반환값 --> O 		받는 인자값 --> O 
		// 반환값이 있다는 것 --> 메서드(호출) 호출에 따른 리턴값이 있다는 것 --> 호출부에서 리턴값을 받는 변수 정의.
		String[] result = capitalMethod( "korea", "USA" );
		
		// [2] : 출력
		// System.out.println( result );  	//--- 주소 값 출력
		System.out.println( result[0] );  	// KOREA
		System.out.println( result[1] );  	// usa
		System.out.println( result[0] +" - "+ result[1] );
		System.out.println( Arrays.toString(result) );
		
	}
}
