package com.hyomin.human.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String idx;
    private String userid;
    private String userpw;
    private String email;

    public User(String idx, String userid, String userpw, String email) {
        this.idx = idx;
        this.userid = userid;
        this.userpw = userpw;
        this.email = email;
    }
}
