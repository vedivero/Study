package Part_2;

public class Basic004_switch {
public static void main(String[] args) {
		
		// [1] : 변수 선언
		int age = 14;
		
		// [2] : 사용자 입력 예외처리
		if ( age > 10 && age < 20 ) {  //--- 11~19
			age = 10;
			// System.out.println( "10이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다." );
			// System.exit(0);
		}
		else if ( age > 20 && age < 30 ) {  //--- 21~29
			System.out.println( "20이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다." );
			System.exit(0);
		}
		else if ( age > 30 && age < 40 ) {  //--- 31~39
			System.out.println( "30이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다." );
			System.exit(0);
		}
		else if ( age > 40 && age < 50 ) {  //--- 41~49
			System.out.println( "40이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다." );
			System.exit(0);
		}
		else if ( age > 50 && age < 60 ) {  //--- 51~59
			System.out.println( "50이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다." );
			System.exit(0);
		}
		else {
			if ( age < 10 ) {
				System.out.println( "최소 10 이상만 입력해주세요. 프로그램을 종료합니다." );
				System.exit(0);
			}
		}
		
		
		// [3] : switch 조건문
		// 변수 조건은 정수형이어야 한다. --> byte, short, int --> 그러나 long 타입은 X --> 그러나 char 타입은 O  --> 'A'
		// break, default 빼먹지 않도록 주의~!!
		switch( age ) {
			case 10:
				System.out.println( age+ "대 입니다. 참고서 코너는 A 구역입니다." );
				break;
			case 20:
				System.out.println( age+ "대 입니다. 취업 서적 코너는 B 구역입니다." );
				break;
			case 30:
				System.out.println( age+ "대 입니다. 자기 계발 코너는 C 구역입니다." );
				break;
			case 40:
				System.out.println( age+ "대 입니다. 재테크 코너는 D 구역입니다." );
				break;
			case 50:
				System.out.println( age+ "대 입니다. 재취업 코너는 E 구역입니다." );
				break;
			default:
				System.out.println( "60대 이상입니다. 건강/장수 코너는 F 구역입니다." );
				break;
		}
		
	}
















}
