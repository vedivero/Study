package sec03.exam01_parent_constructor_call;

//People이라는 부모 class를 상속받는 class
public class Student extends People{
	public int studentNo;
	//Implicit super constructor People() is undefined for default constructor.
	//Must define an explicit constructor
	//compiler가 부모의 기본 생성자를 호출했지만 없기 때문에 compile하지 못했다.
	
	//컴파일러는 기본적으로 
	//public Student(){
	// 		super(); //기본 생성자를 호출하지만 해당 기본 생성자가 없기에 컴파일 에러 발생
	//}
	
	//명시적으로 부모 생성자의 매개값을 확인해서 작성
	public Student(String name,String ssn,int studentNo){
		//super("홍길동","123123-123123");
		super(name,ssn);
		this.studentNo = studentNo;
		System.out.println("2 :create SubClass Constructor");
	}
}
