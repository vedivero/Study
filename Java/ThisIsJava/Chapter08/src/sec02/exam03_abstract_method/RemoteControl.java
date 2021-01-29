package sec02.exam03_abstract_method;

//추상 메소드 선언
public interface RemoteControl {

	int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0;

	//인터페이스에서는 추상 메소드로 선언되어야 한다. (실행 블록이 없는 상태로 끝내기)

	void turnOn();	//public abstract가 compile시 자동으로 작성된다.
	void turnOff();
	void setVolume(int volume);
	
}
