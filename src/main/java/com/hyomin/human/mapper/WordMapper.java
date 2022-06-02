package com.hyomin.human.mapper;

import com.hyomin.human.dto.Word;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WordMapper {
    @Select("SELECT * FROM word")
//    Optional<WordDto> selectAll();
    List<Word> selectAll();
}
