package sec02.exam02_contant_field;

//상수 필드 선언
public interface RemoteControl {

	//InterFace에서 선언된 Field = Static(상수)
	//int MAX_VALUME;	//기본적으로 public static이 포함 & default가 없으므로 기본 값 부여 
	int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0;
	
	
}
