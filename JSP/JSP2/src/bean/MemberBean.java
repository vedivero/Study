package bean;

public class MemberBean {

	//jsp에서 data의 내용를 자동으로 자바에다가 넣어주기 위해서 사용하는 Bean
	
	//data를 은닉하기 위해 private
	//tag의 name과, 변수명을 일치시켜야 mapping이 된다.
	
	private String id;
	private String pass1;
	private String email;
	private String tel;
	private String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass1() {
		return pass1;
	}
	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
