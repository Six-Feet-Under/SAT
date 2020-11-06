package com.heneng.demo.model;

public class Dept {

        private int id; //部门id

        private String deptname; //部门名称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Dept(int id, String deptname) {
        this.id = id;
        this.deptname = deptname;
    }
}
