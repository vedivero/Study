package chap06.sec08.exam03_method_call;

//객체 내부에서는 해당 method의 이름만 호출하면 호출이 가능하다.
//library때문에 main method는 추가하지 않는다.

public class Calculator {

	int plus(int x, int y){
		
		int result = x + y;
		
		return result;
		
	}
	
	double avg(int x , int y){
		
		double sum = plus(x,y);
		
		double result = sum / 2;
		
		return result;
	}
	
	void execute(){
		double result = avg(7,10);
		System.out.println("실행 결과 :" + result);
	}
	
	void println(String message){
		System.out.println(message);
	}
	
}
