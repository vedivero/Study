package sec06.exam01_protected_packge2;

import sec06.exam_protected_package1.*;

public class D extends A{
	//D생성자 호출
	public D(){
		super();
		this.field="value";	//A class에서 protected로 선언된 field를 상속
		
		//method
		this.method();
		
		//결론 : protected는 다른 클래스라도 하위 클래스면 사용이 가능하다.
	}
}
