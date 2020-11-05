package com.heneng.demo.controller;

import com.heneng.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @RequestMapping("/insertRole")
    public String insertRole(Integer user_id,Integer role_id){
        roleService.insertRole(user_id,role_id);
        return null;
    }

    @RequestMapping("/deleteRole")
    public String deleteRole(){
        return null;
    }

    @RequestMapping("/updateRole")
    public String updateRole(){
        return null;
    }

    @RequestMapping("/seleteById")
    public String seleteById(){
        return null;
    }

}
