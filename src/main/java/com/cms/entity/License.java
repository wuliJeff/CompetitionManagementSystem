package com.cms.entity;

public class License {
    private int id;  //id
    private String userId;  //参赛者id
    private String name;  //姓名
    private String groupName;  //团队名
    private String school;  //学校
    private int cid;  //赛事id
    private String cname;  //赛事名称

    public License() {
    }

    public License(int id, String userId, String name, String groupName, String school, int cid, String cname) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.groupName = groupName;
        this.school = school;
        this.cid = cid;
        this.cname = cname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Licence{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                ", school='" + school + '\'' +
                ", cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
