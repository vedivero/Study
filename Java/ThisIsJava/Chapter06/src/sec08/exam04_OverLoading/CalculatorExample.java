package sec08.exam04_OverLoading;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10);
		//매개변수가 하나만 주어졌으므로 '정사각형'이 호출된다
		
		double result2 = myCalc.areaRectangle(10,20);
		//2개의 매개 변수를 가지고 있는 '직사각형'method가 호출된다.
		
		//매개변수 int 10과 20은 double type으로 변환되어 전달된다.
		
		System.out.println("정사각형의 넓이 :"+result1);
		System.out.println("직사각형의 넓이 :"+result2);
		
		//매개 변수에 따라 오버로딩된 method중 하나가 선택된다.
	}

}
