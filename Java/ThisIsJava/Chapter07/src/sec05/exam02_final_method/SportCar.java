package sec05.exam02_final_method;

public class SportCar extends Car{

	//car +=1 / SpotsCar +=10

	//alt + shift + v
	@Override
	public void speedUp() {
		speed += 10;
	}

	//public void stop(){
		//error message : Cannot override the final method from Car
	//}
	
		
	
	
}
