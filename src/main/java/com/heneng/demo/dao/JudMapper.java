package com.heneng.demo.dao;

import com.heneng.demo.model.Jud;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JudMapper {

    public void insertJud(Jud jud);

    public void deleteByUid(String id) ;

    List<Jud> selectAll();

    Jud selectJudById(String id);

    void updateJudByUid(String id);
}
