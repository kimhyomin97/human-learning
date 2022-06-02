package com.hyomin.human.controller;

import com.hyomin.human.dto.User;
import com.hyomin.human.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login") // 로그인 정보 리턴
    public Map<String, Object> userLogin(User userDto, HttpSession httpSession){
        return userService.userLogin(userDto, httpSession);
    }

}
