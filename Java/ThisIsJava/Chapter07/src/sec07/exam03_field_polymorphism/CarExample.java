package sec07.exam03_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {

		//Car를 사용해야 하므로 Car객체를 생성
		Car car = new Car();
		
		for(int i=0; i<=5; i++){
			int problemLocation = car.run();	//punk난 Tire의 value가 저장
			switch(problemLocation){
				
				case 1:
					System.out.println();
					car.frontLeftTire = new HankookTire("frontLeftTire",15);
					break;
				case 2:
					System.out.println();
					car.frontRightTire = new KumhoTire("frontrightTire",13);
					break;
				case 3:
					System.out.println();
					car.backLeftTire = new HankookTire("backLeftTire",14);
					break;
				case 4:
					System.out.println();
					car.backRightTire = new KumhoTire("backrightTire",17);
					break;
			
			}
			System.out.println(" - - - - - - - - - - - - - - - - - - - - - -");
			
		}
	}
}