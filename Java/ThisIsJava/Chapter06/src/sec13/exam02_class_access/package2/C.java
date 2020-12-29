package sec13.exam02_class_access.package2;

import sec13.exam02_class_access.package1.*;

public class C {

	//public A(boolean b){} ← public이므로 접근 가능
	A a1 = new A(true);
	
	//A(){} ← default는 같은 package내에서만 호출 가능
	// (x) A a2 = new A();
	
	//private A(String s){} - 다른 package, 다른 class이므로 호출 불가
	// (x) A a3 = new A("String");
	
}
