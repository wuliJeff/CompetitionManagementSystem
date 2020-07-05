package com.cms.entity;

public class CompetitionOrder {
    private int oid;  //赛场秩序册oid
    private int cid;  //赛事id
    private String title;  //标题
    private String detail;  //详情

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
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
                "oid=" + oid +
                ", cid=" + cid +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
