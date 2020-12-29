package sec13.exam03_field_method_access.package1;

public class B {

	public B(){
		
		//다른 Class에서 생성된 method이므로 A부터 객체부터 생성하고 참조 변수를 사용해서 호출한다.
				
			A a = new A();
			
			a.field1 = 1;
			a.field2 = 1;
			//a.field3 = 1;
			//field3 = private = 같은 class내부에서만 사용
			
			a.method1();
			a.method2();
			//a.method3();
			//method3 = private = 같은 class내부에서만 사용
	}
}
