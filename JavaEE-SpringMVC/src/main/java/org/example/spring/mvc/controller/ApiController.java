package org.example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ApiController
 *
 * @author wangkm
 * @date 2020-03-25
 * @since 0.0.1
 */
@RequestMapping("/api/")
@Controller
public class ApiController {

    @RequestMapping("test")
    public String testApi(){
        return "/index.jsp";
    }

}
