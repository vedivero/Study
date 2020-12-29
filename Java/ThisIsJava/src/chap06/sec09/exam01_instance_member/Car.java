package chap06.sec09.exam01_instance_member;

public class Car {

	//field선언
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
		//외부에서 받은 값을 model에 저장하기 위해 'this'를 붙여 instance멤버임을 나타낸다.
	}
	
	void setSpeed(int speed){
		//speed = speed; //실행 우선순위 = 매개 변수 > 필드
				     	 //매개 변수값을 매개 변수에 넣는 코드가 된다.
		this.speed = speed;
	}
	
	void run(){
		for(int i = 0; i<= 50; i+=10){
			this.setSpeed(i);	//Car객체에 인스턴스임을 명확하게 선언하기 위해 this를 붙힐 수 있다.(생략해도 된다)
			System.out.println(this.model+"가 달립니다.(시속:"+speed+"km/h)");
		}
	}
	
}