package sec13.exam03_field_method_access.package1;

public class A {
	
	public int field1;
	
	int field2;
	
	private int field3;
	
	
	
	public void method1(){
		field1 = 1;
		field2 = 1;
		field3 = 1;
		//public, default, private 같은 class내이기 때문에 접근 가능
	}
	
	void method2(){
		method1();
		method2();
		method3();
		//같은 class내이기 때문에 모든 method 호출 가능
	}
	
	private void method3(){
		
	}
}
