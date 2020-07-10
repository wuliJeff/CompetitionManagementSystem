package com.cms.entity;

public class License {
    private String competitorId;  //参赛者id
    private String name;  //姓名
    private String teamName;  //团队名
    private String school;  //学校
    private String cid;  //赛事id
    private String cname;  //赛事名称
    private String pid; //赛场id
    private String oid; //赛场秩序册id

    public License() {
    }

    public License(String competitorId, String name, String teamName, String school, String cid, String cname, String pid, String oid) {
        this.competitorId = competitorId;
        this.name = name;
        this.teamName = teamName;
        this.school = school;
        this.cid = cid;
        this.cname = cname;
        this.pid = pid;
        this.oid = oid;
    }

    public String getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(String competitorId) {
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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "License{" +
                "competitorId='" + competitorId + '\'' +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", school='" + school + '\'' +
                ", cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", pid='" + pid + '\'' +
                ", oid='" + oid + '\'' +
                '}';
    }
}
