package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect //aop로 쓸 수 있는 애노테이션
@Component
public class TimeTraceAop {

    @Around("execution(* hello.hellospring..*(..))") //공통 관심 사항을 타켓팅
//    @Around("execution(* hello.hellospring.service.*(..))") //Service만 찍고 싶을 때
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("START: " + joinPoint.toString());
        try {
            Object result = joinPoint.proceed(); //다음 메서드로 진행
            return result;
        }finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END: " + joinPoint.toString()+ " " + timeMs + "ms");
        }
    }
}