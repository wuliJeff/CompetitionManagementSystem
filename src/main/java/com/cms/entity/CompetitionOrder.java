package com.cms.entity;

public class CompetitionOrder {
    private String oid;  //赛场秩序册oid
    private String cid;  //赛事id
    private String title;  //标题
    private String detail;  //详情

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "CompetitionOrder{" +
                "oid='" + oid + '\'' +
                ", cid='" + cid + '\'' +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
