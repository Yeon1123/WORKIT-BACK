package com.magis.workit.mapper.category;

import java.util.List;

import com.magis.workit.dto.category.CategoryDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    List<CategoryDto> getCateList();
}
