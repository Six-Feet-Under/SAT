package com.heneng.demo.service;

import com.heneng.demo.model.Jud;
import com.heneng.demo.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleService {

    int insertRole(String user_id, Integer role_id);


    int deleteRole(String uid);

    int updateRole(Role role);

    List<Jud> selectAll();

    Role seleteById(String uid);
}
