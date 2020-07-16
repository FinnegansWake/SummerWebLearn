package com.itdr.mapper;

import com.itdr.pojo.Users;

public interface UserMapper {
    Users selectByUserNameAndPassWord(String userName, String passWord);

    Users selectByUserName(String userName);

    int insertOne(String userName, String passWord);
}
