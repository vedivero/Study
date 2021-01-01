package sec04.exam02_super;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		
		//sa.fly(); //SupersonicAirplane에서 재정의 된 fly();
		sa.takeOff(); //이륙
		sa.fly(); //재 정의된 fly()
		
		//flyMode를 변경, 상수이므로 class.name으로 호출
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
