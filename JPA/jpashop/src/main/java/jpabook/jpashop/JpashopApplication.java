package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args){

		//ctrl+shift+F10실행 : console 중 Tomcat started on port(s): 8080이 출력
		//web browser에 localhost:8080입력 → 'Whitelabel Error Page' 나오면 성공! → Setting 성공

		//Test도 기본적으로 하나 만들어 놓는다.

		//lombok Test
//		Hello hello = new Hello();
//		hello.setData("hello");
//		String data = hello.getData();
//
//		System.out.println("data ="+data);

		SpringApplication.run(JpashopApplication.class, args);
	}



}
