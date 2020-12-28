package chap06.sec08.exam02_return;

public class Car {

	//int type의 feild 연료
	int gas;
	
	void setGas(int gas){
		this.gas = gas;	//field와 매개 변수명이 동일할 경우, 우선순위 = 매개변수
						//객체 자기 자신이 가지고 있는 data 즉, field gas라는 뜻
	}
	
	//연료가 있는지 없는지에 따라 true/false를 return
	boolean isLeftGas(){
		if(gas==0){
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	//gas가 있으면 run하고, gas없으면 멈추는 method
	void run(){
		while(true){	//while은 return이나 break를 통해 멈추게 한다.
			if(gas>0){
				System.out.println("Car가 달립니다. 남은 gas량 : "+gas);
				gas -= 1;	//or gas--;
			}else{
				System.out.println("Car가 멈췄습니다. gas잔량 : "+gas);
				return;
			}
		}
		

		
		
	}
}
