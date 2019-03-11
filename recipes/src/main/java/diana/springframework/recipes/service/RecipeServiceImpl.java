package diana.springframework.recipes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import diana.springframework.recipes.model.Recipe;
import diana.springframework.recipes.repositories.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;

	public List<Recipe> getRecipes() {
		List<Recipe> recipes = new ArrayList<>();
		recipeRepository.findAll().forEach(r -> recipes.add(r));
		return recipes;
	}
}
