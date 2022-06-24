package com.hyomin.human.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private int articleno;
    private String userid;
    private String title;
    private String content;
    private int hit;
    private String timestamp;
}
