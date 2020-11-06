package com.heneng.demo.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {
    public void insertRole(Integer user_id, Integer role_id);
}
