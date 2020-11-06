package com.heneng.demo.controller;

import com.heneng.demo.model.User;
import com.heneng.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "用户接口信息", tags = {"用户接口信息"})
public class UserController {
    
    @Autowired
    UserService userService ;

    @ApiOperation(value="登录", notes="登录")
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ApiImplicitParam()
    private User login(String account,String passWord){
        try {
            User user = userService.login(account,passWord);
            return user;
        }catch (Exception e){
            return null;
        }
    }

    private int insertUser(User user){
        try {
            int num = userService.insertUser(user);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    private int registerUser(User user){
        try {
            int num = userService.registerUser(user);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    private int deleteUser(long id){
        try {
            int num = userService.deleteUser(id);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    private int update(User user){
        try {
            int num = userService.updateUser(user);
            return  num;
        }catch (Exception e){
            return 0;
        }
    }

    private List<User> selectAll(){
        try {
            List<User> list = userService.selectAll();
            return list;
        }catch (Exception e){
            return null;
        }
    }

    private User selectUserById(long id){
        try{
            User user =  userService.selectUserById(id);
            return user;
        }catch (Exception e){
            return null;
        }
    }

}