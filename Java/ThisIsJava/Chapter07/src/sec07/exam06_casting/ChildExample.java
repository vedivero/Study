package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {

		Parent parent = new Child();
		
		//Child가 상속받은 Parent에 정의된 field,method사용 가능
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//Child Class에 field,method 사용 불가
		//parent.field2 = "data2";
		//parent.method3();
		
		//field2와 method3() 사용 방법 = 강제 변환
		Child child = (Child)parent;
		
		child.field2 = "data2";
		child.method3();
	}

}
