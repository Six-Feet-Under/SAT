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
    public int insertRole(Role role) {
       return roleMapper.insertRole(role);
    }

    @Override
    public int deleteRole(int id) {
        return roleMapper.deleteRole(id);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public Role seleteById(int id) {
        return roleMapper.seleteById(id);
    }

    @Override
    public List<Jud> selectAll() {
        return roleMapper.selectAll();
    }

}
