package sec08.exam01_method_declaration;

public class Calculator {

	//전원을 켜는 method - 매개값 없이 실행하는 method
	void powerOn(){
		System.out.println("Power On");
	}
	
	int plus(int x,int y){
		
		int result = x + y;
		
		return result;
	}
	
	double devide(int a,int b){
		
		
		double result = (double)a / (double)b; 
		
		return result;
	}
}
