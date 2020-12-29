package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.*;

public class C {

	public C(){
		A a = new A();
		
		a.field1 = 1;
		//a.field2 = 1;	//filed2 = default = 같은 package내에서만 사용 가능
		//a.field3 = 1;
		
		a.method1();
		//a.method2();
		//a.method3();
	}
}
