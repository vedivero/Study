package sec07.exam03_field_polymorphism;

import sec07.exam04_array_management.Tire;

public class Car {
	
	//아래 코드를 Tire[]로 선언
	//4개의 Field를 선언
	
	//6번 회전하면 Tire 펑크 발생 하도록 정의
//	Tire frontLeftTire = new Tire("left of Front Tire",6);
//	Tire frontRightTire = new Tire("right Front Tire",2);
//	Tire backLeftTire = new Tire("left of Back Tire",3);
//	Tire backRightTire = new Tire("right of Back",4);

	Tire[] tires = {
			
			new Tire("left of Front Tire",6),
			new Tire("right Front Tire",2),
			new Tire("left of Back Tire",3),
			new Tire("right of Back",4)
	};
	//각 Tire의 roll()를 호출하여 각 Tire를 회전 시킨다.
	int run(){
		
		//4개의 Tire가 모두 정상적으로 회전 시 = 0을 return
		//Tire가 펑크 나게되면 펑크 난 Tire의 순번을 return하도록 정의
		
		System.out.println("자동차가 달립니다");
	
	
		//[]선언으로 index로 사용 가능해졌으므로 삭제
//		if(frontLeftTire.roll()==false){ 
//			//false가 return된 경우 = 달릴 수 없는 상태, Tire에 문제 발생	
//			stop();
//			return 1;
//		}
//		if(frontRightTire.roll()==false){ 
//
//			stop();
//			return 2;
//		}	
//		if(backLeftTire.roll()==false){ 
//			
//			stop();
//			return 3;
//		}
//		if(backRightTire.roll()==false){ 
//		
//			stop();
//			return 4;
//		}
//		return 0;
//		//5개의 숫자중 한 숫자를 return
//		  
//	}
	
		//대신해 for문을 사용
		for(int i = 0; i<tires.length; i++){
			//한 번 돌때마다 tire를 하나씩 호출
			if(tires[i].roll()==false){	//tire가 펑크나면 자동차를 멈춘다.
				stop();
					//문제되는 타이어의 순번을 return, 배열은 0부터 시작하니 +1
					return (i+1); 
			}
		}
		return 0;
	}		
		
	void stop(){
		System.out.println("자동차가 멈춥니다");
		
	}
}
