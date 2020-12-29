package sec11.exam01_Final;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("999999-1111111","홍길동");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";	    //The final field Person.nation cannot be assigned
		//p1.ssn = "123123-2222222";	//The final field Person.nation cannot be assigned
		p1.name = "임꺽정";	//final field가 아니므로 data변경 가능
		
	}

}
