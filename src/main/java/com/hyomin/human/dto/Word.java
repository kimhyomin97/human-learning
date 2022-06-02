package com.hyomin.human.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Word {
    private String eng;
    private String kor;

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getKor() {
        return kor;
    }

    public void setKor(String kor) {
        this.kor = kor;
    }

    @Override
    public String toString() {
        return "WordDto{" +
                "eng='" + eng + '\'' +
                ", kor='" + kor + '\'' +
                '}';
    }
}
