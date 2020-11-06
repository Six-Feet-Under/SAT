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
    public int insertUserRole(String uid) {
        return userMapper.insertUserRole(uid);
    }

    @Override
    public int deleteUserRole(String uid) {
        return userMapper.deleteUserRole(uid);
    }

    @Override
    public int updateUserRole(String uid) {
        return userMapper.updateUserRole(uid);
    }

    @Override
    public List<String> selectUserRole(String uid) {
        return userMapper.selectUserRole(uid);
    }






    @Override
    public int insertUserJud(String uid) {
        return userMapper.insertUserJud(uid);
    }

    @Override
    public int deleteUserJud(String uid) {
        return userMapper.deleteUserJud(uid);
    }

    @Override
    public int updateUserJud(String uid) {
        return userMapper.updateUserJud(uid);
    }

    @Override
    public List<String> selectUserJud(String uid) {
        return userMapper.selectUserJud(uid);
    }





    @Override
    public int insertUserDept(String uid) {
        return userMapper.insertUserDept(uid);
    }

    @Override
    public int deleteUserDept(String uid) {
        return userMapper.deleteUserDept(uid);
    }

    @Override
    public int updateUserDept(String uid) {
        return userMapper.updateUserDept(uid);
    }

    @Override
    public List<String> selectUserDept(String uid) {
        return userMapper.selectUserDeptc (uid);
    }





    @Override
    public List<User> selectAll() {
        //return null;
       return userMapper.selectAll();
    }
}
