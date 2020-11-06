package com.heneng.demo.service;

import com.heneng.demo.dao.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public void insertRole(Integer user_id, Integer role_id) {
        roleMapper.insertRole(user_id,role_id);
    }

}
