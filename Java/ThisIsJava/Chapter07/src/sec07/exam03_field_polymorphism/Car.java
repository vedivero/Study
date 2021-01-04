package sec07.exam03_field_polymorphism;

import sec07.exam04_array_management.Tire;

public class Car {
	
	//Field 4개 선언
	
	//n번 회전하면 Tire 펑크 발생 하도록 정의
	Tire frontLeftTire = new Tire("left of Front Tire",6);
	Tire frontRightTire = new Tire("right Front Tire",2);
	Tire backLeftTire = new Tire("left of Back Tire",3);
	Tire backRightTire = new Tire("right of Back",4);

	
	//각 Tire의 roll()를 호출, 각 Tire를 회전 시킨다.
	int run(){
		
		//[1] 4개의 Tire가 모두 정상적으로 회전 시 = 0을 return
		//[2] Tire가 펑크 시, 펑크 난 Tire 순번을 return하도록 정의(순번은 임의로 지정)
		
		System.out.println("자동차가 달립니다");
	
		if(frontLeftTire.roll()==false){ 
			//false가 return된 경우 = 달릴 수 없는 상태, Tire에 문제 발생	
			//false = (accumulatedRoatation == maxRotation)
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false){ 
			stop();
			return 2;
		}	
		
		if(backLeftTire.roll()==false){ 
			stop();
			return 3;
		}
		
		if(backRightTire.roll()==false){ 
			stop();
			return 4;
		}

		//5개의 숫자중 한 숫자를 return
		return 0;
		  
	}
		
	void stop(){
		System.out.println("자동차가 멈춥니다");
	}
}
