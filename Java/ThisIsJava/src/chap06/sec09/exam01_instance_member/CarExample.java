package chap06.sec09.exam01_instance_member;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car("Malibu");
		Car yourCar = new Car("Trax");
		
		myCar.run();
		yourCar.run();
	}

}
