package com.itdr.controller;

import com.itdr.common.Response;
import com.itdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public Response login(String userName, String passWord) {
//        return Response.toSuccess("Success");
        return userService.login(userName, passWord);
    }

    @RequestMapping("/register.do")
    public Response register(String userName, String passWord) {
//        return Response.toSuccess("Success");
        return userService.register(userName, passWord);
    }
}
//package com.itdr.controller;
//
//import com.itdr.common.Response;
//import com.itdr.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@ResponseBody
//@RequestMapping("/user/")
//public class UserController
//{
//    @Autowired
//    private UserService userService = new UserService();
//    @RequestMapping("login.yy")
//    public Response login(String userName, String passWord)
//    {
//        return userService.login(userName, passWord);
//    }
//    @RequestMapping("register.yy")
//    public Response register(String userName, String passWord)
//    {
//        return userService.register(userName, passWord);
//    }
//}
