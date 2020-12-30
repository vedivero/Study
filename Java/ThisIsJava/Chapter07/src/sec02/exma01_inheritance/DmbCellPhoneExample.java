package sec02.exma01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args){
	
		DmbCellPhone dcp = new DmbCellPhone("갤럭시", "black", 73);
		
		System.out.println("모델 :"+dcp.model);
		System.out.println("채널 :"+dcp.channel);
		System.out.println("색상 :"+dcp.color);
		
		dcp.powerOn();
		dcp.powerOff();
		dcp.bell();
		dcp.sendVoice("hello");
		dcp.receiveVoice("bye");
		dcp.hangUp();
		
		dcp.turnOnDmb();
		dcp.changeChannelDmb(45);
		dcp.turnOffDmb();
	}
}
