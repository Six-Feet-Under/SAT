package com.heneng.demo.dao;

import com.heneng.demo.model.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptMapper {
    List<Dept> selectAll();

    int selectDeptById(int id);

    int insertDept(Dept dept);

    int deleteDeptById(int id);

    int updateDept(Dept dept);
}
