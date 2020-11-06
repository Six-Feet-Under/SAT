package com.heneng.demo.service;

import com.heneng.demo.dao.RoleMapper;
import com.heneng.demo.model.Jud;
import com.heneng.demo.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int insertRole(String user_id, Integer role_id) {
       return roleMapper.insertRole(user_id,role_id);
    }

    @Override
    public int deleteRole(String uid) {
        return roleMapper.deleteRole(uid);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public Role seleteById(String uid) {
        return roleMapper.seleteById(uid);
    }

    @Override
    public List<Jud> selectAll() {
        return roleMapper.selectAll();
    }

}
