package com.hyomin.human.service;

import com.hyomin.human.dto.User;

import javax.servlet.http.HttpSession;
import java.util.Map;

public class UserServiceImpl implements UserService{

    @Override
    public Map<String, Object> userLogin(User userDto, HttpSession httpSession) {
        return null;
    }
}
