package sec03.exam01_parent_constructor_call;

//생성자 호출
public class People {

	public String name;
	public String ssn;
	
	//기본 생성자가 아닌 외부로 부터 값을 초기화하는 생성자
	public People(String name,String ssn){
		this.name = name;
		this.ssn = ssn;
		System.out.println("1: create super class");
	}
}
