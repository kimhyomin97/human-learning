package com.hyomin.human.service;

import com.hyomin.human.dto.WordDto;
import com.hyomin.human.mapper.WordMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordMapper wordMapper;

    @Override
    public List<WordDto> selectAll() {
        return wordMapper.selectAll();
    }
}
