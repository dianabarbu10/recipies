package diana.springframework.recipes.service;

import java.util.Set;

import diana.springframework.recipes.model.Recipe;

public interface RecipeService {
	public Set<Recipe> getRecipes();
}
