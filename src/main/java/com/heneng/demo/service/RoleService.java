package com.heneng.demo.service;

import org.springframework.stereotype.Repository;

@Repository
public interface RoleService {

    void insertRole(Integer user_id, Integer role_id);


}
