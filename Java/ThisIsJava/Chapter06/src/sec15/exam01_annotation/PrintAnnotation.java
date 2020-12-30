package sec15.exam01_annotation;

import java.lang.annotation.*;


//PrintAnnotation은 Method선언에만 적용할 수 있다는 설정
@Target({ElementType.METHOD})	

//annotataion의 정보를 언제까지 유지할 것인지를 설정
@Retention(RetentionPolicy.RUNTIME)

//적용할 수 있는 대상
public @interface PrintAnnotation {

	//Element선언
	//type이 String인 value라고하는 annotation
	String value() default "-";
	
	//해당 문자 ( "-" )를 몇 번 출력할 것인지를 선언하는 Element
	int number() default 15;
	
	//Annotation을 정의할 Class생성하기
	
}
