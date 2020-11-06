package com.heneng.demo.service;

import com.heneng.demo.dao.JudMapper;
import com.heneng.demo.model.Jud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JudServiceImpl implements JudService{

    @Autowired
    private JudMapper judMapper;

    @Override
    public void insertJud(Jud jud) {
        judMapper.insertJud(jud);
    }

    @Override
    public void deleteById(int id) {
        judMapper.deleteById(id);
    }

    @Override
    public List<Jud> selectAll(Map map) {
        return judMapper.selectAll(map);
    }

    @Override
    public Jud selectJudById(int id) {
        return judMapper.selectJudById(id);
    }

    @Override
    public void updateJudById(int id) {
        judMapper.updateJudById(id);
    }
}
