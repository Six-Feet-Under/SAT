package com.heneng.demo.service;

import com.heneng.demo.dao.JudMapper;
import com.heneng.demo.model.Jud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JudServiceImpl implements JudService{

    @Autowired
    public JudMapper judMapper;

    @Override
    public int insertJud(Jud jud) {
         return judMapper.insertJud(jud);
    }

    @Override
    public int deleteById(int id) {
        return judMapper.deleteById(id);
    }

    @Override
    public List<Jud> selectAll() {
        return judMapper.selectAll();
    }

    @Override
    public Jud selectJudByUid(int id) {
        return judMapper.selectJudById(id);
    }

    @Override
    public int updateJud(Jud jud) {
        return judMapper.updateJud(jud);
    }
}
