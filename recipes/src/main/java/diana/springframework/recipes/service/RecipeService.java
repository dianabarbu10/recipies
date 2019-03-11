package diana.springframework.recipes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import diana.springframework.recipes.model.Recipe;

@Service
public interface RecipeService {
	public List<Recipe> getRecipes();
}
