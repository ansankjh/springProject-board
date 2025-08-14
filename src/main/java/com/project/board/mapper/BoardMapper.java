package com.project.board.mapper;

import com.project.board.vo.Board;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    void insertBoard(Board board);
}
