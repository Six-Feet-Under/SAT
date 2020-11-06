package com.heneng.demo.service;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JudService {
    void insertJud(Jud jud);

    void deleteByUid(String id);

    List<Jud> selectAll();

    Jud selectJudByUid(String  id);

    void updateJudByUid(String id);
}
