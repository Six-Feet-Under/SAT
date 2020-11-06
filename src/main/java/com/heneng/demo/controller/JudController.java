package com.heneng.demo.controller;


import com.heneng.demo.model.Jud;
import com.heneng.demo.service.JudService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

import java.util.List;
import java.util.Map;

@RestController
@Api(value = "权限信息接口",tags = {"权限信息接口"})
public class JudController {

    @Autowired
    private JudService judService;

    @ApiOperation(value="增加日志信息接口", notes="增加日志信息")
    @RequestMapping(value = "/jud/insertLog", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "/** 自增主键 */\n" +
                    "    private String judId;\n" +
                    "    /** 权限名 */\n" +
                    "    private String judName;", required = true,
                    dataType = "string", paramType = "Jud")
    })
    public String  insertJud(Jud jud) {
        if(selectJudByUid(jud.getUser_id())!=null){
            return"用户已存在";
        }else {
            judService.insertJud(jud);
        }

        return "success";
    }

    @ApiOperation(value="删除权限信息接口", notes="删除权限信息")
    @RequestMapping(value = "/jud/deleteByUid", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "string", paramType = "String")
    })
    public String deleteByUid(String  uid) {
        if(selectJudByUid(uid)!=null){
            judService.deleteByUid(uid);
        }else {
            return"用户不存在";
        }
        return "success";
    }

    @ApiOperation(value="查询所有权限信息接口", notes="查询所有权限信息")
    @RequestMapping(value = "/jud/selectAll", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "List", paramType = "Map")
    })
    public List<Jud> selectAll() {

        return judService.selectAll();
    }

    @ApiOperation(value="查询权限信息接口", notes="查询权限信息")
    @RequestMapping(value = "/jud/selectJudByUid", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "Jud", paramType = "String")
    })
    public Jud selectJudByUid(String id) {

        return judService.selectJudByUid(id);
    }

    @ApiOperation(value="查询权限信息接口", notes="查询权限信息")
    @RequestMapping(value = "/jud/updateJudByUid", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "String", paramType = "String")
    })
    public String updateJudByUid(String uid) {
        if(selectJudByUid(uid)!=null){
            judService.updateJudByUid(uid);
        }

        return "success";
    }
}
