package sec04.exam02_super;

public class SupersonicAirplane extends Airplane{

	//초음속 비행 or 일반 비행을 구분해주는 class
	
	//상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	//airplain에서 상속받은 fly() = 1;
	//ctrl+space눌러서 fly()재 정의
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
		System.out.println("초음속 비행모드로 변경합니다");
		System.out.println("초음속 비행중입니다.");
		
		System.out.println("-----------------");
		
		if(flyMode == SUPERSONIC){
			System.out.println("초음속 비행 합니다");
		}else{
			super.fly();
		}
		
	}
	
}
