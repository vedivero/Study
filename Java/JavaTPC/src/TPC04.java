
public class TPC04 {

	public static void main(String[] args){
		
		//데이터 이동, 변수와 배열의 차이
		
		int a,b,c,d,e,f,g,h,i;
		
		a=10;
		b=20;
		c=30;
		
		//3개의 data를 다른 클래스로 이동시켜 연산
		hap(a,b,c);
		
		//배열
		int[] arr;
		arr = new int[3];
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		hap1(arr);
	}
	
	public static void hap(int x , int y , int z){
		int sum = x+y+z;
		System.out.println(sum);
	}
	
	public static void hap1(int[] x){
		
		//int sum = x[0]+x[1]+x[2];
		
		//배열은 반복문을 사용해 data추출
		int sum = 0;
		for(int i=0; i<x.length; i++){
			sum += x[i];
			
		}
		System.out.println(sum);
			
		}
		
		
	}
	

