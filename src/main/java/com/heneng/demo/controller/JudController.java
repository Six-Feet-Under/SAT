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
        judService.insertJud(jud);
        return "success";
    }

    @ApiOperation(value="删除权限信息接口", notes="删除权限信息")
    @RequestMapping(value = "/jud/deleteById", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "string", paramType = "int")
    })
    public String deleteById(int id) {
        judService.deleteById(id);
        return "success";
    }

    @ApiOperation(value="查询所有权限信息接口", notes="查询所有权限信息")
    @RequestMapping(value = "/jud/selectAll", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "List", paramType = "Map")
    })
    public List<Jud> selectAll(Map map) {

        return judService.selectAll(map);
    }

    @ApiOperation(value="查询权限信息接口", notes="查询权限信息")
    @RequestMapping(value = "/jud/selectJudById", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "Jud", paramType = "int")
    })
    public Jud selectJudById(int id) {

        return judService.selectJudById(id);
    }

    @ApiOperation(value="查询权限信息接口", notes="查询权限信息")
    @RequestMapping(value = "/jud/selectJudById", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "String", paramType = "int")
    })
    public String updateJudById(int id) {
        judService.updateJudById(id);
        return "success";
    }
}
