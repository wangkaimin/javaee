package org.example.spring.mvc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * TestAspect
 *
 * @author wangkm
 * @date 2020-04-02
 * @since 0.0.1
 */
@Aspect
@Component
public class TestAspect {

    @Pointcut("execution(* org.example.spring.mvc.service.*.*(..))")
    public void service() {}

//    @Before("service()")
    public void beforeService() {
        System.out.println("Before Service.");
    }

//    @After("service()")
    public void afterService() {
        System.out.println("After Service.");
    }

    @Around("service()")
    public Object aroundService(ProceedingJoinPoint jp) {
        Object object = null;
        try {
            System.out.println("Before Around Service.");
            // JoinPoint
            object = jp.proceed();

            // 日志输出，请求参数、相应参数的记录
            System.out.println("After Around Service. " + object);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return object;
    }
}
