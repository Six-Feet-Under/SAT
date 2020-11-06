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
    public void deleteByUid(String id) {
        judMapper.deleteByUid(id);
    }

    @Override
    public List<Jud> selectAll() {
        return judMapper.selectAll();
    }

    @Override
    public Jud selectJudByUid(String id) {
        return judMapper.selectJudById(id);
    }

    @Override
    public void updateJudByUid(String id) {
        judMapper.updateJudByUid(id);
    }
}
