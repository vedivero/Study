package Part_2;

public class Basic002_if {

	public static void main(String[] args) {

		//[1] : 변수 선언
		int kor=80, eng=90, math=100;
		
		//[2] : if조건문만 사용하기
		if(kor>=80)
			System.out.println("당신의 국어 점수는 B학점입니다.");
		
		System.out.println("이 문구가 출력된 이유는 80점 미만이기 때문입니다.");
		System.out.println("----------------------------------");
	
	
		//[3] : if~else 조건문 사용하기
	if(eng>=90){
		System.out.println("영어 점수는 A입니다.");
		System.out.println("축하합니다");
	}else{
		System.out.println("90점 미만입니다.");
	}

	}
}
