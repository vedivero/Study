package sec07.exam02_promotion_accsess;

//Parent Class를 inheritance
public class Child extends Parent {

	//Super Class의 method2()를 재 정의
	@Override
	public void method2() {
		System.out.println("Child method2()");
	}
	
	//새로운 method정의
	public void method3(){
		System.out.println("Child method3()");
	}

 }
