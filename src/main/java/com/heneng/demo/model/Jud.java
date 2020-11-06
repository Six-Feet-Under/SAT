package com.heneng.demo.model;

public class Jud {

    private int id;  //自增主键
    private int user_id;  //用户的uid
    private int jud_id;  //权限的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getJud_id() {
        return jud_id;
    }

    public void setJud_id(int jud_id) {
        this.jud_id = jud_id;
    }
}
