package sec02.exma01_inheritance;

//CellPhone의 하위 클래스, CellPhone class를 상속
public class DmbCellPhone extends CellPhone{

	int channel;
	
	//생성자
	//외부로부터 data를 받아 설정
	DmbCellPhone(String model,String color,int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb(){
		System.out.println("채널"+channel+"번 DMB방송을 수신합니다");
	}
	
	void changeChannelDmb(int channel){
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 변경합니다");
	}
	
	void turnOffDmb(){
		System.out.println("DMB방송 수신을 중단합니다");
	}
}
