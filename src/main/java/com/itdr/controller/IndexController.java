package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/show.do")
    public String show() {
        System.out.println("Request come in");
        return "abc";
    }
}
