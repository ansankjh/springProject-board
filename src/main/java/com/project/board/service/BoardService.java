package com.project.board.service;

import com.project.board.mapper.BoardMapper;
import com.project.board.vo.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class BoardService {
    @Autowired
    private BoardMapper boardMapper;

    @Transactional
    public void createBoard(Board board) {
        log.info("\u001B[44m"+"boardService : {}", board);
        boardMapper.insertBoard(board);
    }
}
