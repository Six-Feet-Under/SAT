package com.heneng.demo.service;

import com.heneng.demo.dao.JudMapper;
import com.heneng.demo.model.Jud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JudServiceImpl implements JudService{

    @Autowired
    JudMapper judMapper;

    @Override
    public int insertJud(String user_id,Integer jud_id) {
         return judMapper.insertJud(user_id,jud_id);
    }

    @Override
    public int deleteByUid(String id) {
        return judMapper.deleteByUid(id);
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
    public int updateJud(Jud jud) {
        return judMapper.updateJud(jud);
    }
}
