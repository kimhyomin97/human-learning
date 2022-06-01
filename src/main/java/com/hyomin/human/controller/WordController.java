package com.hyomin.human.controller;

import com.hyomin.human.dto.WordDto;
import com.hyomin.human.service.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
//@RequestMapping
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

    @GetMapping("/hello")
    public String hello(){
        return "hello from rest controller";
    }

    @GetMapping("/wordall")
    public List<WordDto> wordall(){
        List<WordDto> wordAll = wordService.selectAll();
        for(int i=0; i<wordAll.size(); i++){
            System.out.println(wordAll.get(i));
        }
        return wordAll;
    }
}
