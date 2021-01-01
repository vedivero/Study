package sec04.exam01_overriding;

public class ComputerExample {

	public static void main(String[] args) {

		
		int r = 10;
		Calculator calc = new Calculator();
		System.out.println("Calc : 원의 면적 :"+calc.areaCircle(r)); //3.14159
		
		//좀 더 정확한 계산을 위해 computer 객체를 생성해서 계산
		Computer computer = new Computer();
		System.out.println("Computer : 원의 면적 :"+computer.areaCircle(r)); //Math.PI
		
		/*Override는 상당히 많이 사용된다
		 * 	다형성 구현하는 기술로 상속,인터페이스 이용하는데 모두 Override가 사용된다.
		 */

	}

	//재 정의된 상황에서 부모 method를 호출해서 사용해야 하는 경우
	
}
