package com.cms.entity;

public class Schedule {
    int competitorId;
    int pid;
    String seat;
    float grade;

    public Schedule(int competitorId, int pid, String seat, float grade) {
        this.competitorId = competitorId;
        this.pid = pid;
        this.seat = seat;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "competitorId=" + competitorId +
                ", pid=" + pid +
                ", seat='" + seat + '\'' +
                ", grade=" + grade +
                '}';
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
}
