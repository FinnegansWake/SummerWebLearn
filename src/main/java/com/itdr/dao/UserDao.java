package com.itdr.dao;

import com.itdr.pojo.Users;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public Users selectByUserNameAndPassWord(String userName, String passWord) {
        Users u = new Users();
        u.setUserName("kaiserma");
        u.setPassWord("123456");
        return u;
    }

    public int insertOne(String userName, String passWord) {
        Users u = new Users();
        u.setUserName("kaiserma");
        u.setPassWord("123456");
        return 1;
    }
}
