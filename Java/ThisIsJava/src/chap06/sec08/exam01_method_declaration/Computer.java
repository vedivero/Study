package chap06.sec08.exam01_method_declaration;

public class Computer {

	//해당 method가 몇 개의 매개변수를 return해야할지 정확하지 않은 경우
	//(2개가 들어올 수도 있고 10개가 들어올 수도 있고)
	
	int sum1(int[] values){
	
		int sum = 0;
		for(int i = 0; i<values.length; i++){
			sum += values[i];
		}
		
		return sum;
	}
	
	
	
	int sum2(int ... values){
		
		int sum = 0;
		for(int i=0; i<values.length; i++){
			sum += values[i];
		}
		return sum;
	}
}
