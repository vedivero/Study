package sec04.exam01_overriding;

//Calculator를 상속하는 하위 클래시
public class Computer extends Calculator{

	//Super Class에서 정의했던 areaCircle method를 Sub Class에서 재 정의
	@Override	//super class의 해당 method를 정확히 재 정의하고 있는지 검사해주는 역할
	double areaCircle(double r){
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
