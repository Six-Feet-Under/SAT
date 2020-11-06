package com.heneng.demo.service;

import com.heneng.demo.model.Jud;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JudService {
    int insertJud(String user_id,Integer jud_id);

    int deleteByUid(String id);

    List<Jud> selectAll();

    Jud selectJudByUid(String  id);

    int updateJud(Jud jud);
}
