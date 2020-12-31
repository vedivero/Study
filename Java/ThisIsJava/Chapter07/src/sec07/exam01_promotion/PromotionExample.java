package sec07.exam01_promotion;

public class PromotionExample {

	
	public static void main(String[] args) {
		
		//자동 타입 변환 Test
		//각 Class의 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; //참조변수 b에 들은 객체 B는 A를 상속했으므로 대입 가능
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		//B의 subClass D
		B b1 = d;
		
		//C의 sunClass E
		C c1 = e;
		
		//b와 e, c와 d는 상속관계가 아니다  Type mismatch: cannot convert from D to C
		//B b2 = e;
		//C c2 = d;
		
		/*	  ★★★★★★★★★★★★★★★★★★★★★★★★★
		 * 	 [자동 타입 변환 이후의 효과]
		 * 	
		 * 	 SubClass에서 재 정의한 method가 있을 경우
		 * 	 SuperClass의 method를 직접 호출하더라도 
		 * 	  재 정의된 method가 호출된다.
		 * 
		 * 		ex)
		 * 			//SuperClass
		 * 			class Parent{
		 * 				void method1();
		 * 			}
		 * 
		 * 			//SubClass
		 * 			class Child extends Parent{
		 * 				void method1{···} //Override
		 * 			}
		 * 
		 * 			//MainClass
		 * 			Class ChileExample{
		 * 				Child child = new Child();
		 * 				Parent parent = child()
		 * 			
		 * 				parent.method1(); //← Parent의 method1()이 아닌 
		 * 								  //  Child에서 재 정의한 method1()이 호출
		 * 			}
		 */
	}

}
