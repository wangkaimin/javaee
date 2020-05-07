package org.example.spring.mvc.spring;

import org.example.spring.mvc.aspect.TestAspect;
import org.example.spring.mvc.bean.TestBean;
import org.example.spring.mvc.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * TestSpring
 *
 * @author wangkm
 * @date 2020-04-01
 * @since 0.0.1
 */
@ComponentScan("org.example.spring.mvc.*")
@EnableAspectJAutoProxy
//@Configuration
public class TestSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TestSpring.class);

        TestAspect testAspect = context.getBean("testAspect", TestAspect.class);

        System.out.println(testAspect.toString());

        JdbcService jdbcService = context.getBean("jdbcService", JdbcService.class);

        jdbcService.getById(10L);

//        context.register(JdbcService.class);
//        context.register(TestAspect.class);
//        context.scan("org.example.spring.mvc.service.*");
//        context.register(TestSpring.class);
//        context.refresh();

        // create and configure beans

        // 1
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("app-context.xml");
//
//        // 2
//        ApplicationContext context2 = new FileSystemXmlApplicationContext("/JavaEE-SpringMVC/src/main/resources/app-context.xml");
//
//        int n = 1;
//        while (n-- > 0){
//
//            // getByName
//            TestBean service =  (TestBean) context.getBean("testBean");
//            // new TestBean
//
//            System.out.println(service.toString());
//
//            // retrieve configured instance
//            JdbcService jdbcService = context.getBean("jdbcService", JdbcService.class);
//
//            // use configured instance
//            jdbcService.getById(100L);
//        }



    }
}
