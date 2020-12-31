package sec07.exam02_promotion_accsess;

public class ChildExample {

	public static void main(String[] args){
		
		Child child = new Child();
		
		//SuperClass Type으로 변환
		Parent parent = child;
		
		//Child에는 없는 method이므로 Parent의 method1이 호출
		parent.method1();

		//Child에서 재 정의된 method이므로 Type변환이 되더라도, '재 정의된 method가 호출'
		parent.method2();
		
		//Parent에는 없고 Child에만 있는 method이기에 사용 불가
		//parent.method3();
		
	}
}
