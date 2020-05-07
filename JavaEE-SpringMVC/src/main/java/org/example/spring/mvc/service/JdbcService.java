package org.example.spring.mvc.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * JdbcService
 *
 * @author wangkm
 * @date 2020-04-02
 * @since 0.0.1
 */
@Service
public class JdbcService {

    public Long getById(Long id){
        System.out.println("getById(" + id + ")");
        return id;
    }

}
