package com.heneng.demo.service;

import com.heneng.demo.model.User;

import java.util.List;

public interface UserService {

    public int insertUser(User user) ;

    public User login(String account, String passWord) ;

    public int deleteUser(long id) ;

    public List<User> selectAll();

    public int updateUser(User user) ;

    public int registerUser(User user) ;

    public User selectUserById(long id);
}
