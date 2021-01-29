package sec02.exam04_defualt_method;

//default 메소드 선언
public interface RemoteControl {

	int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0;


	void turnOn();	//public abstract가 compile시 자동으로 작성된다.
	void turnOff();
	void setVolume(int volume);
	
	//default method는 default keyword를 사용해야 한다.
	//JAVA8에서는 default를 추가적으로 작성할 수 있도록 한다.
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음  처리합니다");
		} else {
			System.out.println("무음 해제합니다");
		}
	
	}
	
}
