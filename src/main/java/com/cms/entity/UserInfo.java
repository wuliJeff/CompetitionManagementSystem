package com.cms.entity;

public class UserInfo {

    /**
     * 用于接收用户登录信息
     */

    private String account;
    private String password;
    private String tel;
    private int role;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", role=" + role +
                '}';
    }
}
