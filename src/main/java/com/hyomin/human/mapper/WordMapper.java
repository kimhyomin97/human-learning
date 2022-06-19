package com.hyomin.human.mapper;

import com.hyomin.human.dto.Word;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface WordMapper {
    @Select("SELECT * FROM word left join wordcheck on wordcheck.userid = #{checkid} and word.id = wordcheck.wordid") // where type = #{target}
//    Optional<WordDto> selectAll();
    List<Word> selectAll(String target, String checkid); // target에 해당하는 테이블을 읽어오도록 수정
    // word 테이블 수정 -> 각 단어들이 소속되는 그룹에 대한 칼럼이 필요함
    // ex) 토익에 관련된 단어들이라면 토익 단어 테이블을 만드는게 아니라 속성 칼럼을 toeic 혹은 번호로 설정
    // 번호로 설정할 시 번호에 대한 테이블이 더 필요하다

    @Update("INSERT INTO wordcheck  (`wordid`, `userid`) VALUES (#{wordid}, #{userid})")
    void updateCheck(String wordid, String userid);
}
