package org.example.spring.mvc.controller;

import org.example.spring.mvc.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TestController
 *
 * @author wangkm
 * @date 2020-03-25
 * @since 0.0.1
 */
@Controller
@RequestMapping("/app/")
public class TestController {

    @Autowired
    private TestBean testBean;

    @RequestMapping("test")
    public String test(){
        // 固定
        System.out.println(testBean.toString());
        return "/index.jsp";
    }

    @RequestMapping("test2")
    @ResponseBody
    public String test2(){
        return "/index.jsp";
    }

}
