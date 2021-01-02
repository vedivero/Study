package sec07.exam04_array_management;

public class HankookTire extends Tire{	
	//Implicit super constructor Tire() is undefined for default constructor. Must define an explicit constructor
	//Super Class에서 Parameter를 2개 받아야 하는 생성자가 있는데 
	//Super Class를 상속 받은 Sub Class에는 부모의 기본 생성자(super();)만 추가 되기 때문에
	//Sub Class에서 Super Class로 해당 Parameter를 넘겨줘야 한다
	public HankookTire(String location, int maxRotation){
	
		super(location, maxRotation);

	}

	//roll() 재 정의
	@Override
	public boolean roll() {
		
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation){
			System.out.println(location +"Hankook Tire의 수명 :"+(maxRotation-accumulatedRotation));
			return true;	//Tire사용 가능 = true
		}else{
			System.out.println("※ '"+location+"'의 Hankook Tire 펑크 발생");
			return false;	//Tire사용 불가 = false
		}
	}
	
	//roll() override
	
}
