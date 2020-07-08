package com.cms.entity;

public class Place {
    private String pid;  //赛场id
    private String school;  //学校
    private String pname;  //教学楼
    private String pnum;  //教室编号
    private String cid;  //赛事id
    private String csize;  //教室容量
    private String manager;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCsize() {
        return csize;
    }

    public void setCsize(String csize) {
        this.csize = csize;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Place{" +
                "pid='" + pid + '\'' +
                ", school='" + school + '\'' +
                ", pname='" + pname + '\'' +
                ", pnum='" + pnum + '\'' +
                ", cid='" + cid + '\'' +
                ", csize='" + csize + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }
}
