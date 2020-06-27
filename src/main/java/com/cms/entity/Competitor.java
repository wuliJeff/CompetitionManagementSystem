package com.cms.entity;

public class Competitor {
    private int id;  //id
    private String account;  //账号
    private String password;  //密码
    private String name;  //姓名
    private String groupName;  //团队名
    private String tel;  //电话
    private String school;  //学校
    private int cid;  //赛事id

    public Competitor() {
    }

    public Competitor(int id, String account, String password, String name, String groupName, String tel, String school, int cid) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.groupName = groupName;
        this.tel = tel;
        this.school = school;
        this.cid = cid;
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                ", tel='" + tel + '\'' +
                ", school='" + school + '\'' +
                ", cid=" + cid +
                '}';
    }
}