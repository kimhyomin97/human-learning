package com.hyomin.human.mapper;

import com.hyomin.human.dto.WordDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface WordMapper {
    @Select("SELECT * FROM word")
//    Optional<WordDto> selectAll();
    List<WordDto> selectAll();
}
