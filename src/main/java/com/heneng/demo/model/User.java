package com.heneng.demo.model;

public class User {

    private long id; //自增主键 id

    private String uid; //id

    private String userName; //名字

    private String account; //长账户

    private String passWord; //密码

    private String upwdb; //加密后密码（B钥）

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String uPwd) {
        this.passWord = uPwd;
    }

    public String getUpwdb() {
        return upwdb;
    }

    public void setUpwdb(String uPudB) {
        this.upwdb = uPudB;
    }

    public User(long id, String uid, String userName, String account, String passWord, String upwdb) {
        this.id = id;
        this.uid = uid;
        this.userName = userName;
        this.account = account;
        this.passWord = passWord;
        this.upwdb = upwdb;
    }

    public User(){
        super();
    }
}
