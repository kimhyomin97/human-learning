package com.hyomin.human.service;

import com.hyomin.human.dto.WordDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WordService {
    List<WordDto> selectAll();
}
