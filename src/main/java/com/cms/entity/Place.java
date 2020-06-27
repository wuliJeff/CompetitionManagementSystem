package com.cms.entity;

public class Place {
    private int pid;  //赛场id
    private String school;  //学校
    private String pname;  //教学楼
    private String pnum;  //教室编号
    private int cid;  //赛事id
    private int csize;  //教室容量

    public Place() {
    }

    public Place(int pid, String school, String pname, String pnum, int cid, int csize) {
        this.pid = pid;
        this.school = school;
        this.pname = pname;
        this.pnum = pnum;
        this.cid = cid;
        this.csize = csize;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCsize() {
        return csize;
    }

    public void setCsize(int csize) {
        this.csize = csize;
    }

    @Override
    public String toString() {
        return "Place{" +
                "pid=" + pid +
                ", school='" + school + '\'' +
                ", pname='" + pname + '\'' +
                ", pnum='" + pnum + '\'' +
                ", cid=" + cid +
                ", csize=" + csize +
                '}';
    }
}
