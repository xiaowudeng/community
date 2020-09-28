package com.nowcoder.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlpaController {

    @RequestMapping("hello")
    @ResponseBody
    public String helloSpring(){
            return "hello springboot ";
    }
}
