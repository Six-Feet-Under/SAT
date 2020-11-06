package com.heneng.demo.dao;

import com.heneng.demo.model.Jud;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JudMapper {

    public int insertJud(String user_id,Integer jud_id);

    public int deleteByUid(String id) ;

    List<Jud> selectAll();

    Jud selectJudById(String id);

    int updateJud(Jud jud);
}
