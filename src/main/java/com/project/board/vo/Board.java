package com.project.board.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {
    private int boardId;
    private String title;
    private String content;
    private String writer;
    private Integer viewCnt;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}