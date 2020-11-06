package com.heneng.demo.model;

public class Jud {

    /** 自增主键 */
    private String judId;
    /** 权限名 */
    private String judName;

    public Jud() {

    }

    public Jud(String judId, String judName) {
        this.judId = judId;
        this.judName = judName;
    }



    public void setJudId(String judId) {
        this.judId = judId;
    }

    public String getJudName() {
        return judName;
    }

    public void setJudName(String judName) {
        this.judName = judName;
    }

    @Override
    public String toString() {
        return "Jud{" +
                "judId='" + judId + '\'' +
                ", judName='" + judName + '\'' +
                '}';
    }
}
