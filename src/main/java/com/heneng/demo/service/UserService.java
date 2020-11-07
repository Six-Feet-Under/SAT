package com.heneng.demo.service;

import com.heneng.demo.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {

     int insertUser(User user) ;

     User login( String account, String passWord) ;

     int deleteUserById(long id) ;

     List<User> selectAll();

     int updateUser(User user) ;

     int registerUser(User user) ;

     User selectUserById(long id);



     int insertUserRole(String uid,int RoleId);

     int deleteUserRole(String uid,int RoleId);

     int updateUserRole(String uid,int RoleId);

     List<String> selectUserRole(String uid,int RoleId);



     int insertUserJud(String uid,int JudId);

     int deleteUserJud(String uid,int JudId);

     int updateUserJud(String uid,int JudId);

     List<String> selectUserJud(String uid,int JudId);



     int insertUserDept(String uid,int DeptId);

     int deleteUserDept(String uid,int DeptId);

     int updateUserDept(String uid,int DeptId);

     List<String> selectUserDept(String uid,int DeptId);

}
