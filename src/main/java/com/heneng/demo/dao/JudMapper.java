package com.heneng.demo.dao;

import com.heneng.demo.entity.Jud;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface JudMapper {
    void insertJud(Jud jud);

    void deleteById(int id);

    List<Jud> selectAll(Map map);

    Jud selectJudById(int id);

    void updateJudById(int id);
}