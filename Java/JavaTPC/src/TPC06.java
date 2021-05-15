
public class TPC06 {

	public static void main(String[] args) {

		//메서드 -> 동작(method), 기능(function)
		
		int a = 67;
		int b = 98;
		// a + b = ?
		int result = sum(a,b);
		System.out.println(result);
		
		int[] arr = makeArr();
		int hap = 0;
		for(int i = 0; i<arr.length; i++){
			hap+=arr[i];
		}
		System.out.println(hap);
	}
	
	//정수 2개를 매개 변수로 받아 두 값을 더해 리턴하는 메서드 정의
	public static int sum(int a,int b /* int[] a 배열의 형태로도 가능*/){
		//static = sum이 메모리에 로드되어 있어야 main에서 호출할 수 있다.
		//		   static -> static인 경우 바로 호출
		
		 int v = a+b;
		 return v; //결과값(v)을 메서드 이름으로 전달한다.
		
	}

	//10,20,30을 return하고 싶을 때
	public static int[] makeArr(){
		
		int x = 10;
		int y = 20;
		int z = 30;
		
		//return x,y,z; -> 3개로 리턴으 불가능 -> 배열로 해결
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		return arr;
		
	}
}
