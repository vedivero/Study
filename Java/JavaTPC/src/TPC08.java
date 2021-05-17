
public class TPC08 {

	public static void main(String[] args){
		
		 int a = 30;
		 int b = 50;
		 
		 int v = add(a,b);	//call static method
		 System.out.println(v);
		
	}
	
	public static int add(int a, int b){	//public int add(int a,int b) = 컴파일 에러 / 같은 static간 호출가능
		int sum = a + b;
		return sum;
	}
}
