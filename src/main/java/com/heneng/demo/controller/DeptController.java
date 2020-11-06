package com.heneng.demo.controller;

import com.heneng.demo.model.Dept;
import com.heneng.demo.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "部门信息接口", tags = {"部门信息接口"})
public class DeptController {

    @Autowired
    public DeptService deptService;

    @ApiOperation(value="查询所有", notes="查询所有")
    @RequestMapping(value = "/dept/selectAll", method = RequestMethod.POST)
    @ApiImplicitParam(type = "list")
    public List<Dept> selectAll(){
        try{
            List<Dept> list = deptService.selectAll();
            return list;
        }catch (Exception e){
            return null;
        }
    }

    @ApiOperation(value="根据ID查询部门", notes="根据ID查询部门")
    @RequestMapping(value = "/dept/selectDeptById", method = RequestMethod.POST)
    @ApiImplicitParam(name = "id" ,value = "id",required = true,dataType = "int",paramType = "int")
    public int selectDeptById(int id){
        try {
            int num = deptService.selectDeptById(id);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value="新增部门", notes="新增部门")
    @RequestMapping(value = "/dept/insertDept", method = RequestMethod.POST)
    @ApiImplicitParam(name = "id" ,value = "       " +
            " private int id; //部门id\n" +
            "\n" +
            " private String deptname; //部门名称",
            required = true,dataType = "int",paramType = "dept")
    public int insertDept(Dept dept){
        try {
            int num = deptService.insertDept(dept);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value="根据ID删除部门", notes="根据ID删除部门")
    @RequestMapping(value = "/dept/deleteDeptById", method = RequestMethod.POST)
    @ApiImplicitParam(name = "id" ,value = "id",required = true,dataType = "int",paramType = "int")
    public int deleteDeptById(int id){
        try {
            int num = deptService.deleteDeptById(id);
            return num;
        }catch (Exception e){
            return 0;
        }
    }

    @ApiOperation(value="更新部门", notes="更新部门")
    @RequestMapping(value = "/dept/updateDept", method = RequestMethod.POST)
    @ApiImplicitParam(name = "id" ,value = "       " +
            " private int id; //部门id\n" +
            "\n" +
            " private String deptname; //部门名称",
            required = true,dataType = "int",paramType = "dept")
    public int updateDept(Dept dept){
        try {
            int num = deptService.updateDept(dept);
            return num;
        }catch (Exception e){
            return 0;
        }
    }


}
