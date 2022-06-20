package com.hyomin.human.user;

import com.hyomin.human.dto.User;
import com.hyomin.human.service.UserService;
import com.hyomin.human.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@RequiredArgsConstructor
public class UserServiceTest {
    // 테스트 코드의 중요성

   UserService userService;

    @Test
    void join(){
        //given : 이런이런 상황이 주어졌을 때
        User user = new User("12345", "12345", "12345", "12345@naver.com");

        //when : 이렇게 했을때
        User findUser = userService.test(user);

        //then : 이렇게 된다
        Assertions.assertThat(user).isEqualTo(findUser);
    }
}
