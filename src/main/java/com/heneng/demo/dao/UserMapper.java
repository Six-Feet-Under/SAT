package com.heneng.demo.dao;

import com.heneng.demo.model.User;

import java.util.List;

public interface UserMapper {

    int insertUser(User user);

    User login(String account, String password);

    int deleteUser(long id);

    int updateUser(User user);

    int registerUser(User user);

    User selectUserById(long id);

    List<User> selectAll();
}
