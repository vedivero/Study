package sec07.exam04_array_management;

public class CarExample {

	public static void main(String[] args) {

		//Car를 사용해야 하므로 Car객체를 생성
		Car myCar = new Car();
		
		for(int i=0; i<=5; i++){
			
			//Car Class에서 Tire의 상태를 return해주는 method값을 variable에 저장
			//0~4의 숫자 중 하나가 대입
			int problemLocation = myCar.run();	//run()는 문제가 발생한 tire를 return (1~4)
			
			//문제가 생긴 Tire의 숫자가 switch문 안으로 대입
			
//			switch(problemLocation){
//				
//				case 1:
//					System.out.println("Left of Front : HankookTire로 교체");
//					myCar.frontLeftTire = new HankookTire("Left of front,",15);
//					break;
//				case 2:
//					System.out.println("Right of Front : HankookTire로 교체");
//					myCar.frontLeftTire = new HankookTire("Right of front,",13);
//					break;
//				case 3:
//					System.out.println("Left of Back : HankookTire로 교체");
//					myCar.frontLeftTire = new HankookTire("Left of Back,",14);
//					break;
//				case 4:
//					System.out.println("Right of Back : HankookTire로 교체");
//					myCar.frontLeftTire = new HankookTire("Right of Back,",17);
//					break;
//			}
			
			//4개의 tire가 펑크나지 않고 제대로 굴러갔으면 0을 return
			//problemLocation이 0이 아니라는 것은 = Tire에 문제 발생
			
			if(problemLocation != 0){ 	//펑크난 tire가 있을 경우 if문 안에서 Code를 실행하게 된다.
				
				//교체할 Tire정보
				System.out.println(myCar.tires[problemLocation-1].location + "HankookTire로 교체");
				
				//실제 교체 Code , SubClass가 SuperClass로 Type 변환
				myCar.tires[problemLocation-1] = new HankookTire(myCar.tires[problemLocation-1].location,152);
			}
			
			System.out.println("------------------------------");
		}

	}
	
}