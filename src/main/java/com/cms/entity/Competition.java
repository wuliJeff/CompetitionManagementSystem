package com.cms.entity;

public class Competition {
    private int cid;  //赛事id
    private String cname;  //赛事名称
    private String hostName;  //发起人
    private String school;  //学校
    private String type;  //赛事类型
    private int cnum;  //赛事人数
    private int gunm;  //小组人数
    private String startCompetition;  //比赛开始时间
    private String endCompetition;  //比赛结束时间
    private String enrollStartTime;  //比赛报名开始时间
    private String enrollEndTime;  //比赛报名结束时间

    public Competition() {
    }

    public Competition(int cid, String cname, String hostName, String school, String type, int cnum, int gunm, String startCompetition, String endCompetition, String enrollStartTime, String enrollEndTime) {
        this.cid = cid;
        this.cname = cname;
        this.hostName = hostName;
        this.school = school;
        this.type = type;
        this.cnum = cnum;
        this.gunm = gunm;
        this.startCompetition = startCompetition;
        this.endCompetition = endCompetition;
        this.enrollStartTime = enrollStartTime;
        this.enrollEndTime = enrollEndTime;
    }

    public Competition(String cname, String hostName, String school, String type, int cnum, int gunm, String startCompetition, String endCompetition, String enrollStartTime, String enrollEndTime) {
        this.cname = cname;
        this.hostName = hostName;
        this.school = school;
        this.type = type;
        this.cnum = cnum;
        this.gunm = gunm;
        this.startCompetition = startCompetition;
        this.endCompetition = endCompetition;
        this.enrollStartTime = enrollStartTime;
        this.enrollEndTime = enrollEndTime;
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

    public String getHost() {
        return hostName;
    }

    public void setHost(String host) {
        this.hostName = host;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    public int getGunm() {
        return gunm;
    }

    public void setGunm(int gunm) {
        this.gunm = gunm;
    }

    public String getStartCompetition() {
        return startCompetition;
    }

    public void setStartCompetition(String startCompetition) {
        this.startCompetition = startCompetition;
    }

    public String getEndCompetition() {
        return endCompetition;
    }

    public void setEndCompetition(String endCompetition) {
        this.endCompetition = endCompetition;
    }

    public String getEnrollStartTime() {
        return enrollStartTime;
    }

    public void setEnrollStartTime(String enrollStartTime) {
        this.enrollStartTime = enrollStartTime;
    }

    public String getEnrollEndTime() {
        return enrollEndTime;
    }

    public void setEnrollEndTime(String enrollEndTime) {
        this.enrollEndTime = enrollEndTime;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", host='" + hostName + '\'' +
                ", school='" + school + '\'' +
                ", type='" + type + '\'' +
                ", cnum=" + cnum +
                ", gunm=" + gunm +
                ", startCompetition='" + startCompetition + '\'' +
                ", endCompetition='" + endCompetition + '\'' +
                ", enrollStartTime='" + enrollStartTime + '\'' +
                ", enrollEndTime='" + enrollEndTime + '\'' +
                '}';
    }
}
