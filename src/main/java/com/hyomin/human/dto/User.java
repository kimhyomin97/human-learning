package com.hyomin.human.dto;

public class User {

    private String idx;
    private String userid;
    private String userpw;
    private String email;

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "idx='" + idx + '\'' +
                ", userid='" + userid + '\'' +
                ", userpw='" + userpw + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
