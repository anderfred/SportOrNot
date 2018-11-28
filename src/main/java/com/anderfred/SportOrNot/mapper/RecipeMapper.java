package com.anderfred.SportOrNot.mapper;

import com.anderfred.SportOrNot.model.Recipe;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RecipeMapper {
    @Select("select * from recipe")
    List<Recipe> findAll();
}
