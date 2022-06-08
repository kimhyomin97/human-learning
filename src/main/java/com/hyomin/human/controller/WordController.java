package com.hyomin.human.controller;

import com.hyomin.human.dto.Word;
import com.hyomin.human.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/word")
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

    @GetMapping("/hello")
    public String hello(){
        return "hello from rest controller";
    }

    @GetMapping("/wordall")
    public List<Word> wordall(){
        List<Word> wordAll = wordService.selectAll();
        for(int i=0; i<wordAll.size(); i++){
//            System.out.println(wordAll.get(i));
        }
        return wordAll;
    }
}
