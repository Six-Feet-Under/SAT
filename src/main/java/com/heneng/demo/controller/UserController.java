package com.heneng.demo.controller;

import com.heneng.demo.model.User;
import com.heneng.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Api(value = "用户接口信息", tags = {"用户接口信息"})
public class UserController {

    @Autowired
    public UserService userService ;

    @ApiOperation(value="登录接口", notes="登录")
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account",value = "账户",required = true,dataType = "String",paramType = "String"),
            @ApiImplicitParam(name = "passWord",value = "密码",required = true,dataType = "String",paramType = "String"),
    })
    public User login(String account,String passWord){
        try {
            User user = userService.login(account,passWord);
            return user;
        }catch (Exception e){
            return null;
        }
    }

    @ApiOperation(value = "新增",notes = "新增用户")
    @RequestMapping(value = "/user/insertUser",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user",value = "    private long id; //自增主键 id\n" +
                    "\n" +
                    "    private String uid; //id\n" +
                    "\n" +
                    "    private String userName; //名字\n" +
                    "\n" +
                    "    private String account; //长账户\n" +
                    "\n" +
                    "    private String passWord; //密码\n" +
                    "\n" +
                    "    private String uPudB; //加密后密码（B钥）"
                    ,required = true,dataType = "int",paramType = "user")
    })
    public int insertUser(User user){
        try {
            int num = userService.insertUser(user);
            System.out.println(num);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value = "注册",notes = "注册用户")
    @RequestMapping(value = "/user/registertUser",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user",value = "    private long id; //自增主键 id\n" +
                    "\n" +
                    "    private String uid; //id\n" +
                    "\n" +
                    "    private String userName; //名字\n" +
                    "\n" +
                    "    private String account; //长账户\n" +
                    "\n" +
                    "    private String passWord; //密码\n" +
                    "\n" +
                    "    private String uPudB; //加密后密码（B钥）"
                    ,required = true,dataType = "int",paramType = "user")
    })
    public int registerUser(User user){
        try {
            int num = userService.registerUser(user);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value = "删除",notes = "删除用户")
    @RequestMapping(value = "/user/deleteUserById",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "id",required = true,dataType = "int",paramType = "long")
    })
    private int deleteUserById(long id){
        try {
            int num = userService.deleteUserById(id);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value = "更新",notes = "更新用户")
    @RequestMapping(value = "/user/updateUser",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user",value =
                    "private long id; //自增主键 id\n" +
                            "\n" +
                            "    private String uid; //id\n" +
                            "\n" +
                            "    private String userName; //名字\n" +
                            "\n" +
                            "    private String account; //长账户\n" +
                            "\n" +
                            "    private String passWord; //密码\n" +
                            "\n" +
                            "    private String uPudB; //加密后密码（B钥）"
                    ,required = true,dataType = "int",paramType = "user")
    })
    public int updateUser(User user){
//        try {
        int num = userService.updateUser(user);
        return  num;
//        }catch (Exception e){
//            return 0;
//        }
    }

    @ApiOperation(value = "查询",notes = "查询所有")
    @RequestMapping(value = "/user/selectAll",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "",value = "用户列表",required = true,dataType = "List",paramType = "")
    })
    public List<User> selectAll(){
        try {
            List<User> list = userService.selectAll();
            return list;
        }catch (Exception e){
            return null;
        }
    }

    @ApiOperation(value = "查询",notes = "根据id查询用户")
    @RequestMapping(value = "/user/selectUserById",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id" ,value = "id",required = true,dataType = "user",paramType = "long")
    })
    public User selectUserById(long id){
        try{
            User user =  userService.selectUserById(id);
            return user;
        }catch (Exception e){
            return null;
        }
    }






    @ApiOperation(value = "新增用户角色接口",notes = "新增用户角色")
    @RequestMapping(value = "/user/insertUserRole",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "int",paramType = "String"),
            @ApiImplicitParam(name = "RoleId",value = "角色id",required = true,dataType = "int",paramType = "int")
    })
    public int insertUserRole(String uid,int RoleId){
        try{
            int num = userService.insertUserRole(uid,RoleId);
            return num;
        }catch (Exception e){
            return 0;
        }
    }


    @ApiOperation(value = "删除用户角色接口",notes = "删除用户角色")
    @RequestMapping(value = "/user/deleteUserRole",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "int",paramType = "String"),
            @ApiImplicitParam(name = "RoleId",value = "角色id",required = true,dataType = "int",paramType = "int")
    })
    public int deleteUserRole(String uid,int RoleId){
        try{
            int num = userService.deleteUserRole(uid, RoleId);
            return num;
        }catch (Exception e){
            return 0;
        }
    }


    @ApiOperation(value = "删除用户角色接口",notes = "删除用户角色")
    @RequestMapping(value = "/user/updateUserRole",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "int",paramType = "String"),
            @ApiImplicitParam(name = "ORoleId",value = "过去的角色id",required = true,dataType = "int",paramType = "int"),
            @ApiImplicitParam(name = "NRoleId",value = "新的角色id",required = true,dataType = "int",paramType = "int")
    })
    public int updateUserRole(String uid,int ORoleId,int NRoleId){
        try{
            int num = userService.updateUserRole(uid, ORoleId,NRoleId);
            return num;
        }catch (Exception e){
            return 0;
        }
    }


    @ApiOperation(value = "查找用户角色接口",notes = "删除用户角色")
    @RequestMapping(value = "/user/selectUserRole",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "List",paramType = "String")
    })
    public List<Integer> selectUserRole(String uid){
        try{
        List<Integer> list = userService.selectUserRole(uid);
        return list;
        }catch (Exception e){
            return null;
        }
    }

    @ApiOperation(value = "查找所有用户角色接口",notes = "查找所有用户角色")
    @RequestMapping(value = "/user/selectUserRoleAll",method = RequestMethod.POST)
    @ApiImplicitParam(dataType = "list<map>")
    public List<Map> selectUserRoleAll(){
        try{
            List<Map> map = userService.selectUserRoleAll();
            return map;
        }catch (Exception e){
            return null;
        }
    }







    @ApiOperation(value = "新增用户权限接口",notes = "新增用户权限")
    @RequestMapping(value = "/user/insertUserJud",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "int",paramType = "String"),
            @ApiImplicitParam(name = "JudId",value = "权限id",required = true,dataType = "int",paramType = "int")
    })
    public int insertUserJud(String uid,int JudId){
        try{
            int num = userService.insertUserJud(uid, JudId);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value = "删除用户权限接口",notes = "删除用户权限")
    @RequestMapping(value = "/user/deleteUserJud",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "int",paramType = "String"),
            @ApiImplicitParam(name = "JudId",value = "权限id",required = true,dataType = "int",paramType = "int")
    })
    public int deleteUserJud(String uid,int JudId){
        try{
            int num = userService.deleteUserJud(uid, JudId);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value = "更新用户权限接口",notes = "更新用户权限")
    @RequestMapping(value = "/user/updateUserJud",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "int",paramType = "String"),
            @ApiImplicitParam(name = "OJudId",value = "过去的权限id",required = true,dataType = "int",paramType = "int"),
            @ApiImplicitParam(name = "NJudId",value = "新的权限id",required = true,dataType = "int",paramType = "int")
    })
    public int updateUserJud(String uid,int OJudId,int NJudId){
        try{
            int num = userService.updateUserJud(uid, OJudId,NJudId);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value = "查找用户权限接口",notes = "查找用户权限")
    @RequestMapping(value = "/user/selectUserJud",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "List",paramType = "String")
    })
    public  List<Integer> selectUserJud(String uid){
        try{
            List<Integer> list = userService.selectUserJud(uid);
            return list;
        }catch (Exception e){
            return null;
        }
    }

    @ApiOperation(value = "查找所有用户权限接口",notes = "查找所有用户权限")
    @RequestMapping(value = "/user/selectUserJudAll",method = RequestMethod.POST)
    @ApiImplicitParam(dataType = "list<map>")
    public List<Map> selectUserJudAll(){
        try{
            List<Map> map = userService.selectUserJudAll();
            return map;
        }catch (Exception e){
            return null;
        }
    }







    @ApiOperation(value = "新增用户部门接口",notes = "新增用户部门")
    @RequestMapping(value = "/user/insertUserDept",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "int",paramType = "String"),
            @ApiImplicitParam(name = "DeptId",value = "部门id",required = true,dataType = "int",paramType = "int")
    })
    public int insertUserDept(String uid,int DeptId){
        try{
            int num = userService.insertUserDept(uid, DeptId);
            return num;
        }catch (Exception e){
            return 0;
        }
    }


    @ApiOperation(value = "删除用户部门接口",notes = "删除用户部门")
    @RequestMapping(value = "/user/deleteUserDept",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "int",paramType = "String"),
            @ApiImplicitParam(name = "DeptId",value = "部门id",required = true,dataType = "int",paramType = "int")
    })
    public int deleteUserDept(String uid,int DeptId){
        try{
            int num = userService.deleteUserDept(uid, DeptId);
            return num;
        }catch (Exception e){
            return 0;
        }
    }


    @ApiOperation(value = "更新用户部门接口",notes = "更新用户部门")
    @RequestMapping(value = "/user/updateUserDept",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "int",paramType = "String"),
            @ApiImplicitParam(name = "ODeptId",value = "过去的部门id",required = true,dataType = "int",paramType = "int"),
            @ApiImplicitParam(name = "NDeptId",value = "新的部门id",required = true,dataType = "int",paramType = "int")
    })
    public int updateUserDept(String uid,int ODeptId,int NDeptId){
        try{
            int num = userService.updateUserDept(uid, ODeptId,NDeptId);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value = "查找用户部门接口",notes = "查找用户部门")
    @RequestMapping(value = "/user/selectUserDept",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户id",required = true,dataType = "List",paramType = "String")
    })
    public  List<Integer> selectUserDept(String uid){
        try{
            List<Integer> list = userService.selectUserDept(uid);
            return list;
        }catch (Exception e){
            return null;
        }
    }

    @ApiOperation(value = "查找所有用户部门接口",notes = "查找所有用户部门")
    @RequestMapping(value = "/user/selectUserDeptAll",method = RequestMethod.POST)
    @ApiImplicitParam(dataType = "list<map>")
    public List<Map> selectUserDeptAll(){
        try{
            List<Map> map = userService.selectUserDeptAll();
            return map;
        }catch (Exception e){
            return null;
        }
    }

}