package sec11.exam01_Final;

public class Person {

	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn,String name){
		this.ssn = ssn;
		this.name = name;
		//nation = "America"; //The final field Person.nation cannot be assigned
	}
}
