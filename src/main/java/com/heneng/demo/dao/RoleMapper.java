package com.heneng.demo.dao;

import com.heneng.demo.model.Jud;
import com.heneng.demo.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    public int deleteRole(String uid) ;

    public int insertRole(Role role);

    int updateRole(Role role);

    Role seleteById(String uid);

    List<Jud> selectAll();
}
