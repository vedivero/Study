package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		//실행시키려는 Class를 넣어주면, @SpringBootApplication이 실행되는데 Tomcat을 내장하고 있어 자체적으로 실행
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
