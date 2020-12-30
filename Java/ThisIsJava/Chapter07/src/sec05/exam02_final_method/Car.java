package sec05.exam02_final_method;

//final method
public class Car {
	
	public int speed;
	
	//Field speed를 1씩 증가시키는 method
	public void speedUp(){
		speed += 1;
	}
	
	public final void stop(){
		System.out.println("Stop the Car");
		speed = 0;
	}
}
