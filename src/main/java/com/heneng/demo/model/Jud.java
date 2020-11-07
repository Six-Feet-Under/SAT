package com.heneng.demo.model;

public class Jud {

    private Integer id;  //自增主键
    private String  judname;  //权限的名称

    public Jud() {
    }

    public Jud(Integer id, String judname) {
        this.id = id;
        this.judname = judname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJudname() {
        return judname;
    }

    public void setJudname(String judname) {
        this.judname = judname;
    }

//    @Override
//    public String toString() {
//        return "Jud{" +
//                "id=" + id +
//                ", judname='" + judname + '\'' +
//                '}';
//    }
}
