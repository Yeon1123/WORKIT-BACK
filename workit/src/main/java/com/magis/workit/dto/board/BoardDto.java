package com.magis.workit.dto.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
    private Integer contentId;
    private Integer cateId;
    private String cateName;
    private String title;
    private String content;
    private String writer;
    private String writeDate;
}
