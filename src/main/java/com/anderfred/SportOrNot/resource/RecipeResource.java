package com.anderfred.SportOrNot.resource;

import com.anderfred.SportOrNot.aop.LogAOP;
import com.anderfred.SportOrNot.mapper.RecipeMapper;
import com.anderfred.SportOrNot.model.Recipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/recipe")
public class RecipeResource {
    private RecipeMapper recipeMapper;

    public RecipeResource(RecipeMapper recipeMapper) {
        this.recipeMapper = recipeMapper;
    }

    @GetMapping("/all")
    @LogAOP
    List<Recipe> getRecipes() {
        return recipeMapper.findAll();
    }
}
