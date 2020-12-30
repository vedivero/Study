package sec15.exam01_annotation;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {

		//가장먼저 할 작업
		//Service class의 있는 method를 파악
		//Service에서 선언된 모든 method의 정보를 배열[]로 가져온다.
		Method[] declaredMethods = Service.class.getDeclaredMethods();	
		
		//method는 다른 class에서 선언된 class이므로 import
		//	(reflect :
		//		Class의 metadata, class이름, Constructor이름, 매개변수, method의 return type등등
		//		정보를 가지고 있는 class들 중 method에 대한 정보를 가지고 있는 class)
		
		//Service에서 선언된 method1,2,3을 출력
		//method의 이름을 출력하는 method.getName
		for(Method method:declaredMethods){
			
			
			//해당 method가 annotation이 적용됐는지를 확인하는 방법
			if(method.isAnnotationPresent(PrintAnnotation.class)){
				System.out.println(method.getName()+"에는 Annotation이 적용되어 있음");
					//Annotation내에 Element value를 확인하기
					PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
					
						//[1]
						System.out.println(method.getName()+": ");
						//value()가 element value를 return
						System.out.println("value :"+printAnnotation.value());
						//number를 return하는 number()정보 출력
						System.out.println("number :"+printAnnotation.number());
						System.out.println();
						
						//method name출력
						System.out.println("["+method.getName()+"]");
						
						//[2]
						//구분선 출력
						//구분선 : 어떤 문자를 몇번 출력할 것인가이다
						//출력하는 방법을 활용하는 방법
						for(int i=0; i<printAnnotation.number(); i++){
							
							//구분선으로 사용되는 문자 : printAnnotation.value()의 value
							System.out.print(printAnnotation.value());
							
							
						}System.out.println();
						
						//[3]
						//method 호출할 때 
						
						//method.invoke(obj, args) 
						// obj 해당 method를 가지고 있는 객체 , arguments:주지 않아도 됨(생성자인 매개변수이면 필요)
						try {
							method.invoke(new Service());
							// = Service service = new Service();
							//		service.method1(); (=invoke) 과 같은 의미
							
						} catch (Exception e) {
								
						}System.out.println();
						
			}else{
			
				System.out.println(method.getName()+"에는 Annotation이 적용되어 있지 않음");
			}
			
		}
		
	}
}
