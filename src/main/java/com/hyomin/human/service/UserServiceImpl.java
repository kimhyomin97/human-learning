package com.hyomin.human.service;

import com.hyomin.human.dto.User;
import com.hyomin.human.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

//    @Autowired
//    private UserMapper userMapper;
    private final UserMapper userMapper;

    @Override
    public Optional<User> userLogin(User userDto, HttpSession httpSession) {
        Map<String, Object> loginResult = new HashMap<>();
        return userMapper.selectLoginUser(userDto.getUserid(), userDto.getUserpw());
    }

    public User test(User userDto){
        return userDto;
    }
}
