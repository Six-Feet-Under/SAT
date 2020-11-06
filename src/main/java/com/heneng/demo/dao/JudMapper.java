package com.heneng.demo.dao;

import com.heneng.demo.model.Jud;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface JudMapper {
    void insertJud(Jud jud);

    void deleteById(int id);

    List<Jud> selectAll(Map map);

    Jud selectJudById(int id);

    void updateJudById(int id);
}
