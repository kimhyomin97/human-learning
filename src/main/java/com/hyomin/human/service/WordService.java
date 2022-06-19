package com.hyomin.human.service;

import com.hyomin.human.dto.Word;

import java.util.List;

public interface WordService {
    List<Word> selectAll(String target, String checkid);
    void updateCheck(String wordid, String userid);
}
