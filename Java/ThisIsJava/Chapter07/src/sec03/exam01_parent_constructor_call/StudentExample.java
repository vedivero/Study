package sec03.exam01_parent_constructor_call;

public class StudentExample {

	public static void main(String[] args) {

		Student student = new Student("홍길동","123123-123456",3);
		//상속에서 하위 객체를 만들게 되면 부모 객체부터 생성되고, 자식 객체는 그 후에 생성
		
		//생성자 호출 순서
		/*	1.부모 생성자 호출
		 * 		public People(String name, String ssn){
		 * 			this.name = name;
		 * 			this.ssn = ssn;
		 * 		}
		 * 
		 * 		실행이 완료된 후
		 * 
		 * 	 2.자식 생성자 호출
		 * 		public Student(String name, String ssn, int studentNo){
		 * 			super.(name,ssn);
		 * 			this.studentNo = studentNo;
		 * 		}
		 */
		
			//SuperClass가 갖고 있는 field 
			System.out.println("name : "+student.name);
			System.out.println("ssn : "+student.ssn);
		
			//자신이 갖고 있는 field = StudentNo
			System.out.println("StudentNo : "+student.studentNo);
			
			/*1.name과 ssn은 Student class의 생성자에 대입이 되고
			 * 
			 *2.자식 생성자 안에 명시적으로 선언한 부모 생성자 (super(name,ssn))에 대입되고
			 *3.부모 생성자에 입력받은 name과, ssn이 들어와서 field에 설정된다.
			 */
	}

}
