package sec08.exam01_method_declaration;

public class ComputerExample {

	public static void main(String[] args) {

		//매개 변수로 배열값을 넘겨주는 방법
		
		//sum1 method
		//미리 배열을 생성하고 매개 변수로 배열을 주는 방법
		Computer myCom = new Computer();

		int[] values = {1,2,3};
		int result1 = myCom.sum1(values);
		
		System.out.println("result1 :" + result1);
		
		
		//sum2 method
		//메소드를 호출할 때 전달해줄 매개값으로 배열을 생성해서 전달하는 방법
		int result2 = myCom.sum1( new int[] {1,2,3});
		System.out.println("result2 :" + result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3 :" + result2);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 :" + result4);
				
	}

}
