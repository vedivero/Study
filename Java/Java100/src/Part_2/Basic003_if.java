package Part_2;

public class Basic003_if {

	public static void main(String[] args) {

		//[1] : 변수 선언
		int kor=0, eng=70, math=90;
		int total_score;
		total_score = kor+eng+math;
		
		//[2] : if~else if~else 조건문 사용하기
		if(total_score>=270){
			System.out.println("축하합니다. 당신의 총점수는"+ total_score+"입니다. Great!");
			
		}else if(total_score>=240){
			System.out.println("축하합니다. 당신의 총점수는"+ total_score+"입니다.Excellent!");
			
		}else if(total_score>=210){
			System.out.println("축하합니다. 당신의 총점수는"+ total_score+"입니다.Good job!");
			
		}else{
			if(math>=60)
			System.out.printf("축하합니다. 당신의 총점수는 %d이고, 수학점수는 %d점 입니다.",total_score,math);
			
		}

	
	}
}
