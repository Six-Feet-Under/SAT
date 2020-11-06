package com.heneng.demo.model;

public class Jud {

    private int id;
    private String judname;

    public Jud() {

    }

    public Jud(int id, String judname) {
        this.id = id;
        this.judname = judname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudname() {
        return judname;
    }

    public void setJudname(String judname) {
        this.judname = judname;
    }

    @Override
    public String toString() {
        return "Jud{" +
                "id=" + id +
                ", judname='" + judname + '\'' +
                '}';
    }
}
