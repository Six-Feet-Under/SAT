package com.heneng.demo.service;

import com.heneng.demo.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {

     int insertUser(User user) ;

     User login(@Param("account") String account, @Param("passWord") String passWord) ;

     int deleteUser(long id) ;

     List<User> selectAll();

     int updateUser(User user) ;

     int registerUser(User user) ;

     User selectUserById(long id);
}
