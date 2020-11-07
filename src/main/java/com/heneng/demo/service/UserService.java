package com.heneng.demo.service;

import com.heneng.demo.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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

     int updateUserRole(String uid,int ORoleId,int NRoleId);

     List<Integer> selectUserRole(String uid);

     List<Map> selectUserRoleAll();




     int insertUserJud(String uid,int JudId);

     int deleteUserJud(String uid,int JudId);

     int updateUserJud(String uid,int OJudId,int NJudId);

     List<Integer> selectUserJud(String uid);

     List<Map> selectUserJudAll();



     int insertUserDept(String uid,int DeptId);

     int deleteUserDept(String uid,int DeptId);

     int updateUserDept(String uid,int ODeptId,int NDeptId);

     List<Integer> selectUserDept(String uid);

     List<Map> selectUserDeptAll();
}
