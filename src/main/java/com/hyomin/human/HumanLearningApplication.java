package com.hyomin.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class HumanLearningApplication {
	// 영단어 DB 구축하고, 단어 빈칸 문제 제시하기
	// 영어로 된 사이트 크롤링해서 단어부분 빈칸 뚫어놓고 맞추는 문제
	// 자막 영어버전, 한글버전 크롤링해서 영어버전 읽고 해석 유추하는 문제
	public static void main(String[] args) {
		SpringApplication.run(HumanLearningApplication.class, args);
	}


}
