package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {

		//PowerOn method
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		//plus method
		int sum = myCalc.plus(35, 49);
		System.out.println(sum);
		
		byte x = 122;
		byte y = 102;
		
		double devide = myCalc.devide(x, y);
		System.out.println(devide);
	}

}
