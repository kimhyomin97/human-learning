package com.hyomin.human.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String userid;

    @Column(length = 200, nullable = false)
    private String userpw;

    @Builder //
    public User(String userid, String userpw){
        this.userid = userid;
        this.userpw = userpw;
    }
}
