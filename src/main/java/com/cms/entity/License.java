package com.cms.entity;

public class License {
    private int competitorId;  //参赛者id
    private String name;  //姓名
    private String teamName;  //团队名
    private String school;  //学校
    private int cid;  //赛事id
    private String cname;  //赛事名称
    private int pid; //赛场id
    private int oid; //赛场秩序册id

    public int getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(int competitorId) {
        this.competitorId = competitorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
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

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "License{" +
                "competitorId=" + competitorId +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", school='" + school + '\'' +
                ", cid=" + cid +
                ", cname='" + cname + '\'' +
                ", pid=" + pid +
                ", oid=" + oid +
                '}';
    }
}
