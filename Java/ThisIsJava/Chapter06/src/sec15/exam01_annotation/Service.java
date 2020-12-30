package sec15.exam01_annotation;

import java.lang.annotation.*;

//class에 anntation을 넣을경우
//@PrintAnnotation	→ annotation의 적용 대상을 method로 했으므로 error출력 
//									(@Target({ElementType.METHOD}))
public class Service {
	
	//method를 3개 선언

	//method1() 이외, [method1]이 실행되도록 하기 위한 설정
	@PrintAnnotation
	public void method1(){
		System.out.println("실행 내용1");

	}
	
	// ("-") dash대신 ("*") asterisk가 출력되게 하기위한 설정
	@PrintAnnotation("*")
	public void method2(){
		System.out.println("실행 내용2");
	}
	
	//2개의 element값 주기 위한 설정
	@PrintAnnotation(value="#", number=20)
	public void method3(){
		System.out.println("실행 내용3");
	}
}
