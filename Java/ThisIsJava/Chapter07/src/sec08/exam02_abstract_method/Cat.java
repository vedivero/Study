package sec08.exam02_abstract_method;

public class Cat extends Animal{
	//The type Dog must implement the inherited abstract method Animal.sound()

	public Cat(){
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
	
	

	
}
