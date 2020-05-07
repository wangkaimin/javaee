package org.example.spring.mvc.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * TestConfig
 *
 * @author wangkm
 * @date 2020-04-02
 * @since 0.0.1
 */
@ComponentScan("org.example.spring.mvc.*")
@EnableAspectJAutoProxy
public class TestConfig {
}
