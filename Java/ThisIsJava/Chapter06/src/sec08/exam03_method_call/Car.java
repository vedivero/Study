package sec08.exam03_method_call;

public class Car {

	int speed;
	
	int getSpeed(){
		return speed;
	}

	void keyTurnOn(){
		System.out.println("key를 돌려 전원을 켭니다.");
	}
	
	void run(){
		for(int i=0; i<=50; i+=10){
			speed = i;
			System.out.println("Car가 달립니다.(시속:"+speed+"km/h)");
		}
	}
}
