package com.magis.workit.controller.category;

import java.util.List;

import com.magis.workit.dto.category.CategoryDto;
import com.magis.workit.service.category.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

  
    /**
     * 게시판 목록 JSON with categoryName
     * @apiNote http://localhost/category
     */
    @GetMapping("category")
    public List<CategoryDto> getCateList(){
        System.out.println(categoryService.getCateList());
        return categoryService.getCateList();
        
    }

}
