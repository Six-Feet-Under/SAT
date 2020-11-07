package com.heneng.demo.dao;

import com.heneng.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    int insertUser(User user);

    User login(@Param("account") String account, @Param("passWord") String passWord);

    int deleteUserById(long id);

    int updateUser(User user);

    int registerUser(User user);

    User selectUserById(long id);

    List<User> selectAll();



    int insertUserRole(String uid, int roleId);

    int deleteUserRole(String uid, int roleId);

    int updateUserRole(String uid, int roleId);

    List<String> selectUserRole(String uid, int roleId);



    int insertUserJud(String uid, int judId);

    int deleteUserJud(String uid, int judId);

    int updateUserJud(String uid, int judId);

    List<String> selectUserJud(String uid, int judId);



    int insertUserDept(String uid, int deptId);

    int deleteUserDept(String uid, int deptId);

    int updateUserDept(String uid, int deptId);

    List<String> selectUserDeptc(String uid, int deptId);
}
