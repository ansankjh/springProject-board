package com.project.board.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    // 게시판 메인 페이지
    @GetMapping("/board")
    public String board() {
        return "/board";
    }

    @GetMapping("/board/createBoard")
    public String createBoard() {
        return "/createBoard";
    }
}