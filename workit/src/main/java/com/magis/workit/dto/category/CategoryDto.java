package com.magis.workit.dto.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;



@Getter
@Data
@AllArgsConstructor
public class CategoryDto {
    public Integer cateId;
    public String cateName;
}
