package chap06.sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args){
	//반지름 구하기
	double result1 = 10 * 10 * Calculator.pi; /*Math.PI; //표준 API에 있는 것*/

	int result2 = Calculator.plus(10, 5);
	
	int result3 = Calculator.minus(10, 5);
	
	System.out.println("result1 :" + result1);
	System.out.println("result2 :" + result2);
	System.out.println("result3 :" + result3);
	}
}
