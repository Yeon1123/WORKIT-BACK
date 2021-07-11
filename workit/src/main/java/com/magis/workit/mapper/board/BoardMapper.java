package com.magis.workit.mapper.board;

import java.util.List;

import com.magis.workit.dto.board.BoardDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    List<BoardDto> getBoardList();

    void createBoard(BoardDto boardDto);

    void updateBoard();
    void deleteBoard();
}
