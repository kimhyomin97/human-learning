package com.hyomin.human.user;

import com.hyomin.human.dto.User;
import com.hyomin.human.mapper.UserMapper;
import com.hyomin.human.service.UserService;
import com.hyomin.human.service.UserServiceImpl;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@RequiredArgsConstructor
public class UserServiceTest {
    // 테스트 코드의 중요성

//   UserService userService;
    @Autowired
    private UserMapper userMapper;
//    private final UserMapper testMapper;

//    @Test
//    void join(){
//        //given : 이런이런 상황이 주어졌을 때
//        User user = new User("12345", "12345", "12345", "12345@naver.com");
//
//        //when : 이렇게 했을때
//        User findUser = userService.test(user);
//
//        //then : 이렇게 된다
//        Assertions.assertThat(user).isEqualTo(findUser);
//    }

    @Test
    @DisplayName("유저 테스트 성공 : 1234가 반환되어야 한다")
    void login_o() {
        User user = new User("1234", "1234", "1234", "1234");
        System.out.println("TEST ING");
        Optional<User> findUser = userMapper.selectLoginUser(user.getUserid(), user.getUserpw());
        String userid = findUser.get().getUserid();
//        Assertions.assertThat(userid).isEqualTo("1234");
        assertEquals(userid, "1234");
        //Assertions.assertThat 보다는 static import를 쓰는게 더 좋다
    }

    @Test
    @DisplayName("유저 테스트 실패 : ")
    void login_x() {
        User user = new User("1234", "1234", "1234", "1234");
        System.out.println("TEST ING");
        Optional<User> findUser = userMapper.selectLoginUser(user.getUserid(), user.getUserpw());
        String userid = findUser.get().getUserid();
//        Assertions.assertThat(userid).isEqualTo("12345");
        assertEquals(userid, "12345");
    }

}
