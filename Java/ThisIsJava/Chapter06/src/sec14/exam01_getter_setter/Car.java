package sec14.exam01_getter_setter;

public class Car {

	private int speed;
	private boolean stop;
	
	
	//getter
	public int getSpeed(){
		return speed;
	}
	
	public boolean isStop(){
		return stop;
	}
	
	//setter
	public void setSpeed(int speed){	//외부에서 value를 전달받아
		
		//유효성 검사
		//speed가 0이거나 음수값이 들어오면 0으로 setting
		if(speed<0){
			this.speed = 0;
		}else{
			this.speed = speed;	//speed는 0 or 양수의 값만 가지게 된다.
		}
		
	}
	
	public void setStop(boolean stop){
		this.stop = stop;
		
		//car class에서 유효성 검사
		if(stop == true){
			speed = 0;
		}
			
	}
}
