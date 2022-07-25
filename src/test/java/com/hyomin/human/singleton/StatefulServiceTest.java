package com.hyomin.human.singleton;

import org.apache.catalina.core.ApplicationContext;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        // 시나리오 : A가 주문을 하고 조회를 하기전에 B가 끼어들어온 상황
        
        // ThreadA : A 사용자 10000원 주문
        int userAPrice = statefulService1.order("userA", 10000);
        // 지역변수기 대문에 문제 해결
        // ThreadB : B 사용자 20000원 주문
        int userBPrice = statefulService2.order("userB", 20000);

        // ThreadA : 사용자A 주문 금액 조회
//        int price = statefulService1.getPrice();
        System.out.println("price = " + userAPrice); // 10000원이 아니라 20000원이 나온다

//        Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);
    } // 이런식으로 무상태(stateless)로 문제를 해결해라

    static class TestConfig{

        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }
}