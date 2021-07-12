package Part_3;

import java.util.*;

public class Java100_method_TwoReturn1 {

	public static int[] testMethod() {
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		return new int[] { num1, num2, num3 };
	}
	
	public static void main(String[] args) {
		
		// [1] : 배열 변수 선언 --> 메서드로 부터 반환받을 값이 배열이기 때문
		int result[] = testMethod();
		
		// [2] : 출력
		System.out.println( result[0]+" - "+result[1]); //--- 각각 출력
		System.out.println( result[0] + result[1] );	//--- 300
		System.out.println( result );  					//--- 주소 값 출력(참조형 타입은 무거워서 위치만 들고 다닌다)
		System.out.println( Arrays.toString(result) );	//--- 반복문 사용 없이, 한 번에 모든 요소를 출력 
		
	}
	
}
