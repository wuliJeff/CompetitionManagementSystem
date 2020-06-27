package com.cms.entity;

public class CompetitionOrder {
    private int id;  //id
    private int cid;  //赛事id
    private String title;  //标题
    private String detail;  //详情

    public CompetitionOrder() {
    }

    public CompetitionOrder(int id, int cid, String title, String detail) {
        this.id = id;
        this.cid = cid;
        this.title = title;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", cid=" + cid +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
