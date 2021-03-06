package com.heneng.demo.controller;

import com.heneng.demo.model.Jud;
import com.heneng.demo.model.Role;
import com.heneng.demo.service.RoleService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RoleController {

    @Autowired
    public RoleService roleService;

    @ApiOperation(value="增加角色信息接口", notes="增加角色信息")
    @RequestMapping(value = "/role/insertRole", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "private int id;  //自增主键id\n" +
                    "    private String user_id;  //用户的uid\n" +
                    "    private int role_id;  //角色的id", required = true,
                    dataType = "int", paramType = "Role")
    })
    public int insertRole(Role role) {
       try {
            int num = roleService.insertRole(role);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value="删除角色信息接口", notes="删除角色信息")
    @RequestMapping(value = "/role/deleteRole", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "角色列表", required = true,
                    dataType = "int", paramType = "Integer")
    })
    public int deleteRole(Integer id){
        try{
            int num = roleService.deleteRole(id);
            return num;
        } catch (Exception e) {
            return 0;
        }
    }

    @ApiOperation(value="更新角色信息接口", notes="更新角色信息")
    @RequestMapping(value = "/role/updateRole", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "角色列表", required = true,
                    dataType = "int", paramType = "Role")
    })
    public int updateRole(Role role){
        try {
            int num = roleService.updateRole(role);
            return  num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value="查询权限信息接口", notes="查询权限信息")
    @RequestMapping(value = "/role/seleteById", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "角色列表", required = true,
                    dataType = "Role", paramType = "Integer")
    })
    public Role seleteById(Integer id){

        try{
            Role role =  roleService.seleteById(id);
            return role;
        }catch (Exception e){
            return null;
        }
    }

    @ApiOperation(value="查询所有权限信息接口", notes="查询所有权限信息")
    @RequestMapping(value = "/role/selectAll", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "", value = "角色列表", required = true,
                    dataType = "List", paramType = "")
    })
    public List<Jud> selectAll() {
        try{
            List<Jud> list = roleService.selectAll();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

}
