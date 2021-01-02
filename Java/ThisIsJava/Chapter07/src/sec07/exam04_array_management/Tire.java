package sec07.exam04_array_management;

//기본 Tire
public class Tire {

	//Tire의 최대 회전수를 저장 = Tire의 수명
	public int maxRotation;
	
	//누적 회전 수	(누적 회전 수 = 최대 회전 수 → Tire교체)
	public int accumulatedRotation;
	
	//Tire의 위치
	public String location;
	
	//Tire의 위치와 회전수를 외부로 부터 받아 정의
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//Tire가 굴러가는 method
	public boolean roll(){
		//return type을 boolean으로 준 이유
		//accumulatedRotation이, maxRotation이 되지 않은 경우 = 사용가능 → True return
		
		//바퀴가 회전할 때 마다accumulatedRotation의 값을 증가
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation){
			System.out.println(location +"Tire의 수명 :"+(maxRotation-accumulatedRotation));
			return true;	//Tire사용 가능 = true
		}else{
			System.out.println("※ '"+location+"'에 Tire 펑크 발생");
			return false;	//Tire사용 불가 = false
		}
	}
	
}
