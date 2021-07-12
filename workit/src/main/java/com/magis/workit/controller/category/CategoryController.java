package com.magis.workit.controller.category;

import java.util.List;

import com.magis.workit.dto.category.CategoryDto;
import com.magis.workit.service.category.CategoryService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("/")
@RestController
public class CategoryController {
    private static final Logger logger = LogManager.getLogger(CategoryController.class.getName());


    @Autowired
    CategoryService categoryService;

  
    /**
     * 게시판 목록 JSON with categoryName
     * @apiNote http://localhost/category
     */
    @GetMapping("category")
    public List<CategoryDto> getCateList(){
        logger.info("list: "+ categoryService.getCateList());
        return categoryService.getCateList();   
    }

    public void createCate(String CateName){
        categoryService.createCate(CateName);
    }

    public void deleteCate(Integer Cateid, String CateName){
        categoryService.deleteCate(Cateid, CateName);
    }

    public void modifyCate(Integer Cateid){
        categoryService.modifyCate(Cateid);
    }
 
    

}
