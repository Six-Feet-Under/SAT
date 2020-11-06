package com.heneng.demo.model;

public class Role {
    private Integer id;  //自增主键id
    private String rolename;  //角色的名称

    public Role() {
    }

    public Role(Integer id, String rolename) {
        this.id = id;
        this.rolename = rolename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

//    @Override
//    public String toString() {
//        return "Role{" +
//                "id='" + id + '\'' +
//                ", role='" + rolename + '\'' +
//                '}';
//    }
}
