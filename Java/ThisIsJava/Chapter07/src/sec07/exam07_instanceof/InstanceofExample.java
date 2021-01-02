package sec07.exam07_instanceof;

public class InstanceofExample {

	//Parent의 SubClass도 Parameter로 대입 가능
	public static void method1(Parent parent){

		//변환하기 전에 parent가 참조하는 객체가 Child로 부터 만들어진 Class 객체인지를 검사
		if(parent instanceof Child){
		
			//parent에 대입된 객체를 강제 변환
			Child child = (Child)parent;
			//Child가 아닌 다른 객체가 들어오면 'Class Casting Exception'이 발생
			
			System.out.println("method1() : Child로 변환 성공");
		}else{
		System.out.println("method1() : Child로 변환 실패");
		}
	}
	
	public static void main(String[] args) {

		//Test하기
		Parent parentA = new Child();
		method1(parentA);
		
		//Test2
		Parent parentB = new Parent();
		method1(parentB); 
	}

}
