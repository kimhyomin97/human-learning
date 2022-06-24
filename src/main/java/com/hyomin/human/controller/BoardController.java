package com.hyomin.human.controller;

import com.hyomin.human.dto.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

//    @GetMapping
//    public List<Board> selectAllArticle(){
//     //    프론트에서 넘겨준 검색 데이터에 따라서 알맞는 게시글 리스트를 디비에서 꺼내오도록 리턴
//        return
//    }
}
