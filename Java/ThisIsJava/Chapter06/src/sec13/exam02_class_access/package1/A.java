package sec13.exam02_class_access.package1;

public class A {
	
	//public A(boolean b){} ← public이므로 접근 가능
	A a1 = new A(true);
	
	//A(){} ← default이므로 접근 가능
	A a2 = new A();
	
	//private A(String s){} - 같은 class내에 있기 때문에 private도 접근 가능
	A a3 = new A("String");
	
	
	
	//public Constructor
	public A(boolean b){}
	
	//default Constructor
	A(){}
	
	//private Constructor - 해당 method가 선언된 Class내부에서만 호출이 가능
	private A(String s){}
}
