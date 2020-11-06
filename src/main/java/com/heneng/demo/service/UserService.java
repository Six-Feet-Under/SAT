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



     int insertUserRole(String uid);

     int deleteUserRole(String uid);

     int updateUserRole(String uid);

     List<String> selectUserRole(String uid);



     int insertUserJud(String uid);

     int deleteUserJud(String uid);

     int updateUserJud(String uid);

     List<String> selectUserJud(String uid);



     int insertUserDept(String uid);

     int deleteUserDept(String uid);

     int updateUserDept(String uid);

     List<String> selectUserDept(String uid);

}
