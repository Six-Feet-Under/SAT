package com.heneng.demo.controller;


import com.heneng.demo.model.Jud;
import com.heneng.demo.model.User;
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



@RestController
@Api(value = "权限信息接口",tags = {"权限信息接口"})
public class JudController {

    @Autowired
    public JudService judService;

    @ApiOperation(value="增加权限信息接口", notes="增加权限信息信息")
    @RequestMapping(value = "/jud/insertJud", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "private String id;  //自增主键\n" +
                    "    private String  judname;  //权限的名称", required = true,
                    dataType = "string", paramType = "Jud")
    })
    public int insertJud(Jud jud) {
        try {
            int num = judService.insertJud(jud);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value="删除权限信息接口", notes="删除权限信息")
    @RequestMapping(value = "/jud/deleteById", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "string", paramType = "int")
    })
    public int deleteById(Integer id) {
        try{
            int num = judService.deleteById(id);
            return num;
        } catch (Exception e) {
            return 0;
        }
    }

    @ApiOperation(value="查询所有权限信息接口", notes="查询所有权限信息")
    @RequestMapping(value = "/jud/selectAll", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "List", paramType = "Map")
    })
    public List<Jud> selectAll() {
        try{
            List<Jud> list = judService.selectAll();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    @ApiOperation(value="查询权限信息接口", notes="查询权限信息")
    @RequestMapping(value = "/jud/selectJudById", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "Jud", paramType = "int")
    })
    public Jud selectJudById(Integer id) {
        try{
            Jud jud =  judService.selectJudById(id);
            return jud;
        }catch (Exception e){
            return null;
        }
    }

    @ApiOperation(value="更新权限信息接口", notes="更新权限信息")
    @RequestMapping(value = "/jud/updateJud", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "strs", value = "权限列表", required = true,
                    dataType = "String", paramType = "String")
    })
    public int updateJud(Jud jud) {
        try {
            int num = judService.updateJud(jud);
            return  num;
        }catch (Exception e){
            return 0;
        }
    }
}
