package com.heneng.demo.service;

import com.heneng.demo.dao.DeptMapper;
import com.heneng.demo.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    public DeptMapper deptMapper;

    @Override
    public List<Dept> selectAll() {
        return deptMapper.selectAll();
    }

    @Override
    public int selectDeptById(int id) {
        return deptMapper.selectDeptById(id);
    }

    @Override
    public int insertDept(Dept dept) {
        return deptMapper.insertDept(dept);
    }

    @Override
    public int deleteDeptById(int id) {
        return deptMapper.deleteDeptById(id);
    }

    @Override
    public int updateDept(Dept dept) {
        return deptMapper.updateDept(dept);
    }
}
