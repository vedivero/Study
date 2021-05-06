import java.io.*;

public class OthersOOP {

	public static void main(String[] args) throws IOException {

//		객체지향 프로그래밍
//
//		메소드 - 다른 컴퓨터 언어에서 ‘메서드’,‘펑션’,서브루틴‘,’프로시져럴‘이라 부름
//
//		한국어로는 절차지향 프로그래밍 영어로는 procedural programming,
//
//		객체지향은 method를 이용해서 작은 부품을 만들고, 부품 하나하나를 결합해서
//		더 큰 프로그램을 만든다.
//
//		몇몇 개발자들은 메서드만으로 프로그램을 만들기엔 부족해서
//		클래스로 공통된 메서드를 묶었다.


		//수학과 관련된 클래스, Math
		//class: System,Math,FileWriter
		//instance : f1, f2 가 가리키고 있는 값
		System.out.println(Math.PI);
		
		//내림
		System.out.println(Math.floor(1.8));
		
		//올림
		System.out.println(Math.ceil(1.8));
		
		// ↑ 필요할 때 마다 가져다 쓰면 되는 Class
		
		
		//같은 주제를 갖고 있는 변수와 메서드를 Grouping = Class
		
		//어떤 정보를 파일에 기록할 때 사용하는 Class
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" Java");
		f2.close();
		
		f1.write("!!!");
		f1.close();
		
	}

}
