package com.heneng.demo.dao;

import com.heneng.demo.model.Jud;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface JudMapper {

    int insertJud(Jud jud);

    int deleteById(String id) ;

    List<Jud> selectAll();

    Jud selectJudById(String id);

    int updateJud(Jud jud);
}
