package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args){
		
		Driver driver = new Driver();
		
		//vehicle의 SubClass
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//SubClass에서 재 정의한 run()이 실행
		driver.drive(bus);
		driver.drive(taxi);
		
	}
}
