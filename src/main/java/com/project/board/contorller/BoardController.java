package com.project.board.contorller;


import com.project.board.service.BoardService;
import com.project.board.vo.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired private BoardService boardService;

    
    // 글삭제 액션
    

    // 글수정 폼
    @GetMapping("/updateBoard")
    public String updateBoard() {
        return "/updateBoard";
    }

    // 글수정 액션

    // 글작성 폼
    @GetMapping("/createBoard")
    public String createBoard() {
        return "/createBoard";
    }

    // 글작성 액션
    @PostMapping("/createBoard")
    public String createaBoard(Board board) {
        log.info("\u001B[31m"+ "boardController : {} ", board);
        boardService.createBoard(board);
        return "redirect:/board";
    }

    // 게시판 메인 페이지
    @GetMapping()
    public String board() {
        return "/board";
    }
}