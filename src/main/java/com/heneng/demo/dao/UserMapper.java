package com.heneng.demo.dao;

import com.heneng.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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

    List<Map> selectUserRoleAll();




    int insertUserJud(@Param("uid")String uid, @Param("judId") int judId);

    int deleteUserJud(@Param("uid")String uid, @Param("judId")int judId);

    int updateUserJud(@Param("uid")String uid, @Param("OjudId") int OjudId,@Param("NjudId")int NjudId);

    List<Integer> selectUserJud(@Param("uid")String uid);

    List<Map> selectUserJudAll();




    int insertUserDept(@Param("uid")String uid, @Param("deptId") int deptId);

    int deleteUserDept(@Param("uid")String uid, @Param("deptId")int deptId);

    int updateUserDept(@Param("uid")String uid, @Param("OdeptId") int OdeptId,@Param("NdeptId") int NdeptId);

    List<Integer> selectUserDeptc(@Param("uid")String uid);

    List<Map> selectUserDeptAll();
}
