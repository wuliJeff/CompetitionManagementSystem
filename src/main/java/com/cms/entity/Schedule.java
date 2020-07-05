package com.cms.entity;

public class Schedule {
    private int cid;
    private int competitorId;  //参赛者id
    private int pid;  //赛场id
    private String seat;  //座位号
    private float grade;  //成绩

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(int competitorId) {
        this.competitorId = competitorId;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
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
                "cid=" + cid +
                ", competitorId=" + competitorId +
                ", pid=" + pid +
                ", seat=" + seat +
                ", grade=" + grade +
                '}';
    }
}
