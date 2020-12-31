package sec06.exam01_protected_packge2;

import sec06.exam_protected_package1.*;

public class C {

	public void method(){
		
		//A a = new A();	//The constructor A() is not visible
						//Protected로 선언된 Constructor
		//a.field = "value";	//Protected로 선언된 Filed
		
		//a.method();
		
		//A에서 선언된 Protect =A class의 subClass가 되면 사용 가능하다
	}
}
