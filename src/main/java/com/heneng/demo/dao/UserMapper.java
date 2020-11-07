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



    int insertUserRole(@Param("uid") String uid, @Param("roleId")int roleId);

    int deleteUserRole(@Param("uid") String uid,@Param("roleId") int roleId);

    int updateUserRole(@Param("uid") String uid,@Param("OroleId") int OroleId,@Param("NroleId")int NroleId);

    List<Integer> selectUserRole(@Param("uid") String uid);



    int insertUserJud(String uid, int judId);

    int deleteUserJud(String uid, int judId);

    int updateUserJud(String uid, int OjudId,int NjudId);

    List<Integer> selectUserJud(String uid);



    int insertUserDept(String uid, int deptId);

    int deleteUserDept(String uid, int deptId);

    int updateUserDept(String uid, int OdeptId,int NdeptId);

    List<Integer> selectUserDeptc(String uid);
}
