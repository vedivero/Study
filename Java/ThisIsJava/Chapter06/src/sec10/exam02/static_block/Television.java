package sec10.exam02.static_block;

public class Television {

		static String company="Samsung";
		static String model = "LED";
		static String info;
		
		//1~10까지의 합을 저장하는 static field
		static int from1To10Sum; //= for문을 작성하기 어렵다
		
		//memory가 loading될 때 자동으로 실행된다.
		static{
			info = company + "-" + model;
			
			int sum = 0;
			for(int i = 1; i <=10; i++){
				sum += i;
			}
			from1To10Sum = sum;
		}
		
		//static field에서 복잡한 연산식은 static block에서 선언한다.
}
