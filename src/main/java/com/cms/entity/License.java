package com.cms.entity;

public class License {
    private String competitorId;  //参赛者id
    private String name;  //姓名
    private String teamName;  //团队名

    private String cid;  //赛事id
    private String cname;  //赛事名称
    private String pid; //赛场id
    private String LicenseId;
    private String oid;
    public License() {
    }

    public String getLicenseId() {
        return LicenseId;
    }

    public void setLicenseId(String licenseId) {
        LicenseId = licenseId;
    }

    public License(String competitorId, String name, String teamName, String cid, String cname, String pid, String licenseId) {
        this.competitorId = competitorId;
        this.name = name;
        this.teamName = teamName;
        this.cid = cid;
        this.cname = cname;
        this.pid = pid;
        LicenseId = licenseId;
    }

    public License(String competitorId, String name, String teamName, String cid, String cname, String pid) {
        this.competitorId = competitorId;
        this.name = name;
        this.teamName = teamName;

        this.cid = cid;
        this.cname = cname;
        this.pid = pid;

    }

    public License(String competitorId, String name, String teamName, String cid, String cname, String pid, String licenseId, String oid) {
        this.competitorId = competitorId;
        this.name = name;
        this.teamName = teamName;
        this.cid = cid;
        this.cname = cname;
        this.pid = pid;
        LicenseId = licenseId;
        this.oid = oid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
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



    @Override
    public String toString() {
        return "License{" +
                "competitorId='" + competitorId + '\'' +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +

                ", cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", pid='" + pid + '\'' +
                '}';
    }
}
