package sec07.exam02_promotion_accsess;

public class ChildExample {

	public static void main(String[] args){
		
		Child child = new Child();
		
		//SuperClass Type으로 변환(Type만 변환, 같은 객체(Child)를 가리키고 있다.)
		Parent parent = child;
		
		//Super Class Parent의 method1이 호출
		parent.method1();

		//Type변환이 되더라도 Child에서 재 정의된 method가 호출★★★
		parent.method2();
		
		//Parent Type에는 없는 method, Child에만 있는 method이기에 호출 불가
		//parent.method3();		
		
	}
}
