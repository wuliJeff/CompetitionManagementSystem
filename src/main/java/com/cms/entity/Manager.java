package com.cms.entity;

public class Manager {
    private int id;  //id
    private String account;  //账号
    private String password;  //密码
    private String name;  //姓名
    private String tel;   //电话
    private String school;  //学校
    private int pid;  //赛场id

    public Manager() {
    }

    public Manager(int id, String account, String password, String name, String tel, String school, int pid) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.tel = tel;
        this.school = school;
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", school='" + school + '\'' +
                ", pid=" + pid +
                '}';
    }
}
