package com.magis.workit.service.category;

import java.util.List;

import com.magis.workit.dto.category.CategoryDto;
import com.magis.workit.mapper.category.CategoryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired 
    CategoryMapper categoryMapper;

    public List<CategoryDto> getCateList(){
        return categoryMapper.getCateList();
    }



}
