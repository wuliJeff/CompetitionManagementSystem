package com.cms.entity;

public class Schedule {
    private String cid;
    private String competitorId;  //参赛者id
    private String pid;  //赛场id
    private String seat;  //座位号
    private float grade;  //成绩

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(String competitorId) {
        this.competitorId = competitorId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
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

    @Override
    public String toString() {
        return "Schedule{" +
                "cid='" + cid + '\'' +
                ", competitorId='" + competitorId + '\'' +
                ", pid='" + pid + '\'' +
                ", seat='" + seat + '\'' +
                ", grade=" + grade +
                '}';
    }
}
