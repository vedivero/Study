package kr.tpc;

public class MemberVO {

	//잘못된 data가 들어갈 위험이 크다.
//	public String name;
//	public int age;
//	public String tel;
//	public String addr;

	//Data를 넣어 이동하는게 목적인데 접근이 가능하지 않다.
	//다시 public으로 바꾸는 건  X
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	public MemberVO(){
		
	}
	
	//setter , getter method
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
	
	
}
