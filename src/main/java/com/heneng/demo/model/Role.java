package com.heneng.demo.model;

public class Role {
    private int id;  //自增主键id
    private String user_id;  //用户的uid
    private int role_id;  //角色的id

    public Role(String user_id, int role_id) {
        this.user_id = user_id;
        this.role_id = role_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", role_id=" + role_id +
                '}';
    }
}
