package sec04.exam01_overriding;

public class Calculator {
	
	//원의 넓이를 구하는 method를 정의, 매개변수=반지름
	double areaCircle(double r){
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159* r * r;
	}
}
