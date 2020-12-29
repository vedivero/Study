package chap06.sec10.exam03_static_be_careful;

public class Car {

	//객체를 생성해서 사용해야 하는 field
	int speed;
	
	//instance method
	void run(){
		System.out.println(speed+"로 달립니다");
	}
	
	public static void main(String[] args){
		
		//static이 선언된 method에서 instance field와 method를 사용해서 error
		//speed = 60;
		//run();
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
	}
}
