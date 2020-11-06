package com.heneng.demo.service;

import com.heneng.demo.model.Jud;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface JudService {
    void insertJud(Jud jud);

    void deleteByUid(String id);

    List<Jud> selectAll();

    Jud selectJudByUid(String  id);

    void updateJudByUid(String id);
}
