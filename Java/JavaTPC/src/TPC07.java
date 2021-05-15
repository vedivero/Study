
public class TPC07 {

	public static void main(String[] args) {

		int a = 20;
		float b = 56.7f;
		// a + b = ? 
		
		//Call by Value = 값을 parameter로 passing
		float v = sum(a,b);	
		System.out.println(v);
		
		//Call by Reference = 번지값을 전달
		//배열의 총합
		int[] arr = {1,2,3,4,5};
		
		int vv = arrSum(arr);
		System.out.println(vv);
		
	}
	public static float sum(int a, float b){
		float v = a + b;
		return v;
	}

	private static int arrSum(int[] x) {

		int hap = 0;
		for(int i = 0; i<x.length; i++){
			hap+=x[i];
		}
		
		return hap;

	}

}