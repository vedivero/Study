package sec08.exam02_abstract_method;

public abstract class Animal {
	
	public String kind;
	
	public void breathe(){
		System.out.println("숨을 쉽니다");
	}
	
	public abstract void sound();
		
		//동물마다 울음소리가 다르다.
		//확실히 sound가 있지만 구체적으로 정의할 수 없다
		
	}

