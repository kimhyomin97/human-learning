package com.hyomin.human.controller;

import com.hyomin.human.dto.Word;
import com.hyomin.human.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/word")
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;

    @GetMapping("/wordlist")
    public List<Word> wordList(@RequestParam(value="target") String target, @RequestParam(value="checkid") String checkid){
//        System.out.println(target);
//        System.out.println(checkid);
        List<Word> wordlist = wordService.selectAll(target, checkid);
        return wordlist;
    }

    @PostMapping("/wordcheck")
    public String wordCheck(@RequestBody Word wordDto){
        System.out.println(wordDto.getWordid());
        System.out.println(wordDto.getUserid());
        wordService.updateCheck(wordDto.getWordid(), wordDto.getUserid());
        return "success";
    }
}
