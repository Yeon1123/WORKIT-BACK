package com.magis.workit.controller.board;

import java.util.List;

import javax.validation.Valid;

import com.magis.workit.dto.board.BoardDto;
import com.magis.workit.service.board.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

  
    /**
     * 게시판 목록 JSON with categoryName
     * @apiNote http://localhost/api/board
     */
    @GetMapping("/board")
    public List<BoardDto> getBoardList(){
        System.out.println(boardService.getBoardList());
        return boardService.getBoardList();
        
    }

    @PostMapping("/board")
    public void createBoardContent(
        @Valid @RequestBody BoardDto boardDto
    ){
         boardService.createBoard(boardDto);
    }

}
