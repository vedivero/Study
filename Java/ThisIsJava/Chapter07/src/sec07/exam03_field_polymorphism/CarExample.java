package sec07.exam03_field_polymorphism;

public class CarExample {

	public static void main(String[] args) {

		//Car를 사용해야 하므로 Car객체를 생성
		Car myCar = new Car();
		
		for(int i=0; i<=5; i++){
			
			//Car Class에서 Tire의 상태를 return해주는 method값을 variable에 저장
			//0~4의 숫자 중 하나가 대입
			int problemLocation = myCar.run();
			
			//문제가 생긴 Tire의 숫자가 switch문 안으로 대입
			switch(problemLocation){
				
				case 1:
					System.out.println("Left of Front : HankookTire로 교체");
					myCar.frontLeftTire = new HankookTire("Left of front,",15);
					break;
				case 2:
					System.out.println("Right of Front : HankookTire로 교체");
					myCar.frontLeftTire = new HankookTire("Right of front,",13);
					break;
				case 3:
					System.out.println("Left of Back : HankookTire로 교체");
					myCar.frontLeftTire = new HankookTire("Left of Back,",14);
					break;
				case 4:
					System.out.println("Right of Back : HankookTire로 교체");
					myCar.frontLeftTire = new HankookTire("Right of Back,",17);
					break;
			}
			System.out.println("------------------------------");
		}
	}

}
