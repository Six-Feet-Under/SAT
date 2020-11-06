package com.heneng.demo.dao;

import com.heneng.demo.model.Jud;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface JudMapper {

    int insertJud(String user_id,Integer jud_id);

    int deleteByUid(String id) ;

    List<Jud> selectAll();

    Jud selectJudById(String id);

    int updateJud(Jud jud);
}
