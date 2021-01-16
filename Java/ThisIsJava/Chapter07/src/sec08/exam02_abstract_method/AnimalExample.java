package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		
		Cat cat = new Cat();
		
		//재 정의된 method가 호출
		dog.sound();
		cat.sound();
		System.out.println("--------------");
		
		Animal animal = null;
		
		//자식 객체를 만들어서 부모 타입 변수에 대입 → 자동 타입 변환
		animal = new Dog();
		
		//자식 객체가 부모 타입으로 자동 변환된다 하더라도
		//method가 재 정의되면 재 정의된 method가 호출된다.
		animal.sound(); 
		
		System.out.println("--------------");
		
		animal = new Cat();
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
		
	}

	public static void animalSound(Animal animal){
									//매개 변수가 클래스타입 = 모든 자식 객체가 올 수 있다.(Dog/Cat)
									//매개변수의 다형성
		//추상 method인 sound를 호출
		animal.sound();
		
		
	}
}
