package com.hyomin.human.controller;

import com.hyomin.human.dto.User;
import com.hyomin.human.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

//    @Autowired
//    private UserService userService;
    private final UserService userService;

    @PostMapping("/login") // 로그인 정보 리턴
    public Optional<User> userLogin(@RequestBody User userDto, HttpSession httpSession){
//        System.out.println(userDto);
//        System.out.println(userDto.getUserid());
//        System.out.println("test");
        return userService.userLogin(userDto, httpSession);
    }

}
