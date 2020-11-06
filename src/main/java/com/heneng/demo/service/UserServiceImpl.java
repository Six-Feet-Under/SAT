package com.heneng.demo.service;

import com.heneng.demo.dao.UserMapper;
import com.heneng.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String account, String password) {
        return userMapper.login(account,password);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deleteUserById(long id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int registerUser(User user) {
        return userMapper.registerUser(user);
    }

    @Override
    public User selectUserById(long id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public List<User> selectAll() {
        //return null;
       return userMapper.selectAll();
    }
}
