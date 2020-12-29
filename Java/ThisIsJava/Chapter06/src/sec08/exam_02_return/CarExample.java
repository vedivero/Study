package sec08.exam_02_return;

public class CarExample {

	public static void main(String[] args){
		Car myCar = new Car();
				
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState){
			System.out.println("출발합니다");
			myCar.run();
		}
		
		if(myCar.isLeftGas()){ //method를 호출해서 해당 method의 return값이 boolean일 경우 if()안에 사용 가능
			System.out.println("gas가 충분합니다");
		
		}else{
			System.out.println("gas를 주입 하세요");
		}

	}
}