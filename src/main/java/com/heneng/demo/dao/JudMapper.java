package com.heneng.demo.dao;

import com.heneng.demo.model.Jud;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface JudMapper {

    void insertJud(Jud jud);

    void deleteByUid(String id);

    List<Jud> selectAll();

    Jud selectJudById(String id);

    void updateJudByUid(String id);
}
