package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.setSpeed(-70);
		System.out.println("현재 속도 : "+myCar.getSpeed());

		myCar.setSpeed(60);
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		if(!myCar.isStop()){
			myCar.setStop(true);	//실행하니 stop인데도 속도가 60이 출력
									//Car class에서 유효성 검사
		}
		
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		
	}
	
}
