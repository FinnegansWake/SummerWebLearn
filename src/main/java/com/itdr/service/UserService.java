package com.itdr.service;

import com.itdr.mapper.UserMapper;
import com.itdr.pojo.Users;
import com.itdr.common.Response;
import com.itdr.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
//    private UserDao userDao;
    private UserMapper userMapper;

    public Response login(String name, String passWord) {
        if (name == null || name.length() == 0) {
            return Response.toFailure(404, "Null Name or passWord");
        }

        if (passWord == null || passWord.length() == 0) {
            return Response.toFailure(100, "Illegal Password");
        }

        Users users = userMapper.selectByUserNameAndPassWord(name, passWord);

        if (users == null) {
            return Response.toFailure(100, "Login Failure");
        }

        return Response.toSuccess("Succeed!");
    }

    public Response register(String userName, String passWord) {
        if (userName == null || userName.length() == 0) {
            return Response.toFailure(100, "Illegal User Name");
        }

        if (passWord == null || passWord.length() == 0) {
            return Response.toFailure(100, "Illegal Password");
        }

        Users users = userMapper.selectByUserName(userName);
        if (users == null) {

        }
        int i = userMapper.insertOne(userName, passWord);

        if (i < 0) {
            return Response.toFailure(100, "Failure");
        }

        return Response.toSuccess("Success!");
    }
}

// ****** ///
//package com.itdr.service;
//
//import com.itdr.common.Response;
//import com.itdr.dao.UserDao;
//import com.itdr.pojo.Users;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService
//{
//    @Autowired
//    private UserDao dao;
//    public Response login(String userName, String passWord)
//    {
//        //check inputs
//        if(userName == null || userName.equals(""))
//        {
//            return Response.toFailure(100, "用户名非法");
//        }
//        if(passWord == null || passWord.equals(""))
//        {
//            return Response.toFailure(100, "密码非法");
//        }
//        //search the user information
//        Users user = dao.selectByUserNameAndPassWord(userName, passWord);
//        if(user == null)
//            return Response.toFailure(100, "登录失败");
//        return Response.toSuccess("注册成功");
//    }
//    public Response register(String userName, String passWord)
//    {
//        //check inputs
//        if(userName == null || userName.equals(""))
//        {
//            return Response.toFailure(100, "用户名非法");
//        }
//        if(passWord == null || passWord.equals(""))
//        {
//            return Response.toFailure(100, "密码非法");
//        }
//        //search the user information
//        Users user = dao.selectByUserNameAndPassWord(userName, passWord);
//        int i = dao.insertOne(userName, passWord);
//        if(i <= 0)
//            return Response.toFailure(100, "注册失败");
//        return Response.toFailure(100, "注册成功");
//    }
//}