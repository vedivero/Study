package sec07.exam04_array_management;

public class Car {
	
	//아래 코드를 Tire[]로 선언
	//4개의 Field를  배열로 선언
	
	public Tire[] tires = {
			
			new Tire("left of Front Tire",6),
			new Tire("right Front Tire",2),
			new Tire("left of Back Tire",3),
			new Tire("right of Back",4)
	};
	
	//각 Tire의 roll()를 호출하여 각 Tire를 회전 시킨다.
	public int run(){
		
		//4개의 Tire가 모두 정상적으로 회전 시 = 0을 return
		//Tire가 펑크 나게되면 펑크 난 Tire의 순번을 return하도록 정의
		
		System.out.println("자동차가 달립니다");
	
		//대신해 for문을 사용
		for(int i = 0; i<tires.length; i++){
			//배열에서 index[i]를 하나씩 호출
			if(tires[i].roll()==false){	//tire가 펑크나면 자동차를 멈춘다.	//roll() method = boolean Type
				stop();
					//문제되는 타이어의 순번을 return, 배열은 0부터 시작하니 +1
					return (i+1); 
			}
		}
		return 0;
	}		
		
	void stop(){
		System.out.println("자동차가 멈춥니다");
		
	}
}
