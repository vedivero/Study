
public class TPC09 {

	public static void main(String[] args){
		int a = 56;
		int b = 40;
		//a+b = 
		//int v = sum(a,b); //Cannot make a static reference to the non-static method sum(int, int) from the type TPC09
		
		//객체를 생성해 메모리에 로드
		TPC09 tpc = new TPC09();
		
		int v = tpc.sum(a,b);
		System.out.println(v);
		
	}
	
	public int sum(int a, int b){
		
		int v = a+b;
		return v;
		
	}
}
