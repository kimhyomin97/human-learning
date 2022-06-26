package com.hyomin.human.xml;

import com.hyomin.human.service.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class XmlAppContext {
//  xml은 잘 쓰이진 않지만, 한번쯤 읽어보고 넘어가는게 좋다
    @Test
    void xmlAppContext(){
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        UserService userService = ac.getBean("userService", UserService.class);
//        Assertions.assertThat(userService).isInstan
        Assertions.assertThat(userService).isInstanceOf(UserService.class);
    }
}
