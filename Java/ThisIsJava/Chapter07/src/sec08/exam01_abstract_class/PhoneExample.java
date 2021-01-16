package sec08.exam01_abstract_class;

//Abstract Phone을 사용하기 위한 Class
public class PhoneExample {

	public static void main(String[] args) {

		//Phone phone = new Phone(); //객체 생성 불가
									 //abstract 추상 클래스는 Super Class로만 사용 가능
		
		//Phone을 inheritance하는 SubClass의 객체를 생성해서 실행
		SmartPhone smartphone = new SmartPhone("홍길동");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		
	}

}
