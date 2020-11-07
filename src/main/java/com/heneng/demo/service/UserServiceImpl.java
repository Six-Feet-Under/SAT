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
    public int insertUserRole(String uid,int RoleId) {
        return userMapper.insertUserRole(uid,RoleId);
    }

    @Override
    public int deleteUserRole(String uid,int RoleId) {
        return userMapper.deleteUserRole(uid, RoleId);
    }

    @Override
    public int updateUserRole(String uid,int RoleId) {
        return userMapper.updateUserRole(uid, RoleId);
    }

    @Override
    public List<String> selectUserRole(String uid,int RoleId) {
        return userMapper.selectUserRole(uid, RoleId);
    }






    @Override
    public int insertUserJud(String uid,int JudId) {
        return userMapper.insertUserJud(uid, JudId);
    }

    @Override
    public int deleteUserJud(String uid,int JudId) {
        return userMapper.deleteUserJud(uid, JudId);
    }

    @Override
    public int updateUserJud(String uid,int JudId) {
        return userMapper.updateUserJud(uid, JudId);
    }

    @Override
    public List<String> selectUserJud(String uid,int JudId) {
        return userMapper.selectUserJud(uid, JudId);
    }





    @Override
    public int insertUserDept(String uid,int DeptId) {
        return userMapper.insertUserDept(uid, DeptId);
    }

    @Override
    public int deleteUserDept(String uid,int DeptId) {
        return userMapper.deleteUserDept(uid, DeptId);
    }

    @Override
    public int updateUserDept(String uid,int DeptId) {
        return userMapper.updateUserDept(uid, DeptId);
    }

    @Override
    public List<String> selectUserDept(String uid,int DeptId) {
        return userMapper.selectUserDeptc (uid, DeptId);
    }





    @Override
    public List<User> selectAll() {
        //return null;
       return userMapper.selectAll();
    }
}
