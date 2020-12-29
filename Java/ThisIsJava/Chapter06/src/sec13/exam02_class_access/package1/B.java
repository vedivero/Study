package sec13.exam02_class_access.package1;

public class B {

	//public A(boolean b){} ← public이므로 접근 가능
	A a1 = new A(true);
	
	//A(){} ← default이므로 접근 가능
	A a2 = new A();
	
	//private A(String s){} - private으로 선언됐으므로 접근 불가
	// (x) A a3 = new A("String");
	
}
