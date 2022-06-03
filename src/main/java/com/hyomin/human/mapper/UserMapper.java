package com.hyomin.human.mapper;

import com.hyomin.human.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM member WHERE userid = #{userid} and userpw = #{userpw}")
    Optional<User> selectLoginUser(String userid, String userpw);
}
