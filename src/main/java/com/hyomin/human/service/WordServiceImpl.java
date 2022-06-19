package com.hyomin.human.service;

import com.hyomin.human.dto.Word;
import com.hyomin.human.mapper.WordMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordMapper wordMapper;

    @Override
    public List<Word> selectAll(String target, String checkid) {
        return wordMapper.selectAll(target, checkid);
    }

    @Override
    public void updateCheck(String wordid, String userid) {
        wordMapper.updateCheck(wordid, userid);
    }
}
