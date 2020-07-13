package com.cms.entity;

public class Information {
    String licenseId;
    String competitorId;
    String cid;
    String pid;
    String name;
    String teamname;
    String cname;
    String pname;
    String pnum;
    String manager;
    String seat;
    float grade;

    public Information(String licenseId, String competitorId, String cid, String pid, String name, String teamname, String cname, String pname, String pnum, String manager, String seat, float grade) {
        this.licenseId = licenseId;
        this.competitorId = competitorId;
        this.cid = cid;
        this.pid = pid;
        this.name = name;
        this.teamname = teamname;
        this.cname = cname;
        this.pname = pname;
        this.pnum = pnum;
        this.manager = manager;
        this.seat = seat;
        this.grade = grade;
    }

    public Information() {
    }

    @Override
    public String toString() {
        return "Information{" +
                "licenseId='" + licenseId + '\'' +
                ", competitorId='" + competitorId + '\'' +
                ", cid='" + cid + '\'' +
                ", pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", teamname='" + teamname + '\'' +
                ", cname='" + cname + '\'' +
                ", pname='" + pname + '\'' +
                ", pnum='" + pnum + '\'' +
                ", manager='" + manager + '\'' +
                ", seat='" + seat + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(String competitorId) {
        this.competitorId = competitorId;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPnum() {
        return pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
