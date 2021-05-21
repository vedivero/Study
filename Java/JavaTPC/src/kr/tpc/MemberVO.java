package kr.tpc;

public class MemberVO {

	//잘못된 data가 들어갈 위험이 크다.
//	public String name;
//	public int age;
//	public String tel;
//	public String addr;

	//Data를 넣어 이동하는게 목적인데 접근이 가능하지 않다.
	//다시 public으로 바꾸는 건  X
	
	//1.모든 정보는 정보은닉
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	//2. 사용하든 안하든 디폴트 생성자를 명시적으로 만든다.
	public MemberVO(){
		
	}
	
	//3. 생성자를 위해 초기화를 해준다.
	public MemberVO(String name, int age,String tel, String addr){
		this.name = name;			
		this.age = age;				
		this.tel = tel;
		this.addr = addr;			//오버로딩 생성자를 만들어 초기화
	}								//객체 생성작업은 생성자 내부에서 JVM이 자동으로 처리
	
	//4.setter , getter method 생성
	//외부로 부터 data를 받아 자기 자신의 멤버변수의 값에 넣는 역할
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	//5.객체가 가지고 있는 값 전체를 출력하기위한 method
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
}
