package com.magis.workit.service.board;

import java.util.List;

import com.magis.workit.dto.board.BoardDto;
import com.magis.workit.mapper.board.BoardMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    
    @Autowired 
    BoardMapper boardMapper;

    public List<BoardDto> getBoardList (){
        return boardMapper.getBoardList ();
    }
}
