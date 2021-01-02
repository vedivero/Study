package sec07.exam05_method_polymorphism;

//Vehicle을 이용하는 Driver Class
public class Driver {

	public void drive(Vehicle vehicle){
					//Parameter에 Vehicle과 Vehicle의 SubClass도 대입될 수 있다.
		
		vehicle.run();
		
	}
	
}
