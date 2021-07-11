package com.magis.workit.mapper.category;

import java.util.List;

import com.magis.workit.dto.category.CategoryDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {

    public List<CategoryDto> getCateList();

    public void createCate(String CateName);

    public void modifyCate(Integer Cateid, String CateName);

    public void deleteCate(Integer Cateid);

}
