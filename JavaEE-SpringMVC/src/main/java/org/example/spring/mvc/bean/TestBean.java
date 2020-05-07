package org.example.spring.mvc.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * TestBean
 *
 * @author wangkm
 * @date 2020-04-01
 * @since 0.0.1
 */
@Configuration
@Scope("prototype")
public class TestBean {
    private Long id;
    private String name;

    @Bean
    public TestBean testBean2(){
        return new TestBean(1L, "init Name");
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public TestBean() {
    }


    public TestBean(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
